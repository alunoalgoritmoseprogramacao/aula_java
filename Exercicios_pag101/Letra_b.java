/* b) Ler uma matriz A de duas dimensões com 8 linhas e 6 colunas. Construir uma matriz B de uma
dimensão que seja formada pela soma de cada linha da matriz A. Ao final apresentar o somatório
dos elementos da matriz B. */

void main(){
    int lin=8, col=6, somaB=0;
    var A = new int[lin][col];
    var B = new int[lin];

    IO.println("---- MATRIZ A ----");
    for(int l=0; l<lin; l++){
        B[l]=0;
        for(int c=0; c<col; c++){
            A[l][c] = Integer.parseInt(IO.readln("Informe o elemento A[" + (l+1) + (c+1) + "] "));
            B[l] = B[l] + A[l][c];
        }
        somaB = somaB + B[l];
    }

    IO.println("Somatório dos elementos de B " + somaB);
}