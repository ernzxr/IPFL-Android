package com.example.crub;

public class Curso {
    private int idcurso, idinstituto;
    private String horario, nivel;

    public Curso(int idcurso, int idinstituto, String horario, String nivel) {
        this.idcurso = idcurso;
        this.idinstituto = idinstituto;
        this.horario = horario;
        this.nivel = nivel;
    }

    public Curso() {
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public int getIdinstituto() {
        return idinstituto;
    }

    public void setIdinstituto(int idinstituto) {
        this.idinstituto = idinstituto;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String toString() {
        return nivel;
    }
}
