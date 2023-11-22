package calculartotal;

public class CalcularTotal {

    public static void main(String[] args) {
        float precio1, precio2, precio3, total;
        
        precio1 = 100;
        precio2 = 99.99f;
        precio3 = -25;
        
        total = precio1 + precio2 + precio3;
        
        System.out.println("El total a abonar es: $"+total);
    }
    
}
