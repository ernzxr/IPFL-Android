package cajero;

import javax.swing.JOptionPane;

public class Cajero {

    public static void main(String[] args) {
        // definir variables
        String nombre, domicilio, celular;
        
        // pedir datos
        nombre    = JOptionPane.showInputDialog("Ingrese su nombre");
        domicilio = JOptionPane.showInputDialog("Ingrese su domicilio");
        celular   = JOptionPane.showInputDialog("Ingrese su celular");
        
        // crear objeto cliente
        Cliente cli;
        cli = new Cliente(nombre, domicilio, celular, null);
        
        // pedir datos de la cuenta
        String numero;
        float saldo, limite;
        
        numero = JOptionPane.showInputDialog("Ingrese el numero de cuenta");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo de la cuenta"));
        limite = Float.parseFloat(JOptionPane.showInputDialog("Establezca el limite de la cuenta"));
                
        // crear objeto cuenta
        Cuenta cbu;
        cbu = new Cuenta(numero, saldo, limite);
        
        // asociar cuenta y cliente con setter
        cli.setCuenta(cbu);
        
        // realizar deposito
        float importe;
        
        importe = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a depositar"));
        cli.actualizarSaldo(importe);
        cli.mostrarSaldo();
        
        // realizar extraccion
        importe = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a extraer"));
        if(cli.puedeRetirar(importe)) {
            cli.actualizarSaldo(-importe);
            cli.mostrarSaldo();
        }
        
        // realizar otra extraccion
        importe = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a extraer"));
        if(cli.puedeRetirar(importe)) {
            cli.actualizarSaldo(-importe);
            cli.mostrarSaldo();
        }
    
    }
    
}
