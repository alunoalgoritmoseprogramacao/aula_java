/* i) Ler 15 elementos reais para uma matriz A de uma dimensão do tipo vetor. Construir 
   uma matriz B de mesmo tipo e dimensão, observando a seguinte lei de formação: 
   “Todo elemento da matriz A que possuir índice par deverá ter seu elemento dividido 
   por 2; caso contrário, o elemento da matriz A deverá ser multiplicado por 1.5”. 
   Apresentar as matrizes A e B lado a lado.  */

void main(){
    int tam=15;
    var a = new double[tam];
    var b = new double[tam];
    
    IO.println("Vetor A: ");
    for (int cont=0;cont<a.length;cont++){
        a[cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        if(cont%2==0)
            b[cont] = a[cont] / 2;
        else
            b[cont] = a[cont] * 1.5;
    }
    IO.println("Vetor B: ");
    for (int cont=0;cont<tam;cont++)
        IO.println("A[" + (cont) + "]: " + a[cont] + "/ B[" + (cont) + "]: " + b[cont]);
}   