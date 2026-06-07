/* j) Ler duas matrizes A e B de uma dimensão com 6 elementos. A matriz A deverá aceitar 
   apenas a entrada de valores pares, enquanto a matriz B deverá aceitar apenas a entrada 
   de valores ímpares.
   A entrada das matrizes deverá ser validada pelo programa e não pelo usuário. 
   Construir uma matriz C de forma que a matriz C seja a junção das matrizes A e B, 
   de modo que a matriz C contenha 12 elementos. Apresentar a matriz C.  */


void main(){
    int tam=6;
    var a = new int[tam];
    var b = new int[tam];
    var c = new int[a.length + b.length];
    
    IO.println("Vetor A: ");
    for (int cont=0;cont<a.length;cont++){
        do {
            a[cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
            if (a[cont]%2!=0)
                IO.println("Apenas valores pares");
        } while(a[cont]%2!=0);
        c[cont] = a[cont];
    }
    IO.println("Vetor B: ");
    for (int cont=0;cont<b.length;cont++){
        do {
            b[cont] = Integer.parseInt(IO.readln("B[" + cont + "]: "));
            if (b[cont]%2==0)
                IO.println("Apenas valores ímpares");
        } while(b[cont]%2==0);        
        c[a.length+cont] = b[cont];
    }
    IO.println("Vetor C: ");
    for (int cont=0;cont<c.length;cont++)
        IO.println("C[" + cont + "]: " + c[cont]);
}    