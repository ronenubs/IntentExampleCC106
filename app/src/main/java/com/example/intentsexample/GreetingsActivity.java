package com.example.intentsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingsActivity extends AppCompatActivity {

    TextView tvGreetings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);

        tvGreetings = findViewById(R.id.tvGreetings);

        Intent intent = getIntent();
        String name = intent.getStringExtra("personName");
        tvGreetings.setText("Hello, " + name + "!");
    }
}