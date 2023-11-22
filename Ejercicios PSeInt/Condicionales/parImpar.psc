Algoritmo parImpar
	// declaracion de variables
	Definir num Como Entero;
	
	// solicitud de datos
	Escribir "Ingrese un numero para evaluar si es positivo o negativo: ";
	Leer num;
	
	// proceso y salida de datos
	Si (num Mod 2 == 0) Entonces
		Escribir "El numero es par";
	SiNo
		Escribir "El numero es impar";
	FinSi
	
FinAlgoritmo
