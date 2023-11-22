Algoritmo bancosParaAlumnos
	Definir bancos, alumnos, sobrantes Como Entero;
	
	Escribir '1. Ingrese la cantidad de alumnos inscriptos: ';
	Leer alumnos;
	
	Escribir '2. Ingrese la cantidad de bancos disponibles : ';
	Leer bancos;
	
	sobrantes = bancos - alumnos;
	
	Si (sobrantes<0) Entonces
		sobrantes = sobrantes * (-1);
		Escribir 'No alcanzan los bancos, faltan ', sobrantes;
	SiNo
		Si  (sobrantes >= 0) Entonces
			Si (sobrantes == 0) Entonces
				Escribir 'Alcanzan los bancos y no sobra ninguno.';
			SiNo
				Escribir "Alcanzan los bancos y sobraron ", sobrantes;
			FinSi
		FinSi
	FinSi
FinAlgoritmo
