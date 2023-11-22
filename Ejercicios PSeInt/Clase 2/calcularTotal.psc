Algoritmo calcularTotal
	// declaracion de variables
	Definir precioArticulo1, precioArticulo2, precioArticulo3, importeTotal Como Real;
	
	// ingreso de datos
	Escribir "1. Ingrese el precio del primer articulo: ";
	Leer precioArticulo1;
	Escribir "2. Ingrese el precio del segundo articulo: ";
	Leer precioArticulo2;
	Escribir "3. Ingrese el precio del tercer articulo: ";
	Leer precioArticulo3;
	
	// procesamiento de datos
	importeTotal = precioArticulo1 + precioArticulo2 + precioArticulo3;
	
	// impresion de resultados
	Escribir "El importe total para los tres articulos es: ", importeTotal, "$";
FinAlgoritmo
