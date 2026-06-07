/* c) Ler duas matrizes A e B do tipo vetor com 20 elementos. Construir uma matriz C, 
   onde cada elemento de C é a subtração do elemento correspondente de A com B. 
   Apresentar a matriz C.  */

void main(){
    int tam=20;
    var a = new int[tam];
    var b = new int[tam];
    var c = new int[tam];
    
    IO.println("Vetor A: ");
    for (int cont=0;cont<a.length;cont++){
        a[cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
    }
    IO.println("Vetor B: ");
    for (int cont=0;cont<b.length;cont++){
        b[cont] = Integer.parseInt(IO.readln("B[" + cont + "]: "));
        c[cont] = a[cont] - b[cont];
    }
    IO.println("Vetor C: ");
    for (int cont=0;cont<c.length;cont++)
        IO.println("C[" + cont + "]: " + c[cont]);
}   