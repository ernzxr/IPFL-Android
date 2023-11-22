Algoritmo promedioNotas
	Definir nota1, nota2, nota3, promedio, acumuladorNotas Como Entero;
	
	Escribir "1. Ingrese la primer nota: ";
	Leer nota1;
	
	Escribir "2. Ingrese la segunda nota: ";
	Leer nota2;
	
	Escribir "3. Ingrese la tercer nota: ";
	Leer nota3;
	
	acumuladorNotas = nota1 + nota2 + nota3;
	
	promedio = redon(acumuladorNotas / 3);
	
	Si (promedio >= 7) Entonces
		Escribir "La materia fue aprobada con un promedio de ", promedio;
	SiNo
		Escribir "Materia desaprobada.";
	FinSi
FinAlgoritmo
