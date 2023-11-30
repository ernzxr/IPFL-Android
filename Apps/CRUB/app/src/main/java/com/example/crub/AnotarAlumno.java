package com.example.crub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AnotarAlumno extends AppCompatActivity {
    private Spinner spinnerCurso;
    private ArrayList<Curso> cursosList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotar_alumno);
        spinnerCurso = findViewById(R.id.spinnerCurso);
        this.mostrarCursos();
    }

    public void guardarAlumno(View view) {
        TextView txtNombreAlumno, txtDNI, txtCelular;
        String dni, nombre, celular, curso;

        //ingreso de datos
        txtNombreAlumno = findViewById(R.id.txtNombreAlumno);
        txtDNI = findViewById(R.id.txtDNI);
        txtCelular = findViewById(R.id.txtCelular);

        //transformar datos
        nombre = txtNombreAlumno.getText().toString();
        dni = txtDNI.getText().toString();
        celular = txtCelular.getText().toString();
        curso = spinnerCurso.getSelectedItem().toString();

        Toast.makeText(getApplicationContext(),"Alumno anotado al Curso: "+curso, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, AnotarAlumno.class);
        startActivity(intent);
    }

    public void mostrarCursos(){
        try {
            cursosList = new LeerCursos().execute().get();
            ArrayAdapter<Curso> adapter = new ArrayAdapter<Curso>(this, android.R.layout.simple_list_item_1, cursosList);
            this.spinnerCurso.setAdapter(adapter);
        }
        catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void cancelar(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}