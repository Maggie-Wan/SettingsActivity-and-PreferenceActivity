package com.example.student.SettingsActivityAndPreferenceActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void click(View view) {
        Intent in=new Intent();
        in.setClass(MainActivity.this,SettingsActivity.class);
        startActivity(in);
    }

    public void clickRead(View view) {
        SharedPreferences sp=getSharedPreferences(getPackageName()+"_preferences",MODE_PRIVATE);
        String str=sp.getString("edit_text_preference_1","");
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }

}
