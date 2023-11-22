package cajero;

public class Cliente {
    // atributos
    private String nombre, domicilio, celular;
    private Cuenta cuenta;
    
    // constructor sin parametros
    public Cliente() {
    }
    
    // constructor con parametros
    public Cliente(String nombre, String domicilio, String celular, Cuenta cuenta) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.celular = celular;
        this.cuenta = cuenta;
    }
    
    // getters y setters
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public boolean puedeRetirar(float importe) {
        return cuenta.puedeRetirar(importe);
    }
    
    public void actualizarSaldo(float importe) {
        cuenta.actualizarSaldo(importe);
    }
    
    public void mostrarSaldo() {
        cuenta.mostrarSaldo();
    }
}
