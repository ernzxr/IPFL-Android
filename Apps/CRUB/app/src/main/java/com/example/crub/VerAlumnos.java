package com.example.crub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VerAlumnos extends AppCompatActivity {
    private ListView listViewAlumnos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_alumno);
        listViewAlumnos = findViewById(R.id.listViewAlumnos);
        this.mostrarAlumnos();
    }

    private class MostrarAlumnos extends AsyncTask<Void, Void, ArrayList<String>>{
        @Override
        protected ArrayList<String> doInBackground(Void... voids) {
            ResultSet result = null;
            ArrayList<String> alumnosList = new ArrayList<>();
            try {
                // Crear sentencia para insertar
                Statement st = MySQL.conexion.createStatement();
                String sql = "select nombre, nivel from alumno join curso on curso_idcurso = idcurso order by nivel, nombre";
                result = st.executeQuery(sql);
                while (result.next()) {
                    String nombre  = result.getString("nombre");
                    String curso   = result.getString("nivel");
                    alumnosList.add(curso +" - "+nombre);
                }
            } catch (SQLException e) {
                Log.e("Error al leer anotados", e.getMessage() + " " + e.getErrorCode());            }
            return alumnosList;
        }
    }

    public void mostrarAlumnos(){
        try {
            ArrayList<String> alumnosList = new MostrarAlumnos().execute().get();
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alumnosList);
            listViewAlumnos.setAdapter(adapter);
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