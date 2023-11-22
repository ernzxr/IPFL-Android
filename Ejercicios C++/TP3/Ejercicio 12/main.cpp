#include <iostream>

using namespace std;

int main()
{
    int i, num, pImpar, sImpar, check1, check2;

    check1 = check2 = 0;

    for (i = 0; i < 7; i++) {
        cout << i + 1 << ". Ingrese un numero: ";
        cin >> num;

        if (check1 == 0 && num % 2 != 0) {
            check1 = 1;
            pImpar = num;
        }
        else if (check2 == 0 && num % 2 != 0) {
            check2 = 1;
            sImpar = num;
        }
    }

    cout << "Primer impar: " << pImpar << " y segundo impar: " << sImpar << endl;

    return 0;
}
