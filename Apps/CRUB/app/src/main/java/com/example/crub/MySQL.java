package com.example.crub;

import android.os.AsyncTask;
import android.util.Log;

import java.sql.*;

public class MySQL extends AsyncTask<Void,Void,String> {
    public static Connection conexion = null;
    public static String mensaje = "";
    public static String error = "";

    @Override
    protected String doInBackground(Void... voids) {
        //* Conexión a un servidor local, vía su IP
        String url = "jdbc:mysql://192.168.25.157:3306/crub";
        String user = "admin";
        String pass = "1234";

        // Retorno un mensaje con el resultado de la conexión
        String mensaje = "";
        try {
            // Cargo Driver MySQL
            Class.forName("com.mysql.jdbc.Driver");

            // Intento conexión
            conexion = DriverManager.getConnection(url, user, pass);
            if (conexion != null) {
                mensaje = "Conexión exitosa";
            } else {
                mensaje = "Conexion=null";
            }

        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        Log.e("LOG:", mensaje);   // muestra mensaje en la consola
        return mensaje;
    }
}