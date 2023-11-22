/*Ejercicios: */
///Autor: Ernesto José Riveiro
///Fecha: DD/MM/YY
///Comentario: None

#include<iostream>

using namespace std;

int main(){
	int num, divisor = 1, divisores = 0;
	bool bandera = false;

	cout<<"Ingrese un numero: ";
    cin>>num;

	while(divisor <= num && !bandera) {
        if (num % divisor == 0) {
            divisores++;
        }
        if (divisores > 2) {
            bandera = true;
        }
        divisor++;
	}

	if (divisores == 2) {
        cout<<"Es primo";
	}
	else {
        cout<<"No es primo";
	}

	cout<<endl;

	system("pause");
	return 0;
}
