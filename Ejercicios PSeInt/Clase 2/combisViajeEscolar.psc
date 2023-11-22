Algoritmo combisViajeEscolar
	// declaracion de variables
	Definir totalAlumnos, asientos, ocupados, vacantes, combis Como Entero;
	
	// ingreso de datos
	Escribir "1. Ingrese la cantidad de alumnos: ";
	Leer totalAlumnos;
	
	// operacion de datos
	asientos = 20;
	combis = trunc(totalAlumnos / asientos);
	ocupados = totalAlumnos % asientos;
	vacantes = 0;
	
	Si ocupados > 0 Entonces;
		combis = combis + 1;
		vacantes = asientos - ocupados;
	FinSi
	
	// impresion
	Escribir "Se necesitan ", combis, " combis para llevar a todos los alumnos.";
	Escribir "En la ultima combi sobran ", vacantes, " asientos.";
FinAlgoritmo
