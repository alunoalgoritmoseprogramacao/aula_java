/* f) Ler duas matrizes do tipo vetor, sendo A com 20 elementos e B com 30 elementos. 
Construir uma matriz C, sendo esta a junção das duas outras matrizes. Desta forma, 
C deverá ter a capacidade de armazenar 50 elementos. Apresentar a matriz C.  */

void main(){
    int ta=20, tb=30;
    var a = new int[ta];
    var b = new int[tb];
    var c = new int[ta+tb];
    
    IO.println("Vetor A: ");
    for (int cont=0;cont<a.length;cont++){
        a[cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        c[cont] = a[cont];
//        IO.println("C[" + cont + "] = " + c[cont]);
    }
    IO.println("Vetor B: ");
    for (int cont=0;cont<b.length;cont++){
        b[cont] = Integer.parseInt(IO.readln("B[" + cont + "]: "));
        c[ta+cont] = b[cont];
//        IO.println("C[" + (ta+cont) + "] = " + c[ta+cont]);

    }
    IO.println("Vetor C: ");
    for (int cont=0;cont<c.length;cont++)
        IO.println("C[" + cont + "]: " + c[cont]);
} 