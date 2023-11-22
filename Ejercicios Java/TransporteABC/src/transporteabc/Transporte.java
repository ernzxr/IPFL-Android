package transporteabc;

import javax.swing.JOptionPane;

public class Transporte {
    // definicion de variables
    private String nombre, domicilio;
    private long celular;
    private Chofer chofer;
    private Camion camion;

    public Transporte() {
    }

    public Transporte(String nombre, String domicilio, long celular, Chofer chofer, Camion camion) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.celular = celular;
        this.chofer = chofer;
        this.camion = camion;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public void mostrarDatos() {
    JOptionPane.showMessageDialog(null, "Transporte Nombre: "+nombre+"\nDomicilio: "+domicilio+"\nCelular: "+celular);
    }
    
}
