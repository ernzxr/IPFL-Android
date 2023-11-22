/*Ejercicios: */
///Autor: Ernesto José Riveiro
///Fecha: DD/MM/YY
///Comentario: None

#include<iostream>

using namespace std;

int main(){
    int num,cOrdenados=0,grupoMayorPorcentaje;
    float pMaxGrupo;

	for(int i=0;i<2;i++){
        bool primo=false,ordenados=true,primerOrden=false;
        int x=0,cImpares=0,cPares=0,posicionUltimoPrimo,ultimoPrimo,numOrden;
        float pImpares;

        cout<<"Grupo "<<i+1<<endl;
        cout<<"Ingrese un numero: ";
        cin>>num;

        while(num!=0){
            int divisores=0;
            x++;

            if(num%2!=0){
                cImpares++;
            }
            else{
                cPares++;
            }

            for(int j=1;j<=num;j++){
                if(num%j==0){
                    divisores++;
                }
            }
            if(divisores==2){
                primo=true;
                posicionUltimoPrimo=x;
                ultimoPrimo=num;
            }

            if(!primerOrden){
                numOrden=num;
                primerOrden=true;
            }
            else if(num>numOrden){
                ordenados=false;
            }

            cout<<"Ingrese un numero: ";
            cin>>num;
        }

        pImpares = (float)(cImpares*100)/(float)(cImpares+cPares);

        if(i==0){
            pMaxGrupo=pImpares;
            grupoMayorPorcentaje=i+1;
        }
        else if(pImpares>pMaxGrupo){
            pMaxGrupo=pImpares;
            grupoMayorPorcentaje=i+1;
        }

        if(primo){
            cout<<"El ultimo primo del grupo "<<i+1<<" es el numero "<<ultimoPrimo<<" y se encuentra en la posicion "<<posicionUltimoPrimo<<endl;
        }
        else {
            cout<<"No hay numeros primos en el grupo."<<endl;
        }

        if(ordenados){
            cOrdenados++;
        }
	}

	cout<<"El grupo con mayor porcentaje de numeros impares positivos es el "<<grupoMayorPorcentaje<<endl;
	cout<<"El total de grupos ordenados de mayor a menor son "<<cOrdenados<<endl;
	cout<<endl;

	system("pause");
	return 0;
}
