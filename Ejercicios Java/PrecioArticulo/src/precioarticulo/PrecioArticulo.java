package precioarticulo;

import javax.swing.JOptionPane;

public class PrecioArticulo {

    public static void main(String[] args) {
        float precio, interes, importeCuota, importeFinal;
        int cuotas;
        String nombre;
        
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del articulo:");
        precio = Float.parseFloat(JOptionPane.showInputDialog("Precio del articulo:"));
        cuotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cuotas:"));
        
        if (cuotas > 1) {
            interes = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los intereses de las cuotas:"));
            importeCuota = precio * interes / 100f;
            importeFinal = precio + importeCuota * (float)cuotas;
            JOptionPane.showMessageDialog(null,"Nombre del producto: "+nombre+" - Precio al contado: $"+precio+" - Cantidad de cuotas en el pago: "+cuotas+" a una tasa del %"+interes+" - Precio por cuota: $"+importeCuota+" - Importe final: $"+importeFinal);
        }
        else {
            importeFinal = precio;
            JOptionPane.showMessageDialog(null,"Nombre del producto: "+nombre+" - Precio al contado: $"+precio+" - Cantidad de cuotas en el pago: "+cuotas+" - Importe final: $"+importeFinal);
        }
    }    
}
