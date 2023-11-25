package com.example.crub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void cargarCurso(View view) {
        Intent intent = new Intent(this, NuevoCurso.class);
        startActivity(intent);
    }

    public void anotarAlumno(View view) {
        Intent intent = new Intent(this, AnotarAlumno.class);
        startActivity(intent);
    }

    public void verAlumnos(View view) {
        Intent intent = new Intent(this, VerAlumnos.class);
        startActivity(intent);
    }

    public void salir(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}