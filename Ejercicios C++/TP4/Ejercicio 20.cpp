/*Ejercicios: */
///Autor: Ernesto José Riveiro
///Fecha: DD/MM/YY
///Comentario: None

#include<iostream>

using namespace std;

int main(){
	int num, divisor = 1, acumulador = 0;

	cout<<"Ingrese un numero: ";
    cin>>num;

	while(divisor < num) {
        if (num % divisor == 0) {
            acumulador += divisor;
        }
        divisor++;
	}

	if (acumulador == num && num != 0) {
        cout<<"El numero es perfecto";
	}
	else {
        cout<<"El numero no es perfecto";
	}


	cout<<endl;

	system("pause");
	return 0;
}
