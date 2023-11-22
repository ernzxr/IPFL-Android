Algoritmo costoProducto
	// declaracion de variables
	Definir nombreArticulo Como Caracter;
	Definir cuotas Como Entero;
	Definir precioContado, precioTotal, interesCuota, tasa, precioCuota Como Real;
	
	// ingreso de datos
	Escribir "1. Ingrese el nombre del articulo: ";
	Leer nombreArticulo;
	Escribir "2. Ingrese el precio del producto al contado: ";
	Leer precioContado;
	Escribir "3. Ingrese la cantidad de cuotas para el pago: ";
	Leer cuotas;
	Escribir "4. Ingrese el % de interes de cada cuota: ";
	Leer tasa;
	
	// operacion de datos
	precioCuota = redon(precioContado * (tasa / 100));
	interesCuota = precioCuota * cuotas;
	precioTotal = precioContado + interesCuota;
	
	// salida de datos
	Escribir "Articulo: ", nombreArticulo, " - Precio: ", precioContado, "$";
	Escribir "Se hace el pago en ", cuotas, " cuotas.";
	Escribir "Cada cuota es de: ", precioCuota, "$";
FinAlgoritmo
