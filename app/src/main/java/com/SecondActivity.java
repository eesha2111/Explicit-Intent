package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.explicitintent.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}