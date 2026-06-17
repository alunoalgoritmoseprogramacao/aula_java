/* d) Ler uma matriz A de uma dimensão com 10 elementos. Construir uma matriz C de duas dimensões
com três colunas, em que a primeira coluna da matriz C é formada pelos elementos da matriz A
somados com mais 5, a segunda coluna é formada pelo valor do cálculo da fatorial de cada
elemento correspondente da matriz A e a terceira e última coluna deverá ser formada pelos
quadrados dos elementos correspondentes da matriz A. Apresentar a matriz C. (Observe que
fatorial de zero é igual a 1.) */

void main(){
    var A = new int[10];
    var C = new int[10][3];

    IO.println("---- MATRIZ A ----");
    for (int l=0; l<10; l++){
        A[l] = Integer.parseInt(IO.readln("Informe A[" + l + "]: "));
        C[l][0] = A[l]+5;
        C[l][1] = 1;
        for(int cont=1; cont<=A[l]; cont++)
            C[l][1] = C[l][1] * cont;
        C[l][2] = A[l] * A[l];
    }

    IO.println("---- MATRIZ C ----");
    for (int l=0;l<10;l++){
        for (int c=0;c<3;c++) 
            System.out.printf("%10d",C[l][c]);
        IO.println(); 
    }    


}