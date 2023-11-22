package superficielata;

import javax.swing.JOptionPane;

public class SuperficieLata {

    public static void main(String[] args) {
        float altura, diametro, circunferencia, radio, superficie, pi = (float) Math.PI;
        
        diametro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el diametro:"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura:"));
        
        circunferencia = diametro * pi;
        radio = diametro / 2;
        superficie = (pi * radio * radio) * 2 + altura * circunferencia;
        
        JOptionPane.showMessageDialog(null,"La superficie de la lata es "+superficie+" cm².");
    }
    
}