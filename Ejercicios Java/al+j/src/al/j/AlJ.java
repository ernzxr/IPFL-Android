package al.j;

import java.util.Scanner;

public class AlJ {

    public static void main(String[] args) {
        //variables 
        int dni, edad, contador, minimo;
        String nombre, joven;
        Scanner teclado;

        //inicializar
        joven="";
        contador = 0;
        minimo = 200;
        teclado = new Scanner(System.in);
        System.out.println("decime tu dni?");
        dni = teclado.nextInt();
        teclado.nextLine();
        while (dni != 0) {
            System.out.println("como te llamas?");          
            nombre = teclado.nextLine();
            teclado.nextLine();
            System.out.println("cuantos años tenes?");
            edad = teclado.nextInt();
            teclado.nextLine();
            

            //es un minimo?
            if (edad < minimo) {
              //guardar edad
              minimo = edad;
              joven = nombre;
              
           
            }   
            //contador
            contador++;
            //pedir otro dni
            System.out.print("decime tu dni");
            dni=teclado.nextInt();
            teclado.nextLine();
                    
        }
        System.out.println("el mas joven es "+joven);
        
    }
}
