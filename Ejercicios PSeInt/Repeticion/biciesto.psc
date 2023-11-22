Algoritmo biciesto
	Definir a Como Entero;
	Leer a;
	Si (a MOD 100==0 Y a MOD 400<>0) Entonces
		Escribir 'No';
	SiNo
		Si (a MOD 4==0) Entonces
			Escribir 'Si';
		SiNo
			Escribir 'No';
		FinSi
	FinSi
FinAlgoritmo
