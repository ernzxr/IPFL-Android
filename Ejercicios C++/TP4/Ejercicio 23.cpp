/*Ejercicios: */
///Autor: Ernesto José Riveiro
///Fecha: DD/MM/YY
///Comentario: None

#include<iostream>

using namespace std;

int main(){
    int password = 1234, intento = 0, ingreso;
    bool bandera = false;


    while (intento != 3 && !bandera) {
        cout<<"Ingrese su contrasenia: ";
        cin>>ingreso;

        if (ingreso == password) {
            cout<<"Bienvenido."<<endl;
            bandera = true;
        }
        else {
            cout<<"Contrasenia invalida."<<endl;
            intento++;
        }

        if (intento == 3) {
            cout<<"Intentos agotados."<<endl;
        }
    }

	cout<<endl;

	system("pause");
	return 0;
}
