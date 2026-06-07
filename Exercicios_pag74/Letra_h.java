/* h) Ler três matrizes (A, B e C) de uma dimensão com 5 elementos cada. Construir 
   uma matriz D, sendo esta a junção das três outras matrizes. Desta forma D deverá 
   ter o triplo de elementos, ou seja, 15. Apresentar os elementos da matriz D.  */

 
void main(){
    int tam=5;
    var a = new int[tam]; 
    var b = new int[tam]; 
    var c = new int[tam];
    var d = new int[a.length + b.length + c.length];
    
    IO.println("Vetor A: ");
    for (int cont=0;cont<a.length;cont++){
        a[cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        d[cont] = a[cont]; // d[0] até d[4]
    }
    IO.println("Vetor B: ");
    for (int cont=0;cont<b.length;cont++){
        b[cont] = Integer.parseInt(IO.readln("B[" + cont + "]: "));
        d[a.length+cont] = b[cont]; // d[5] até d[9]
    }
    IO.println("Vetor C: ");
    for (int cont=0;cont<c.length;cont++){
        c[cont] = Integer.parseInt(IO.readln("C[" + cont + "]: "));
        d[(a.length+b.length)+cont] = c[cont]; // d[10] até d[14]
    }    
    IO.println("Vetor D: ");
    for (int cont=0;cont<d.length;cont++)
        IO.println("D[" + cont + "]: " + d[cont]);
}   