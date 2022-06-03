package com.example.backupdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView nameTV = findViewById(R.id.welcome_tv);
        String name = PrefUtils.getName(this);
        nameTV.setText(String.format("Hello: %s", name));

    }
}