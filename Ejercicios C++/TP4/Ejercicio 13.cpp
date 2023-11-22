/*Ejercicios: */
///Autor: Ernesto José Riveiro
///Fecha: DD/MM/YY
///Comentario: None

#include<iostream>

using namespace std;

int main(){
    int num, ultimoImpar, anteultimoImpar;
    bool flagPrimerImpar = false;

    cout<<"Ingrese un numero: ";
    cin>>num;

	while (num != 0) {
        if (!flagPrimerImpar && num % 2 != 0) {
            ultimoImpar = num;
            flagPrimerImpar = true;
        }
        else if (num % 2 != 0) {
            anteultimoImpar = ultimoImpar;
            ultimoImpar = num;
        }

        cout<<"Ingrese un numero: ";
        cin>>num;
	}

	cout<<"Anteultimo impar: "<<anteultimoImpar<<" y ultimo impar: "<<ultimoImpar<<endl;

	cout<<endl;

	system("pause");
	return 0;
}
