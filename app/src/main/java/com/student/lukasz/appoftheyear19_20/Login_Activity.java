package com.student.lukasz.appoftheyear19_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
    }

    public void Backtologinscreen(View view)
    {
        Intent myIntent = new Intent(Login_Activity.this, MainActivity.class);
        Login_Activity.this.startActivity(myIntent);
    }
}
