Algoritmo exentoIva
	Definir articulo Como Caracter;
	Definir precio, precioFinal, iva Como Real;
	Definir inscripto Como Entero;
	
	Escribir "1. Ingrese el nombre del articulo: ";
	Leer articulo;
	
	Escribir "2. Ingrese el precio del articulo: ";
	Leer precio;
	
	Escribir "3. Esta inscripto en iva? [1] SI o [2] NO: ";
	Leer inscripto;
	
	Si (inscripto == 1) Entonces
		iva = precio * 0.21;
		precioFinal = precio + iva;
		Escribir "Articulo: ", articulo, ", Costo $", precio, " + iva $", iva;
		Escribir "Precio final $", precioFinal;
	SiNo
		Escribir "Debe abonar $", precio;
	FinSi
FinAlgoritmo
