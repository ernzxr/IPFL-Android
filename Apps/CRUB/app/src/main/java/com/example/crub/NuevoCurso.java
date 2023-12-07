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

public class NuevoCurso extends AppCompatActivity {
    private TextView txtHorario, txtNombreCurso;
    private Spinner spinnerInstituto;
    private ArrayList<Instituto> institutosList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_curso);
        //ingreso de datos
        txtHorario = findViewById(R.id.txtHorario);
        txtNombreCurso = findViewById(R.id.txtNombreCurso);
        spinnerInstituto = findViewById(R.id.spinnerInstituto);
        this.mostrarInstitutos();
    }

    private class GuardarCurso extends AsyncTask<Void, Void, String> {
        //transformar datos
        String horario = txtHorario.getText().toString();
        String curso = txtNombreCurso.getText().toString();
        Instituto instituto = (Instituto) spinnerInstituto.getSelectedItem();

        @Override
        protected String doInBackground(Void... voids) {
            String mensaje = "";
            try {
                // Crear sentencia para insertar
                Statement st = MySQL.conexion.createStatement();
                String campos = "(horario, nivel, instituto_idinstituto)";
                String valores = "(" + "'" + horario + "'" + "," + "'" + curso + "'" + "," + instituto.getIdinstituto() + ")";
                String sql = "insert into curso " + campos + " values " + valores;
                st.executeUpdate(sql);
            } catch (SQLException e) {
                mensaje = "Error al insertar " + e.getMessage() + " " + e.getErrorCode();
            }
            return mensaje;
        }
    }

    public void mostrarInstitutos(){
        try {
            institutosList = new LeerInstitutos().execute().get();
            ArrayAdapter<Instituto> adapter = new ArrayAdapter<Instituto>(this, android.R.layout.simple_list_item_1, institutosList);
            this.spinnerInstituto.setAdapter(adapter);
        }
        catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

        public void aceptar(View view) {
            String mensaje = "";

            try {
                mensaje = new GuardarCurso().execute().get();
            }
            catch (Exception e) {
                mensaje = e.getMessage();
            }

            Instituto instituto = (Instituto) spinnerInstituto.getSelectedItem();

            if(mensaje.equals("")) {
                Toast.makeText(this,"Curso creado en el Instituto: "+instituto, Toast.LENGTH_LONG).show();
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