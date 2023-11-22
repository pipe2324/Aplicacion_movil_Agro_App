package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {




    private Spinner menuspinner4;

    private Button comprar;

    private EditText precio, descripcion, finca,ubicacion;

    private TextView precio_pro, descripcion_pro, finca_pro,ubicacion_pro;

    private ImageView imagen;

    private Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        menuspinner4=findViewById(R.id.menuSpinner4);
        comprar=findViewById(R.id.button4);
        precio=findViewById(R.id.precio_pro);
        descripcion=findViewById(R.id.descripcion);
        finca=findViewById(R.id.finca_pro);
        ubicacion=findViewById(R.id.ubicacion_pro);
        precio_pro=findViewById(R.id.textView10);
        descripcion_pro=findViewById(R.id.textView11);
        finca_pro=findViewById(R.id.textView12);
        ubicacion_pro=findViewById(R.id.textView13);
        String[] menuOptions = {"Selecciona una opción", "Publicar Producto", "Llenar Campos", "Cerrar Sesión"};

        // Crea un adaptador y enlázalo al Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, menuOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        menuspinner4.setAdapter(adapter);

        // Maneja la selección del Spinner
        menuspinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                if (position == 1) {
                    // Lógica para la opción "Publicar Producto"
                    intent = new Intent(getApplicationContext(), MainActivity6.class); // Reemplaza "PublicarProductoActivity" con la actividad correspondiente.
                    startActivity(intent);
                } else if (position == 2) {
                    // Lógica para la opción "Llenar Campos"
                    intent = new Intent(getApplicationContext(), MainActivity5.class); // Reemplaza "LlenarCamposActivity" con la actividad correspondiente.
                    startActivity(intent);
                } else if (position == 3) {

                    finishAffinity(); // Cierra todas las actividades de la aplicación
                    System.exit(0); // Cierra la aplicación
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}