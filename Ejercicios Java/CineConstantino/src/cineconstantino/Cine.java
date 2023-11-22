package cineconstantino;

import javax.swing.JOptionPane;

public class Cine {
    private String nombre, domicilio;
    private long celular;
    private Pelicula infantil, suspenso;

    public Cine(String nombre, String domicilio, long celular, Pelicula infantil, Pelicula suspenso) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.celular = celular;
        this.infantil = infantil;
        this.suspenso = suspenso;
    }

    public Cine() {
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

    public Pelicula getInfantil() {
        return infantil;
    }

    public void setInfantil(Pelicula infantil) {
        this.infantil = infantil;
    }

    public Pelicula getSuspenso() {
        return suspenso;
    }

    public void setSuspenso(Pelicula suspenso) {
        this.suspenso = suspenso;
    }
    
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre del cine: "+nombre+"\nLugar: "+domicilio+"\nContacto: "+celular);
    }
    
    public void mostrarEstrenos() {
        infantil.mostrarHorario();
        suspenso.mostrarHorario();
    }
}
