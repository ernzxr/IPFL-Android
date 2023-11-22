Algoritmo consumicionBar
	// declaracion de variables
	Definir montoAbonado, importe, vuelto Como Real;
	
	// ingreso de datos
	Escribir "1. Ingrese el importe de la consumicion: ";
	Leer importe;
	Escribir "2. Ingrese el monto abonado: ";
	Leer montoAbonado;
	
	// procesamiento de datos
	vuelto = montoAbonado - importe;
	
	// impresion de datos
	Escribir "El vuelto del pago es ", vuelto, "$";
FinAlgoritmo
