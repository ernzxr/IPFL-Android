package com.example.contrasenia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingresoSistema(View view){
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
        if (usuario.equalsIgnoreCase("admin") && password.equals("123")){
            Toast.makeText(getApplicationContext(),"Ingresando..", Toast.LENGTH_LONG).show();
            //ingresar a una nueva ventana
            Intent intent = new Intent(this, MenuOpciones.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrectos.", Toast.LENGTH_LONG).show();
        }
    }

}