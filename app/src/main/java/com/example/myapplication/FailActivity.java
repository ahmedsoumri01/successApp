package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echec);

        TextView resul = findViewById(R.id.resultEchec);

        Intent intent = getIntent();
        String extra1 = intent.getStringExtra("moyenne");
        resul.setText("votre moyenne est : " + extra1);
    }
}
