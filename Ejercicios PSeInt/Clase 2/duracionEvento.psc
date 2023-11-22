Algoritmo duracionEvento
	// declaracion de variables
	Definir hApertura, hCierre, hTotalEvento Como Entero;
	
	// ingreso de datos
	Escribir "1. Ingrese el horario de apertura: ";
	Leer hApertura;
	Escribir "2. Ingrese el horario de cierre: ";
	Leer hCierre;
	
	// procesamiento de datos
	hTotalEvento = hCierre - hApertura;
	
	//impresion de datos
	Escribir "El evento durara ", hTotalEvento, " horas.";
FinAlgoritmo
