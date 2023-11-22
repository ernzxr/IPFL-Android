package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NuevoCurso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_curso);
    }

    public void guardarCurso(View view) {
        TextView txtHorario, txtNombreCurso;
        String horario, curso;

        //ingreso de datos
        txtHorario = findViewById(R.id.txtHorario);
        txtNombreCurso = findViewById(R.id.txtNombreCurso);

        //transformar datos
        horario = txtNombreCurso.getText().toString();
        curso = txtHorario.getText().toString();

        Toast.makeText(getApplicationContext(),"Curso registrado.", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, NuevoCurso.class);
        startActivity(intent);
    }

    public void cancelar(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}