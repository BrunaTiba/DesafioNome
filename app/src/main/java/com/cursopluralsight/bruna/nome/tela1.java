package com.cursopluralsight.bruna.nome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tela1 extends AppCompatActivity {

        private EditText edit;
        private Button ok;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tela1);


            edit = findViewById(R.id.editText);
            ok = findViewById(R.id.button);


            ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String text = edit.getText().toString();

                    Intent intent = new Intent(tela1.this,tela2.class);
                    Bundle bundle = new Bundle();

                    bundle.putString("text", text);

                    intent.putExtras(bundle);
                    startActivity(intent);



                }

            });

        }
    }

