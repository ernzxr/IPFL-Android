/*Ejercicios: */
///Autor: Ernesto José Riveiro
///Fecha: DD/MM/YY
///Comentario: None

#include<iostream>

using namespace std;

int main(){
    int num, totalPositivos=0;

    for(int i=0;i<10;i++){
        bool primerImpar=false, primerPar=false;
        int maximoImpar, maximoPar, cPositivos=0, cNegativos=0;
        float pNegativos, pPositivos;

        cout<<"Grupo "<<i+1<<endl;
        cout<<"Ingrese un numero: ";
        cin>>num;

        while(num!=0){
            if(!primerImpar && num%2!=0){
                primerImpar=true;
                maximoImpar=num;
            }
            else if(num%2!=0 && num>maximoImpar){
                maximoImpar=num;
            }

            if(!primerPar && num%2==0){
                primerPar=true;
                maximoPar=num;
            }
            else if(num%2==0 && num>maximoPar){
                maximoPar=num;
            }

            if(num>0){
                cPositivos++;
                totalPositivos++;
            }
            else if(num<0){
                cNegativos++;
            }

            cout<<"Ingrese un numero: ";
            cin>>num;
        }

        pNegativos=(float)(cNegativos*100)/(float)(cPositivos+cNegativos);
        pPositivos=(float)(cPositivos*100)/(float)(cPositivos+cNegativos);

        cout<<"Maximo par: "<<maximoPar<<endl;
        cout<<"Maximo impar: "<<maximoImpar<<endl;
        cout<<"Porcentaje de positivos %"<<pPositivos<<endl;
        cout<<"Porcentaje de negativos %"<<pNegativos<<endl;
    }

    cout<<"Entre todos los grupos habia un total de "<<totalPositivos<<" numeros positivos."<<endl;
	cout<<endl;

	system("pause");
	return 0;
}
