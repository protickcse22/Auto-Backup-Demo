package com.example.backupdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private EditText nameET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.submit_bt);
        nameET = findViewById(R.id.ed_name);
        submit.setOnClickListener(v->{
            submit();
        });
    }

    private void submit() {
        if (!TextUtils.isEmpty(nameET.getText().toString())){
            PrefUtils.setName(this,nameET.getText().toString());
            startActivity(new Intent(this,WelcomeActivity.class));
            finish();
        } else {
            startActivity(new Intent(this,WelcomeActivity.class));
            finish();
        }
    }
}