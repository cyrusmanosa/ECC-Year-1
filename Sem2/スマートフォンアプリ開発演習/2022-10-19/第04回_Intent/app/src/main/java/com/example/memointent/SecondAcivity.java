package com.example.memointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondAcivity extends AppCompatActivity {
    TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acivity);
        tvMsg = findViewById(R.id.tvMsg);
        Intent intent = getIntent();
        String text = intent.getStringExtra("Message");
        tvMsg.setText(text);


    }
}