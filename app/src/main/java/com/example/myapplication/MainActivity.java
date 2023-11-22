package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText note1 = findViewById(R.id.note1);
        EditText note2 = findViewById(R.id.note2);
        EditText note3 = findViewById(R.id.note3);
        EditText coff1 = findViewById(R.id.coeff1);
        EditText coff2 = findViewById(R.id.coeff2);
        EditText coff3 = findViewById(R.id.coeff3);
        Button calculBTN = findViewById(R.id.calculBtn);

        calculBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float not1 = Float.parseFloat(note1.getText().toString());
                Float not2 = Float.parseFloat(note2.getText().toString());
                Float not3 = Float.parseFloat(note3.getText().toString());
                Float coffi1 = Float.parseFloat(coff1.getText().toString());
                Float coffi2 = Float.parseFloat(coff2.getText().toString());
                Float coffi3 = Float.parseFloat(coff3.getText().toString());

                Float Resultat = (not1 + not2 + not3) / (coffi2 + coffi1 + coffi3);

                if (Resultat >= 10) {
                    Intent intent;
                    intent = new Intent(MainActivity.this, SuccessActivity.class);
                    intent.putExtra("moyenne", String.valueOf(Resultat));
                    startActivity(intent);
                }

                if (Resultat < 10){
                    Intent intent2;
                    intent2 = new Intent(MainActivity.this, FailActivity.class);
                    intent2.putExtra("moyenne", String.valueOf(Resultat));
                    startActivity(intent2);
                }
            }
        });
    }
}
