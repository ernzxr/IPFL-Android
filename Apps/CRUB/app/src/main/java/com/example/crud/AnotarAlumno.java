package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AnotarAlumno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotar_alumno);
    }

    public void guardarAlumno(View view) {
        TextView txtNombreAlumno, txtDNI, txtCelular, txtCurso;
        String dni, nombre, celular, curso;

        //ingreso de datos
        txtNombreAlumno = findViewById(R.id.txtNombreAlumno);
        txtDNI = findViewById(R.id.txtDNI);
        txtCelular = findViewById(R.id.txtCelular)
        txtCurso = findViewById(R.id.txtCurso)

        //transformar datos
        nombre = txtNombreAlumno.getText().toString();
        dni = txtDNI.getText().toString();
        celular = txtCelular.getText().toString();
        curso = txtCurso.getText().toString();

        Toast.makeText(getApplicationContext(),"Alumno anotado.", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, AnotarAlumno.class);
        startActivity(intent);
    }

    public void cancelar(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}