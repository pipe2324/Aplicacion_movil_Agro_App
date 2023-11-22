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
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    private Button publicar;
    private Spinner menuspinner3;

    private TextView preciopro, nombrepro, subir, publicarproducto, descrip;

    private EditText precio, nombre, descripcion;

    private Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        publicar=findViewById(R.id.publicar);
        preciopro=findViewById(R.id.preciopro);
        nombrepro=findViewById(R.id.nombrepro);
        subir=findViewById(R.id.subir);
        descripcion=findViewById(R.id.descri_pro);
        descrip=findViewById(R.id.descri_pro);
        publicarproducto=findViewById(R.id.publicarproducto);
        precio=findViewById(R.id.precio);
        nombre=findViewById(R.id.nombre_pro);
        menuspinner3=findViewById(R.id.menuSpinner3);
        // Crea un arreglo de opciones para el menú
        String[] menuOptions = {"Selecciona una opción", "Publicar Producto", "Llenar Campos", "Cerrar Sesión"};

        // Crea un adaptador y enlázalo al Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, menuOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        menuspinner3.setAdapter(adapter);

        // Maneja la selección del Spinner
        menuspinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        publicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}
