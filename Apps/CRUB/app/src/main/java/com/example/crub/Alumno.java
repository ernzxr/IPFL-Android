package com.example.crub;

public class Alumno {
    private int dni, curso_idcurso, celular;
    private String nombre;

    public Alumno(int dni, int curso_idcurso, int celular, String nombre) {
        this.dni = dni;
        this.curso_idcurso = curso_idcurso;
        this.celular = celular;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCurso_idcurso() {
        return curso_idcurso;
    }

    public void setCurso_idcurso(int curso_idcurso) {
        this.curso_idcurso = curso_idcurso;
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
