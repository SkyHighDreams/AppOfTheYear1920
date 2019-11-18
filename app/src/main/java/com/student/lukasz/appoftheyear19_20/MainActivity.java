package com.student.lukasz.appoftheyear19_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void NextScreen(View view) {
    Intent myIntent = new Intent(MainActivity.this, Second_Activity.class);
    MainActivity.this.startActivity(myIntent);
}
}
