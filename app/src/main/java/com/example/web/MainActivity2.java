package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private TextView titulo2;

    private EditText nombre, usuario,contraseña;

    private Button crearcuenta;
    private Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        titulo2=findViewById(R.id.titulo2);
        nombre=findViewById(R.id.nombre);
        usuario=findViewById(R.id.usuario);
        contraseña=findViewById(R.id.contraseña);
        crearcuenta=findViewById(R.id.crearcuenta);

        crearcuenta.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);


            }
        });
    }

}