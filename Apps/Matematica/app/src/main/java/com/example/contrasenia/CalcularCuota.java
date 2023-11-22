package com.example.contrasenia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CalcularCuota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_cuota);
    }

    public String articulo(View view){
        //declaracion de variables
        TextView txtArticulo;
        String text;

        //ingreso de datos
        txtArticulo = findViewById(R.id.txtArticulo);

        //transformar datos
        text = txtArticulo.getText().toString();

        return text;
    }

    public float precio(View view){
        //declaracion de variables
        TextView txtPrecio;
        float precio;

        //ingreso de datos
        txtPrecio = findViewById(R.id.txtPrecio);

        //transformar datos
        precio = Float.parseFloat(txtPrecio.getText().toString());

        return precio;
    }

    public float interes(View view){
        //declaracion de variables
        TextView txtInteres;
        float interes;

        //ingreso de datos
        txtInteres = findViewById(R.id.txtInteres);

        //transformar datos
        interes = Float.parseFloat(txtInteres.getText().toString());

        return interes;
    }

    public int cuotas(View view){
        //declaracion de variables
        TextView txtCuotas;
        int cuotas;

        //ingreso de datos
        txtCuotas = findViewById(R.id.txtCuotas);

        //transformar datos
        cuotas = Integer.parseInt(txtCuotas.getText().toString());

        return cuotas;
    }

    public void valorCuota(View view) {
        if (cuotas(view) > 1) {
            float unaCuota, unaCuotaInteres, resultado;
            unaCuota = precio(view) / cuotas(view);
            unaCuotaInteres = unaCuota * (interes(view) / 100 * 12);
            resultado = unaCuota + unaCuotaInteres;
            Toast.makeText(getApplicationContext(), cuotas(view) + " cuotas de $" + Math.round(resultado), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Pago al contado de $" + precio(view), Toast.LENGTH_LONG).show();
        }
    }
}