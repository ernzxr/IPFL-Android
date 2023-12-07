package com.example.crub;

public class Instituto {
    private int idinstituto, celular;
    private String nombre;

    public Instituto(int idinstituto, int celular, String nombre) {
        this.idinstituto = idinstituto;
        this.celular = celular;
        this.nombre = nombre;
    }

    public int getIdinstituto() {
        return idinstituto;
    }

    public void setIdinstituto(int idinstituto) {
        this.idinstituto = idinstituto;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return nombre;
    }
}
