/* a) Ler duas matrizes A e B de uma dimensão com 12 elementos. A matriz A deverá aceitar
apenas a entrada de valores que sejam divisíveis por 2 ou 3, enquanto a matriz B deverá
aceitar apenas a entrada de valores que não sejam múltiplos de 5. A entrada das matrizes
deverá ser validada pelo programa e não pelo usuário. Construir uma matriz C de forma que
a matriz C seja a junção das matrizes A e B, e de forma que a matriz C contenha 24
elementos. Apresentar a matriz C. */

void main(){
    int tam=12;
    var a = new int[tam];
    var b = new int[tam];
    var c = new int[a.length + b.length];
    
    IO.println("Vetor A: ");
    for (int cont=0;cont<a.length;cont++){
        do {
            a[cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
            if (a[cont]%2!=0 && a[cont]%3!=0)
                IO.println("Apenas valores divisíveis por 2 ou 3");
        } while(a[cont]%2!=0 && a[cont]%3!=0);
        c[cont] = a[cont];
    }
    IO.println("Vetor B: ");
    for (int cont=0;cont<b.length;cont++){
        do {
            b[cont] = Integer.parseInt(IO.readln("B[" + cont + "]: "));
            if (b[cont]%5==0)
                IO.println("Apenas valores que não sejam múltiplos de 5");
        } while(b[cont]%5==0);        
        c[a.length+cont] = b[cont];
    }
    IO.println("Vetor C: ");
    for (int cont=0;cont<c.length;cont++)
        IO.println("C[" + cont + "]: " + c[cont]);
}    