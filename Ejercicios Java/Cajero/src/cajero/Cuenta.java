package cajero;

import javax.swing.JOptionPane;

public class Cuenta {
    // atributos
    private String numero;
    private float saldo, limite;

    // constructor sin parametros
    public Cuenta() {
    }

    // constructor con parametros
    public Cuenta(String numero, float saldo, float limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    public boolean puedeRetirar(float importe) {
        if (importe > saldo) {
            JOptionPane.showMessageDialog(null, "No tiene saldo suficiente.");
            return false;
        }
        else if (importe > limite) {
            JOptionPane.showMessageDialog(null, "Esta superando el limite disponible.");
            return false;
        }
        else {
            return true;
        }
    }
    
    public void actualizarSaldo(float importe) {
        saldo += importe;
    }
    
    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo disponible: $"+saldo);
    }
}