Algoritmo porcentajeAlumnos
	// declaracion de variables
	Definir totalAlumnos, cantidadHombres, cantidadMujeres, porcentajeH, porcentajeM Como Real;
	
	// ingreso de datos
	Escribir "1. Ingrese la cantidad de hombres en el curso: ";
	Leer cantidadHombres;
	Escribir "2. Ingrese la cantidad de mujeres en el curso: ";
	Leer cantidadMujeres;
	
	// proceso de datos
	totalAlumnos = cantidadHombres + cantidadMujeres;
	porcentajeH = (cantidadHombres * 100) / totalAlumnos;
	porcentajeM = (cantidadMujeres * 100) / totalAlumnos;
	
	// salida de datos
	Escribir "Hay un total de ", totalAlumnos, " de alumnos.";
	Escribir "El porcentaje de hombres es ", porcentajeH, "%";
	Escribir "El porcentaje de mujeres es ", porcentajeM, "%";
FinAlgoritmo
