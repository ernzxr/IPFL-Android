package calcularporcentaje;

import javax.swing.JOptionPane;

public class CalcularPorcentaje {

    public static void main(String[] args) {
        int hombres, mujeres, total;
        float porcH, porcM;
        
        hombres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Hombres:"));
        mujeres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Mujeres:"));
        
        total = hombres + mujeres;
        
        porcH = hombres * 100f / total;
        porcM = mujeres * 100f / total;
        
        JOptionPane.showMessageDialog(null,"El porcentaje de Hombres es %"+porcH);
        JOptionPane.showMessageDialog(null,"El porcentaje de Mujeres es %"+porcM);
    }
    
}
