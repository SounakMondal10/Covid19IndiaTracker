package com.sounakmondal.covid19indiatracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class getData extends AsyncTask <String,String,String>
    {

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }
    }
}
