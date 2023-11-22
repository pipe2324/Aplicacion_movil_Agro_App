package com.example.web;

import androidx.annotation.NonNull;
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

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity5 extends AppCompatActivity implements OnMapReadyCallback {

    private Button continuar;
    private Spinner menuSpinner2;
    private EditText finca, contacto;

    private GoogleMap mMap;

    private TextView ubicaci, nombrefinca, numerocontacto;

    private Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapFragment);
        mapFragment.getMapAsync(this);


        continuar = findViewById(R.id.continuar);
        finca = findViewById(R.id.finca);
        contacto = findViewById(R.id.contacto);
        menuSpinner2 = findViewById(R.id.menuSpinner2);


        String[] menuOptions = {"Selecciona una opción", "Publicar Producto", "Llenar Campos", "Cerrar Sesión"};


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, menuOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        menuSpinner2.setAdapter(adapter);


        menuSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                try {
                    if (position == 1) {
                        intent = new Intent(getApplicationContext(), MainActivity6.class);
                        startActivity(intent);
                    } else if (position == 2) {
                        intent = new Intent(getApplicationContext(), MainActivity5.class);
                        startActivity(intent);
                    } else if (position == 3) {
                        finishAffinity();
                        System.exit(0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        MarkerOptions markerOptions = new MarkerOptions()
                .position(new LatLng(5.9170442, -73.4964349053907))
                .title("Togui Boyaca");

        mMap.addMarker(markerOptions);
    }
}

