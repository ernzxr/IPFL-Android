package transporteabc;

import javax.swing.JOptionPane;

public class TransporteABC {

    public static void main(String[] args) {
        // definicion de variables
        long celular;
        String nombre, patente, marca, domicilio, respuestaVtv;
        int anio;
        boolean vtv;
        Chofer chofer;
        Camion camion;
        Transporte transporte;
        
        // crear objeto chofer
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del chofer");
        celular = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero de celular del chofer"));
    
        chofer = new Chofer(nombre, celular);
        
        // crear objeto camion
        marca = JOptionPane.showInputDialog("Ingrese la marca del camion");
        patente = JOptionPane.showInputDialog("Ingrese la patente");
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del camion"));
        respuestaVtv = JOptionPane.showInputDialog("VTV Actualizada? (SI/NO)");
        
        if(respuestaVtv.equalsIgnoreCase("SI")) vtv = true;
        else vtv = false;
        
        camion = new Camion(marca, patente, anio, vtv);
        
        // crear objeto transporte
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del transporte");
        domicilio = JOptionPane.showInputDialog("Ingrese el domicilio del transporte");
        celular = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero de celular del transporte"));

        transporte = new Transporte(nombre, domicilio, celular, chofer, camion);
        
        // mostrar datos
        transporte.mostrarDatos();
        camion.mostrarDatos();
        chofer.mostrarDatos();
    }
    
}
