/*Ejercicios: */
///Autor: Ernesto José Riveiro
///Fecha: DD/MM/YY
///Comentario: None

#include<iostream>

using namespace std;

int main(){
    int num, contadorPrimos=0;

	for (int i=0; i<10; i++) {
        int divisores=0;

        cout<<i+1<<". Ingrese un numero: ";
        cin>>num;

        for (int j=1; j<=num; j++) {
            if (num%j==0) {
                divisores++;
            }
        }

        if (divisores==2) {
            contadorPrimos++;
        }
	}

	cout<<"Cantidad de numeros primos: "<<contadorPrimos<<endl;

	system("pause");
	return 0;
}
