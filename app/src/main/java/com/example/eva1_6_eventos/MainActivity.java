package com.example.eva1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button btnListener, btnClaseAnonima, btnPorClase;
    MainActivity maini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnListener);
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);
        btnPorClase = findViewById(R.id.btnPorClase);
        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"EVENTO POR CLASE ANÓNIMA", Toast.LENGTH_LONG).show();
            }
        });
        maini = this;
        btnPorClase.setOnClickListener(new MiClaseOnClick(maini));


    }

    //Usando propiedad android:onclick del Widget
    //NombredelMetodo(View arg){}

    public void miClick(View arg){
        //Mensaje (TOAST)
        Toast.makeText(this, "EVENTO POR ONCLICK XML", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        //Mensaje (TOAST)
        Toast.makeText(this, "EVENTO POR LISTENER", Toast.LENGTH_LONG).show();
    }
}

