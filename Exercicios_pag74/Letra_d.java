/* d) Ler 15 elementos de uma matriz tipo vetor. Construir uma matriz B de mesmo tipo, 
   observando a seguintes lei de formação: “Todo elemento de B deverá ser o quadrado do 
   elemento de A correspondente”. Apresentar as matrizes A e B. */

void main(){
    int tam=5;
    var a = new int[tam];
    var b = new int[tam];
    
    IO.println("Vetor A: ");
    for (int cont=0;cont<tam;cont++){
        a[cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        b[cont] = a[cont] * a[cont]; 
    }
    IO.println("Vetor A: ");
    for (int cont=0;cont<tam;cont++)
        IO.println("A[" + (cont) + "]: " + a[cont]);

    IO.println("Vetor B: ");
    for (int cont=0;cont<tam;cont++)
        IO.println("B[" + (cont) + "]: " + b[cont]);
}