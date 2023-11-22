Algoritmo promedio
	Definir i, alumnos Como Entero;
	Definir nota, prom, total Como Real;
	Escribir "Ingrese alumnos: ";
	Leer alumnos;
	
	total = 0;
	
	Para i = 1 Hasta alumnos Con Paso 1
		Escribir "Ingrese nota: ";
		Leer nota;
		total = total + nota;
	FinPara
	
	prom = total / alumnos;
	
	Escribir "El promedio es ", prom;
	
FinAlgoritmo
