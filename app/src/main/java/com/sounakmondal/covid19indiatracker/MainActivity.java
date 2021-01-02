package com.sounakmondal.covid19indiatracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    String testURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testURL = new mURLBuilder().getRawData(2);


    /*
        //---TEST TO CHECK IF URL IS BUILD CORRECTLY---
        try {
            testURL = new mURLBuilder().getRawData(2);
            Log.i("------ URL ------",testURL);
        }catch (Exception e){e.printStackTrace();}
        //---TEST SUCCESSFUL---------------------------
    */


    }


    /**---Class to get required URL---**/
    /**---URL = baseURL + Extension + (ONLY IN SPECIFIC CASES) Numerical Suffix + finalExtension---**/
    public class mURLBuilder
    {

        String baseURL = Credentials.getBaseURL();
        String finalExtension = Credentials.getFinalExtension();
        String extension;


        protected String getRawData(int index){extension = Credentials.getRawDataExtension() + index; return buildURL();}
        protected String getNationalLevelData(){extension = Credentials.getNationalLevelExtension(); return buildURL();}
        protected String getStateDistrictWiseData(){extension = Credentials.getStateDistrictWiseExtension(); return buildURL();}
        protected String getStateDailyChangeData(){extension = Credentials.getStateDailyChangeExtension(); return buildURL();}
        protected String getStateTestingData(){extension = Credentials.getStateTestingDataExtension(); return buildURL();}
        protected String getLatestData(){extension = Credentials.getLatestDataExtension(); return buildURL();}
        protected String getSpecificDateData(int DD, int MM, int YYYY){ extension = Credentials.getSpecificDateExtension()+YYYY+"-"+MM+"-"+DD; return buildURL();}
        protected String getPopulationData(){extension = Credentials.getPopulationExtension(); return buildURL();}

        protected String buildURL()
        {
            try {
                String finalURL;
                finalURL = baseURL + extension + finalExtension;
                return finalURL;
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            return null; //<-----Remove after test
        }



    }




    /**---Class to get JSON Data---**/
    public class getData extends AsyncTask <String,String,String>
    {
        @Override
        protected String doInBackground(String... strings) {

            String current = ""; //JSON in String form
            URL url = null;
            try {
                url = new URL(testURL);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            HttpsURLConnection urlConnection = null;
            try {

                urlConnection = (HttpsURLConnection) url.openConnection();
                InputStream is = urlConnection.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);

                int data = isr.read();//get to first character
                while(data!=-1)//till end is not reached
                {
                    current += (char) data;
                    data = isr.read();
                }
            }catch (Exception e){e.printStackTrace();}
            finally {
                try{
                if(urlConnection!=null)
                {
                    urlConnection.disconnect(); //Disconnect HTTPS Connection after retrieval of data
                }}catch (Exception e){e.printStackTrace();}
            }

            return current;
        }

        @Override
        protected void onPostExecute(String s) //'s' is the 'current' returned above
        {
            try {
                new FormJSON(s); //Forms the JSON according to the URL Provided
            } catch (Exception e) {
                e.printStackTrace();
            }
            super.onPostExecute(s);
        }
    }
}
