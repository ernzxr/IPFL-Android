Algoritmo numeroMayor
	Definir num1, num2 Como Entero;
	
	Escribir "1. Ingrese un numero: ";
	Leer num1;
	
	Escribir "2. Ingrese otro numero: ";
	Leer num2;
	
	Si (num1 > num2) Entonces
		Escribir "El primer numero es mayor.";
	SiNo
		Si (num2 > num1) Entonces
			Escribir "El segundo numero es mayor.";
		SiNo
			Escribir "Ambos numeros son iguales.";
		FinSi
		
	FinSi
	
FinAlgoritmo
