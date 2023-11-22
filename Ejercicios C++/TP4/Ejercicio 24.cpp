/*Ejercicios: */
///Autor: Ernesto José Riveiro
///Fecha: DD/MM/YY
///Comentario: None

#include<iostream>

using namespace std;

int main(){
	int cliente, clienteMenorConsumo, menorConsumo, importe, recaudacion1 = 0, recaudacion2 = 0, recaudacion3 = 0, kilovatios, localidad, maxConsumo1 = 0, maxConsumo2 = 0, maxConsumo3 = 0, clienteMaxConsumo1, clienteMaxConsumo2, clienteMaxConsumo3;
	bool flagMenorConsumo = false;

	cout<<"Ingrese el numero de cliente: ";
	cin>>cliente;

	while (cliente != 0) {
        cout<<"Localidad del cliente: ";
        cin>>localidad;

        cout<<"Ingrese el consumo realizado: ";
        cin>>kilovatios;

        switch (localidad) {
        case 1:
            if (kilovatios > maxConsumo1) {
                maxConsumo1 = kilovatios;
                clienteMaxConsumo1 = cliente;
            }
            if (kilovatios > 200) {
                importe = 10 * 100 + 12 * 100 + 15 * (kilovatios - 200) + 100;
            }
            else if (kilovatios > 100) {
                importe = 10 * 100 + 12 * (kilovatios - 100) + 100;
            }
            else {
                importe = 10 * kilovatios + 100;
            }
            recaudacion1 += importe;
            break;
        case 2:
            if (kilovatios > maxConsumo2) {
                maxConsumo2 = kilovatios;
                clienteMaxConsumo2 = cliente;
            }
            if (kilovatios > 200) {
                importe = 10 * 100 + 12 * 100 + 15 * (kilovatios - 200) + 100;
            }
            else if (kilovatios > 100) {
                importe = 10 * 100 + 12 * (kilovatios - 100) + 100;
            }
            else {
                importe = 10 * kilovatios + 100;
            }
            recaudacion2 += importe;
            break;
        case 3:
            if (kilovatios > maxConsumo3) {
                maxConsumo3 = kilovatios;
                clienteMaxConsumo3 = cliente;
            }
            if (kilovatios > 200) {
                importe = 10 * 100 + 12 * 100 + 15 * (kilovatios - 200) + 100;
            }
            else if (kilovatios > 100) {
                importe = 10 * 100 + 12 * (kilovatios - 100) + 100;
            }
            else {
                importe = 10 * kilovatios + 100;
            }
            recaudacion3 += importe;
            break;
        default:
            cout<<"Localidad invalida."<<endl;
        }

        if (!flagMenorConsumo && kilovatios > 0) {
            clienteMenorConsumo = cliente;
            menorConsumo = kilovatios;
        }
        else if (kilovatios < menorConsumo && kilovatios > 0) {
            clienteMenorConsumo = cliente;
            menorConsumo = kilovatios;
        }

        cout<<"Ingrese el numero de cliente: ";
        cin>>cliente;
	}

	cout<<endl;

	system("pause");
	return 0;
}
