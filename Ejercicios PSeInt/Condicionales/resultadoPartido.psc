Algoritmo resultadoPartido
	Definir equipo1, equipo2 Como Caracter;
	Definir resultadoEquipo1, resultadoEquipo2 Como Entero;
	
	Escribir "Ingrese el nombre del equipo 1: ";
	Leer equipo1;
	
	Escribir "Ingrese el nombre del equipo 2: ";
	Leer equipo2;
	
	Escribir "Ingrese los goles del equipo 1: ";
	Leer resultadoEquipo1;
	
	Escribir "Ingrese los goles del equipo 2: ";
	Leer resultadoEquipo2;
	
	Si (resultadoEquipo1 > resultadoEquipo2) Entonces
		Escribir "GANOOOOOOOOOOOOOOOOOO ", equipo1, "!!!!!!!!!!";
	SiNo
		Si (resultadoEquipo2 > resultadoEquipo1) Entonces
			Escribir "GANOOOOOOOOOOOOOOOOO ", equipo2, "!!!!!!!!!!!!";
		SiNo
			Escribir "Empataron BUUUUU";
		FinSi
	FinSi
	
FinAlgoritmo
