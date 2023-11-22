package cineconstantino;

import javax.swing.JOptionPane;

public class CineConstantino {

    public static void main(String[] args) {
        // declaracion de variables
        String nombreCine, domicilio, nombrePelicula, horario;
        long celular;
        Pelicula infantil, suspenso;
        Cine constantino;
        
        
        // objeto cine
        nombreCine = JOptionPane.showInputDialog("Ingrese el nombre del cine: ");
        domicilio = JOptionPane.showInputDialog("Ingrese la ubicacion del cine: ");
        celular = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero de contacto: "));
        
        constantino = new Cine(nombreCine, domicilio, celular, null, null);
        
        // objeto infantil
        nombrePelicula = JOptionPane.showInputDialog("Genero Infantil - Ingrese el nombre de la pelicula: ");
        horario = JOptionPane.showInputDialog("Ingrese el horario de la pelicula");
        
        infantil = new Pelicula(nombrePelicula, horario);
        
        // objeto suspenso
        nombrePelicula = JOptionPane.showInputDialog("Genero Suspenso - Ingrese el nombre de la pelicula: ");
        horario = JOptionPane.showInputDialog("Ingrese el horario de la pelicula");
        
        suspenso = new Pelicula(nombrePelicula, horario);
        
        // setters
        constantino.setInfantil(infantil);
        constantino.setSuspenso(suspenso);
        
        // usar metodos
        constantino.mostrarDatos();
        constantino.mostrarEstrenos();
    }
    
}
