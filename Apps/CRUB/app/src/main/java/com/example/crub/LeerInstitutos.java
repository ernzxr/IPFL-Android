package com.example.crub;

import android.os.AsyncTask;
import android.util.Log;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class LeerInstitutos extends AsyncTask<Void, Void, ArrayList<Instituto>> {

    @Override
    protected ArrayList<Instituto> doInBackground(Void... voids) {
        ResultSet result;
        ArrayList<Instituto> list = new ArrayList<>();
        try {
            Statement st = MySQL.conexion.createStatement();
            String sql = "select * from instituto";
            result = st.executeQuery(sql);
            while (result.next()) {
                int idinstituto = result.getInt("idinstituto");
                int celular = result.getInt("celular");
                String nombre = result.getString("nombre");
                list.add(new Instituto(idinstituto, celular, nombre));
            }
        }
        catch (Exception e) {
            Log.e("Error en select", e.getMessage());
        }
        return list;
    }
}
