package com.example.hotelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private final boolean controleMotDepasse=false;
    private String motDePasse;
    private Button bouton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = (EditText) findViewById(R.id.idEditTextMdp);
        bouton = (Button)findViewById(R.id.idBouton);

        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String motDePasse = "amadour46";
                String recuperation = mEditText.getText().toString();


                if(recuperation.equals(motDePasse)) {

                    Toast.makeText(getApplicationContext(),"Connected",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);

                } else {

                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();

                }

            }
        });

    }



}