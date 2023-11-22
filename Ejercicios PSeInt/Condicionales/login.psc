Algoritmo login
	Definir ingresoUsuario, ingresoClave, usuario, clave Como Caracter;
	
	usuario = "programador";
	clave = "AbCd007";
	
	Escribir "Ingrese su usuario: ";
	Leer ingresoUsuario;
	
	Escribir "Ingrese su clave: ";
	Leer ingresoClave;
	
	Si (ingresoUsuario <> usuario) Entonces
		Escribir "El usuario ingresado no existe.";
	SiNo
		Si (ingresoClave <> clave) Entonces
			Escribir "Clave incorrecta.";
		SiNo
			Escribir "Acceso concedido!";
		FinSi
	FinSi
FinAlgoritmo
