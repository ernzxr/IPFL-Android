package promedionotas;

public class PromedioNotas {

    public static void main(String[] args) {
        float nota1, nota2, nota3, promedio;
        
        nota1 = 7;
        nota2 = 6.5f;
        nota3 = 8.3f;
        
        // proceso
        
        promedio = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("El promedio de las notas es "+promedio);
    }
    
}
