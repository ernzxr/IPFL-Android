package com.example.crub;

import android.os.AsyncTask;
import android.util.Log;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class LeerCursos extends AsyncTask<Void, Void, ArrayList<Curso>> {

    @Override
    protected ArrayList<Curso> doInBackground(Void... voids) {
        ResultSet result;
        ArrayList<Curso> list = new ArrayList<>();
        try {
            Statement st = MySQL.conexion.createStatement();
            String sql = "select * from curso";
            result = st.executeQuery(sql);
            while (result.next()) {
                int idcurso = result.getInt("idcurso");
                int idinstituto = result.getInt("instituto_idinstituto");
                String horario = result.getString("horario");
                String nivel = result.getString("nivel");
                list.add(new Curso(idcurso, idinstituto, horario, nivel));
            }
        }
        catch (Exception e) {
            Log.e("Error en select", e.getMessage());
        }
        return list;
    }
}
