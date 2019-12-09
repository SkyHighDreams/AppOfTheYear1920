package com.student.lukasz.appoftheyear19_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_4_answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_answer);
    }

    public void Tologinscreen(View view)
    {
        Intent myIntent = new Intent(Activity_4_answer.this , Login_Activity.class);
        Activity_4_answer.this.startActivity(myIntent);
    }
}
