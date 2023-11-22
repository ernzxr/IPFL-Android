Algoritmo numeroRandom
	Definir ganador, num, intentos Como Entero;
	Definir nombre Como Caracter;
	
	intentos = 1;
	ganador = azar(100);
	
	Escribir "Nombre de jugador: ";
	Leer nombre;
	
	Escribir "Decime un numero!: ";
	Leer num;
	
	Mientras (num <> ganador)
		intentos = intentos + 1;
		Si (num > ganador)
			Escribir "El numero es mas chiquitoooo";
			Escribir "Decime un numero!: ";
			Leer num;
		SiNo
			Escribir "El numero es mas grande owo";
			Escribir "Decime un numero!: ";
			Leer num;
		FinSi
	FinMientras
		Escribir "GANASTEEEEEEEEE ", nombre;
		Escribir "Cantidad de intentos: ", intentos;
FinAlgoritmo
