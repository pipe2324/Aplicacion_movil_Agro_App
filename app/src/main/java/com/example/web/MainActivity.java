package com.example.web;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView logo;

    private Button crear, iniciar;

    private Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      logo= findViewById(R.id.logo);
      crear=findViewById(R.id.crear);
      iniciar=findViewById(R.id.iniciar);

      crear.setOnClickListener(new View.OnClickListener(){


          @Override
          public void onClick(View v) {
              intent = new Intent(getApplicationContext(), MainActivity2.class);
              startActivity(intent);


          }
      });

      iniciar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              intent = new Intent(getApplicationContext(), MainActivity3.class);
              startActivity(intent);

          }
      });
    }

}
