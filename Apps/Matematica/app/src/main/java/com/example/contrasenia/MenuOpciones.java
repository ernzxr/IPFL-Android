package com.example.contrasenia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MenuOpciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_opciones);
    }

    public void ingresoCalculadora(View view) {
        Intent intent = new Intent(this, Matematica.class);
        startActivity(intent);
    }

    public void ingresoCuotas(View view) {
        Intent intent = new Intent(this, CalcularCuota.class);
        startActivity(intent);
    }
}