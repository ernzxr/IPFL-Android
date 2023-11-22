/*Ejercicios: */
///Autor: Ernesto José Riveiro
///Fecha: DD/MM/YY
///Comentario: None

#include<iostream>

using namespace std;

int main(){
    int num, i = 1, primerPar, ubicacionPrimerPar, ultimoPrimo, ubicacionUltimoPrimo;
    bool flagPrimerPar = false;

    cout<<"Ingrese un numero: ";
    cin>>num;

	while (num != 0) {
        int divisor = 1, divisores = 0;
        bool bandera = false;

        if (!flagPrimerPar && num % 2 == 0) {
            primerPar = num;
            ubicacionPrimerPar = i;
            flagPrimerPar = true;
        }

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
            ultimoPrimo = num;
            ubicacionUltimoPrimo = i;
        }

        i++;

        cout<<"Ingrese un numero: ";
        cin>>num;
	}

	cout<<"Primer par: "<<primerPar<<" en posicion: "<<ubicacionPrimerPar<<endl;
	cout<<"Ultimo primo: "<<ultimoPrimo<<" en posicion: "<<ubicacionUltimoPrimo<<endl;

	cout<<endl;

	system("pause");
	return 0;
}
