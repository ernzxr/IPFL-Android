package com.example.crub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AnotarAlumno extends AppCompatActivity {
    private Spinner spinnerCurso;
    private TextView txtNombreAlumno, txtDNI, txtCelular;
    private ArrayList<Curso> cursosList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotar_alumno);
        //ingreso de datos
        txtNombreAlumno = findViewById(R.id.txtNombreAlumno);
        txtDNI = findViewById(R.id.txtDNI);
        txtCelular = findViewById(R.id.txtCelular);
        spinnerCurso = findViewById(R.id.spinnerCurso);
        this.mostrarCursos();
    }

    private class GuardarAlumno extends AsyncTask<Void, Void, String> {
        //transformar datos
        String nombre = txtNombreAlumno.getText().toString();
        String dni = txtDNI.getText().toString();
        String celular = txtCelular.getText().toString();
        Curso curso = (Curso) spinnerCurso.getSelectedItem();

        @Override
        protected String doInBackground(Void... voids) {
            String mensaje = "";
            try {
                // Crear sentencia para insertar
                Statement st = MySQL.conexion.createStatement();
                String campos = "(dni, nombre, celular, curso_idcurso)";
                String valores = "(" + dni + "," + "'" + nombre + "'" + ", +5490" + celular + "," + curso.getIdcurso() + ")";
                String sql = "insert into alumno " + campos + " values " + valores;
                st.executeUpdate(sql);
            }
            catch (SQLException e) {
                mensaje = "Error al insertar "+ e.getMessage() + " " + e.getErrorCode();
            }
            return mensaje;
        }
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

    public void aceptar(View view) {
        String mensaje = "";

        try {
            mensaje = new GuardarAlumno().execute().get();
        }
        catch (Exception e) {
            mensaje = e.getMessage();
        }

        Curso curso = (Curso) spinnerCurso.getSelectedItem();

        if(mensaje.equals("")) {
            Toast.makeText(this,"Alumno anotado al Curso: "+curso, Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"Error: "+mensaje, Toast.LENGTH_LONG).show();
        }
    }

    public void cancelar(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}