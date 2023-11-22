Algoritmo alambradoLote
	// declaracion de variables
	Definir lado1, lado2, perimetroLote, alambre, cobertura, sobrante Como Entero;
	
	// ingreso de datos
	Escribir "1. Ingrese los metros de alambre disponibles: ";
	Leer alambre;
	
	// calculos
	lado1 = 100;
	lado2 = 250;
	perimetroLote = lado1 * 2 + lado2 * 2;
	cobertura = trunc(alambre / perimetroLote);
	sobrante = alambre % perimetroLote;
	
	// impresion de datos
	Escribir "Se pueden dar ", cobertura, " vueltas completas al lote con alambrado.";
	Escribir "Sobran ", sobrante, " metros de alambre.";
FinAlgoritmo
