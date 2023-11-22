package com.example.web;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

import com.example.web.R;

public class MainActivity4 extends AppCompatActivity {

    private Spinner menuSpinner;
    private ImageView producto;
    private Button vermas;
    private EditText coment;
    private TextView comentarios;
    private RatingBar estrellas;
    private Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        producto = findViewById(R.id.producto);
        vermas = findViewById(R.id.vermas);
        coment = findViewById(R.id.coment);
        comentarios = findViewById(R.id.comentarios);
        estrellas = findViewById(R.id.estrellas);
        menuSpinner = findViewById(R.id.menuSpinner);

        // Crea un arreglo de opciones para el menú
        String[] menuOptions = {"Selecciona una opción", "Publicar Producto", "Llenar Campos", "Cerrar Sesión"};

        // Crea un adaptador y enlázalo al Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, menuOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        menuSpinner.setAdapter(adapter);

        // Maneja la selección del Spinner
        menuSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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


        vermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MainActivity7.class); // Reemplaza "MainActivity7" con la actividad correspondiente.
                startActivity(intent);
            }
        });
    }
}
