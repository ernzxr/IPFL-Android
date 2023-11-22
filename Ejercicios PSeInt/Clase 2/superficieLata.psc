Algoritmo superficieLata
	// declaracion de variables
	Definir altura, diametro, area, nPi, radio Como Real;
	
	// ingreso de datos
	Escribir "1. Ingrese la altura de la lata: ";
	Leer altura;
	Escribir "2. Ingrese el diametro de la lata: ";
	Leer diametro;
	
	// procesamiento de datos
	nPi = 3.14;
	radio = diametro / 2;
	area = 2 * ( nPi * radio * radio) + nPi * diametro * altura;
	
	// salida de datos
	Escribir "La superficie de la lata es: ", area;
FinAlgoritmo
