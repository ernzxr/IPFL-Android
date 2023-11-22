Algoritmo esMayor
	// definicion de variables
	Definir nombre Como Caracter;
	Definir edad Como Entero;
	
	// ingresar datos
	Escribir "1. Ingrese su nombre completo: ";
	Leer nombre;
	
	Escribir "2. Ingrese su edad: ";
	Leer edad;
	
	//´proceso de edades
	Si (edad >= 18) Entonces
		Escribir nombre, " es mayor de edad.";
	SiNo
		Escribir nombre, " es menor de edad, a mimir.";
	FinSi
	
FinAlgoritmo
