package com.sounakmondal.covid19indiatracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    String testURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
            try {
                URL url;


            }catch (Exception e){e.printStackTrace();}

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }
}
