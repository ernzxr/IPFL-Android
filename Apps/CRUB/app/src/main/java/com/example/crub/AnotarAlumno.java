package com.example.crub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AnotarAlumno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotar_alumno);
    }

    public void guardarAlumno(View view) {
        TextView txtNombreAlumno, txtDNI, txtCelular;
        Spinner spinnerCurso;
        String dni, nombre, celular, curso;

        //ingreso de datos
        txtNombreAlumno = findViewById(R.id.txtNombreAlumno);
        txtDNI = findViewById(R.id.txtDNI);
        txtCelular = findViewById(R.id.txtCelular);
        spinnerCurso = findViewById(R.id.spinnerCurso);

        //transformar datos
        nombre = txtNombreAlumno.getText().toString();
        dni = txtDNI.getText().toString();
        celular = txtCelular.getText().toString();
        curso = spinnerCurso.getSelectedItem().toString();

        Toast.makeText(getApplicationContext(),"Alumno anotado al Curso: "+curso, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, AnotarAlumno.class);
        startActivity(intent);
    }

    public void cancelar(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}