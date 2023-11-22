Algoritmo cocienteResto
	// declaracion de variables
	Definir num1, num2, cociente, resto Como Entero;
	
	// ingreso de datos
	Escribir "1. Ingrese un numero: ";
	Leer num1;
	Escribir "2. Ingrese otro numero: ";
	Leer num2;
	
	// operaciones
	resto = num1 mod num2;
	cociente = trunc(num1 / num2);
	
	// salida de datos
	Escribir "El cociente entre ", num1, " y ", num2, " es ", cociente, " y el resto ", resto;
FinAlgoritmo
