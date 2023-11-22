Algoritmo amigosFacturas
	Definir i, suma, dinero Como Entero;
	
	suma = 0;
	
	Para i = 1 Hasta 4 Con Paso 1
		Escribir i, ". Ingrese el dinero disponible: ";
		Leer dinero;
		suma = suma + dinero;
	FinPara
	
	suma = trunc(suma / 100);
	
	Escribir "Se pueden comprar ", suma, " facturas.";
	
FinAlgoritmo
