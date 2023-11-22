Algoritmo votacion
	Definir nombre, ganador Como Caracter;
	Definir cantidad, votos, maximo, i Como Entero;
	
	Escribir "Ingrese la cantidad de listas: ";
	Leer cantidad;
	
	maximo = 0;
	
	Para i = 1 Hasta cantidad Con Paso 1
		Escribir "Nombre de la lista: ";
		Leer nombre;
		Escribir "Ingrese votos: ";
		Leer votos;
		
		Si (votos > maximo) Entonces
			maximo = votos;
			ganador = nombre;
		FinSi
	FinPara
	
	Escribir "La lista ganadora es ", ganador;
	
FinAlgoritmo
