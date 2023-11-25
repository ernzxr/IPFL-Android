package com.example.crub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingresoSistema(View view) throws ExecutionException, InterruptedException {
        //declaracion de variables
        TextView txtUsuario, txtPassword;
        String usuario, password;

        //ingreso de datos
        txtUsuario = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);

        //transformar datos
        usuario = txtUsuario.getText().toString();
        password = txtPassword.getText().toString();

        //validar ingreso
        if (usuario.equalsIgnoreCase("crub") && password.equals("123")) {
            //conectar a bdd
            try {
                MySQL enginetruck = new MySQL();
                Toast.makeText(getApplicationContext(), enginetruck.execute().get(), Toast.LENGTH_LONG).show();
            }
            catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
            //ingresar a una nueva ventana
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrectos.", Toast.LENGTH_LONG).show();
        }
    }
}