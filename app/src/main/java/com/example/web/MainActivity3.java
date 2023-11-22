package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {


    private TextView titulopestaña;
    private EditText Usuario, Contraseña;

    private Button Ingreso;

    private Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        titulopestaña=findViewById(R.id.titulopestaña);
        Usuario=findViewById(R.id.Usuario);
        Contraseña=findViewById(R.id.Contraseña);
        Ingreso=findViewById(R.id.ingreso);

        Ingreso.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);
            }
        });
    }

}