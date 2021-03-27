package com.example.eva1_6_eventos;

import android.view.View;
import android.widget.Toast;

public class MiClaseOnClick implements View.OnClickListener {

    MainActivity maino;
    @Override
    public void onClick(View v) {
        Toast.makeText(maino,"EVENTO POR CLASE", Toast.LENGTH_LONG).show();
    }

    public MiClaseOnClick(MainActivity main){
        maino = main;
    }
}
