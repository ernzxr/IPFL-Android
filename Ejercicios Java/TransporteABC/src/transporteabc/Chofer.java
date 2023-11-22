package transporteabc;

import javax.swing.JOptionPane;

public class Chofer {
    // definicion de variables
    private String nombre;
    private long celular;

    public Chofer() {
    }

    public Chofer(String nombre, long celular) {
        this.nombre = nombre;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }
   
    public void mostrarDatos() {
    JOptionPane.showMessageDialog(null, "Nombre del Chofer: "+nombre+"\nContacto: "+celular);
    }
}
