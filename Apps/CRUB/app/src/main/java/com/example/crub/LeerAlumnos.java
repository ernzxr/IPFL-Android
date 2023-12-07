package com.example.crub;

import android.os.AsyncTask;
import android.util.Log;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class LeerAlumnos extends AsyncTask<Void, Void, ArrayList<Alumno>> {

    @Override
    protected ArrayList<Alumno> doInBackground(Void... voids) {
        ResultSet result;
        ArrayList<Alumno> list = new ArrayList<>();
        try {
            Statement st = MySQL.conexion.createStatement();
            String sql = "select * from alumno";
            result = st.executeQuery(sql);
            while (result.next()) {
                int dni = result.getInt("dni");
                int curso_idcurso = result.getInt("curso_idcurso");
                int celular = result.getInt("celular");
                String nombre = result.getString("nombre");
                list.add(new Alumno(dni, curso_idcurso, celular, nombre));
            }
        }
        catch (Exception e) {
            Log.e("Error en select", e.getMessage());
        }
        return list;
    }
}
