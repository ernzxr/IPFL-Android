package com.example.contrasenia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Matematica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematica);
    }

    public int primerNumero(View view){
        //declaracion de variables
        TextView txtNumber1;
        int num1;

        //ingreso de datos
        txtNumber1 = findViewById(R.id.txtNumber1);

        //transformar datos
        num1 = Integer.parseInt(txtNumber1.getText().toString());

        return num1;
    }

    public int segundoNumero(View view){
        //declaracion de variables
        TextView txtNumber2;
        int num2;

        //ingreso de datos
        txtNumber2 = findViewById(R.id.txtNumber2);

        //transformar datos
        num2 = Integer.parseInt(txtNumber2.getText().toString());

        return num2;
    }

    public void suma(View view){
        int resultado;
        resultado = primerNumero(view) + segundoNumero(view);
        Toast.makeText(getApplicationContext(),"Resultado suma: "+resultado, Toast.LENGTH_LONG).show();
    }

    public void resta(View view){
        int resultado;
        resultado = primerNumero(view) - segundoNumero(view);
        Toast.makeText(getApplicationContext(),"Resultado resta: "+resultado, Toast.LENGTH_LONG).show();
    }

    public void division(View view){
        int resultado;
        resultado = primerNumero(view) / segundoNumero(view);
        Toast.makeText(getApplicationContext(),"Resultado division: "+resultado, Toast.LENGTH_LONG).show();
    }

    public void multiplicacion(View view){
        int resultado;
        resultado = primerNumero(view) * segundoNumero(view);
        Toast.makeText(getApplicationContext(),"Resultado multiplicacion: "+resultado, Toast.LENGTH_LONG).show();
    }
}