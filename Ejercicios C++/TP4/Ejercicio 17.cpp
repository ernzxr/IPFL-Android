/*Ejercicios: */
///Autor: Ernesto José Riveiro
///Fecha: DD/MM/YY
///Comentario: None

#include<iostream>

using namespace std;

int main(){
    int num, maximo, numAnterior;
    bool primerIngreso = false, consecutivo = false;

    while (!consecutivo) {
        cout<<"Ingrese un numero: ";
        cin>>num;
        if (!primerIngreso) {
            maximo = num;
            numAnterior = num;
            primerIngreso = true;
        }
        else if (num > maximo) {
                if (numAnterior == num) {
                    consecutivo = true;
                }
                else {
                    maximo = num;
                    numAnterior = num;
                }
        }
        else if (numAnterior == num) {
            consecutivo = true;
        }
        else {
            numAnterior = num;
        }
    }

    cout<<"Numero maximo: "<<maximo<<endl;

	cout<<endl;

	system("pause");
	return 0;
}
