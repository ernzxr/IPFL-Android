package com.example.crub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VerAlumnos extends AppCompatActivity {
    private ListView listViewAlumnos;
    private ArrayList<Alumno> alumnosList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_alumno);
        listViewAlumnos = findViewById(R.id.listViewAlumnos);
        this.mostrarAlumnos();
        this.cargar();
    }

    private class MostrarAlumnos extends AsyncTask<Void, Void, String>{
        @Override
        protected String doInBackground(Void... voids) {
            String mensaje = "";
            try {
                // Crear sentencia para insertar
                Statement st = MySQL.conexion.createStatement();
                String sql = "select * from crub.alumno ";
                st.executeUpdate(sql);
            } catch (SQLException e) {
                mensaje = "Error en la peticion " + e.getMessage() + " " + e.getErrorCode();
            }
            return mensaje;
        }
    }

    public void cargar(){
        String mensaje = "";
        try {
            mensaje = new MostrarAlumnos().execute().get();
        }
        catch (Exception e) {
            mensaje = e.getMessage();
        }

        Alumno alumno = (Alumno) listViewAlumnos.getSelectedItem();

        if(mensaje.equals("")) {
            Toast.makeText(this,"Datos cargados", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"Error: "+mensaje, Toast.LENGTH_LONG).show();
        }
    }
    public void mostrarAlumnos(){
        try {
            alumnosList = new LeerAlumnos().execute().get();
            ArrayAdapter<Alumno> adapter = new ArrayAdapter<Alumno>(this, android.R.layout.simple_list_item_1, alumnosList);
            this.listViewAlumnos.setAdapter(adapter);
        }
        catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void volver(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}