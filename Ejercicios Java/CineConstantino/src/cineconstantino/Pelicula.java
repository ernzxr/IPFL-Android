package cineconstantino;

import javax.swing.JOptionPane;

public class Pelicula {
    private String nombre, diaYhora;

    public Pelicula(String nombre, String diaYhora) {
        this.nombre = nombre;
        this.diaYhora = diaYhora;
    }

    public Pelicula() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiaYhora() {
        return diaYhora;
    }

    public void setDiaYhora(String diaYhora) {
        this.diaYhora = diaYhora;
    }
    
    public void mostrarHorario() {
        JOptionPane.showMessageDialog(null, "Estrenos de la semana!\nInfantiles: "+nombre+"\nHorarios: "+diaYhora);
    }
}
