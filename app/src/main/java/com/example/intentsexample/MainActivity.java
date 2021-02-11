package com.example.intentsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnGreet;
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGreet = findViewById(R.id.btnGreet);
        etName = findViewById(R.id.etName);

        btnGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showGreetings();
            }
        });
    }

    private void showGreetings() {
        //Toast.makeText(this, "Hello user.", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, GreetingsActivity.class);
        i.putExtra("personName", etName.getText().toString());
        startActivity(i);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        etName.setText("");
    }
}