Algoritmo calcularPromedioNotas
	// declaracion de variables
	Definir nota1, nota2, nota3, promedio como Real;
	
	// ingreso de datos
	Escribir "1. Ingrese la primer nota de examen de matematicas: ";
	Leer nota1;
	Escribir "2. Ingrese la segunda nota de examen de matematicas: ";
	Leer nota2;
	Escribir "3. Ingrese la tercer nota de examen de matematicas: ";
	Leer nota3;
	
	// procesamiento de datos
	promedio = (nota1 + nota2 + nota3) / 3;
	
	// impresion de resultados
	Escribir "El promedio de las notas del alumno es ", promedio;
FinAlgoritmo
