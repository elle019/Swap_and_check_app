package com.example.swapper_checker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Check_value extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_value);

        TextView results = (TextView) findViewById(R.id.results_if_match);
        Intent intent2 = getIntent();
        String match = intent2.getStringExtra("Same Value");
        results.setText(match);
    }
}