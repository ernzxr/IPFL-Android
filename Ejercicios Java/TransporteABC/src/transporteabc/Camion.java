package transporteabc;

import javax.swing.JOptionPane;

public class Camion {
    private String marca, patente;
    private int anio;
    private boolean vtv;

    public Camion() {
    }

    public Camion(String marca, String patente, int anio, boolean vtv) {
        this.marca = marca;
        this.patente = patente;
        this.anio = anio;
        this.vtv = vtv;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isVtv() {
        return vtv;
    }

    public void setVtv(boolean vtv) {
        this.vtv = vtv;
    }
    
    public void mostrarDatos() {
        if(vtv) JOptionPane.showMessageDialog(null, "Camion marca: "+marca+"\nPatente: "+patente+"\nAño: "+anio+"\nVTV: Al dia");
        else JOptionPane.showMessageDialog(null, "Camion marca: "+marca+"\nPatente: "+patente+"\nAño: "+anio+"\nVTV: Vencida");
    }
}
