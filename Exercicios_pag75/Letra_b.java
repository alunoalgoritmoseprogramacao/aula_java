/* b) Ler uma matriz A do tipo vetor com 15 elementos. Construir uma matriz B de mesmo 
   tipo, sendo que cada elemento da matriz B seja o fatorial do elemento correspondente 
   da matriz A. Apresentar as matrizes A e B. */

void main(){
    int tam=15;
    var a = new int[tam];
    var b = new int[tam];
    
    IO.println("Vetor A: ");
    for (int cont=0;cont<a.length;cont++){
        a[cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        b[cont] = 1;
        for (int cont1=1; cont1<=a[cont]; cont1++)
            b[cont] = b[cont] * cont1;
    }
    IO.println("Vetor B: ");
    for (int cont=0;cont<tam;cont++)
        IO.println("B[" + (cont) + "]: " + b[cont]);
}   