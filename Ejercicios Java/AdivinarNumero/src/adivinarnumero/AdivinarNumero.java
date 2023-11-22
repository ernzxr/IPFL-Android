package adivinarnumero;

import javax.swing.JOptionPane;

public class AdivinarNumero {

    public static void main(String[] args) {
        int ganador, numero, contador;
        String respuesta;
        
        //inicializar
        contador = 1;
        ganador = (int)(Math.random()*100);
        
        //pedir primer numero
        respuesta = JOptionPane.showInputDialog("Decime un numero del 0 al 99: ");
        numero = Integer.parseInt(respuesta);
        
        while(numero!=ganador){
            contador++;
            if(numero < ganador) {
                JOptionPane.showMessageDialog(null, "Te quedaste corto UWU");
            }
            else if (numero > ganador) {
                JOptionPane.showMessageDialog(null, "Te pasaste papuuu OWO");
            }
            respuesta = JOptionPane.showInputDialog("Decime un numero del 0 al 99: ");
            numero = Integer.parseInt(respuesta);
        }
        JOptionPane.showMessageDialog(null, "YOU WINNNNNN EAAAAAA - Cantidad de intentos: "+contador);
    }
    
}
