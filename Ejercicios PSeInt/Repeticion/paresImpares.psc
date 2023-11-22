Algoritmo sin_titulo
	Definir contadorPares,paresCheck,i,num Como Entero;
	contadorPares <- 0;
	paresCheck <- 0;
	Para i<-0 Hasta 10 Hacer
		Escribir 'Ingrese un numero: ';
		Leer num;
		Si (num MOD 2<>0) Entonces
			paresCheck <- paresCheck+1;
		SiNo
			paresCheck = 0;
		FinSi
		
		Si (paresCheck > 1) Entonces
			contadorPares = contadorPares + 1;
		FinSi
	FinPara
	
	Escribir "La cantidad de parejas impares que hay es: ", contadorPares;
FinAlgoritmo
