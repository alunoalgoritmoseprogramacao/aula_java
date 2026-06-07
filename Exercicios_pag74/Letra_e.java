/* e) Ler duas matrizes A e B do tipo vetor com 15 elementos cada. Construir uma matriz C, 
   sendo esta a junção das duas outras matrizes. Desta forma, C deverá ter o dobro de 
   elementos, ou seja, 30. Apresentar a matriz C.  */
   

void main(){
    int tam=15;
    var a = new int[tam];
    var b = new int[tam];
    var c = new int[tam+tam];
    
    IO.println("Vetor A: ");
    for (int cont=0;cont<a.length;cont++){
        a[cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        c[cont] = a[cont];
    }
    IO.println("Vetor B: ");
    for (int cont=0;cont<b.length;cont++){
        b[cont] = Integer.parseInt(IO.readln("B[" + cont + "]: "));
        c[cont+5] = b[cont];
    }
    IO.println("Vetor C: ");
    for (int cont=0;cont<c.length;cont++)
        IO.println("C[" + cont + "]: " + c[cont]);
} 