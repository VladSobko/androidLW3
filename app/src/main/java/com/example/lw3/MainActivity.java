package com.example.lw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String getScreenOrientation(){
        if(getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_PORTRAIT)
            return "Альбомна орієнтація";
        else if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE)
            return "Портретна орієнтація";
        else
            return "";
    }
    public void onClick1(View v) {
        if(getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_PORTRAIT)
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        else if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE)
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Toast.makeText(this, getScreenOrientation(), Toast.LENGTH_SHORT).show();
    }


}