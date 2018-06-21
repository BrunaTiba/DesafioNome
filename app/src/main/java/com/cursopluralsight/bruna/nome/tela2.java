package com.cursopluralsight.bruna.nome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class tela2 extends AppCompatActivity {

           private TextView text;

        @Override

        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_tela2);

            text = findViewById(R.id.text);
            Bundle bundle = getIntent().getExtras();

            String text = bundle.getString(key,"text");
            text.setText(text);


        }
    }

