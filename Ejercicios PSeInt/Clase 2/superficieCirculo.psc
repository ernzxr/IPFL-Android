Algoritmo superficieCirculo
	// declaracion de variables
	Definir diametro, nPi, area Como Real;
	
	// ingreso de datos
	Escribir "1. Ingrese el diametro del circulo: ";
	Leer diametro;
	
	// procesamiento de datos
	nPi = 3.14;
	area = ((diametro * diametro) * nPi) / 4;
	
	// impresion de datos
	Escribir "La superficie del circulo es: ", area;
FinAlgoritmo
