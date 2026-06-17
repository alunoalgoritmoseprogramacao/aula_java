/* c) Elaborar um programa que efetue a leitura de 20 valores inteiros em uma matriz A de duas
dimensões com 4 linhas e 5 colunas. Construir uma matriz B de uma dimensão para 4 elementos
que seja formada pelo somatório dos elementos correspondentes de cada linha da matriz A.
Construir tam’bem uma matriz C de uma dimensão para 5 elementos que seja formada pelo
somatório dos elementos correspondentes de cada coluna da matriz A. Ao final o programa deverá
apresentar o total do somatório dos elementos da matriz B com o somatório dos elementos da
matriz C.  */

void main(){
    int lin=4, col=5, somaB=0, somaC=0;
    var A = new int[lin][col];
    var B = new int[lin];
    var C = new int[col];

    for(int c=0; c<col; c++)
        C[c] = 0;

    IO.println("---- MATRIZ A ----");
    for(int l=0; l<lin; l++){
        B[l]=0;
        for(int c=0; c<col; c++){
            A[l][c] = Integer.parseInt(IO.readln("Informe o elemento A[" + (l+1) + (c+1) + "] "));
            B[l] = B[l] + A[l][c];
            C[c] = C[c] + A[l][c];
        }
        somaB = somaB + B[l];
    }

    for(int c=0; c<col; c++)
        somaC = somaC + C[c];

    IO.println("---- MATRIZES ----");
    for (int l=0;l<lin;l++){
        for (int c=0;c<col;c++) 
            System.out.printf("%5d",A[l][c]);
        IO.print("  =  ");
        System.out.printf("%5d",B[l]);
        IO.println(); 
    }      
    IO.println("---------------------");
    for (int c=0;c<col;c++) 
        System.out.printf("%5d",C[c]);
    IO.println("");
    IO.println("Somatório dos elementos de B e C " + somaB + "+" + somaC + "=" + (somaB + somaC));
}