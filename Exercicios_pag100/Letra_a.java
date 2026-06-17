/* a) Ler duas matrizes A e B, cada uma de duas dimensões com 5 linhas e 3 colunas. 
   Construir uma matriz C de mesma dimensão, que é formada pela soma dos elementos 
   da matriz A com os elementos da matriz B. Apresentar a matriz C.  */

void main(){
    int linhas=5, colunas=3;
    var A = new int[linhas][colunas];
    var B = new int[linhas][colunas];
    var C = new int[linhas][colunas];

    IO.println("---- MATRIZ A ----");
    for(int l=0; l<linhas; l++)
        for(int c=0; c<colunas; c++)
            A[l][c] = Integer.parseInt(IO.readln("Informe o elemento A[" + (l+1) + (c+1) + "] "));

    IO.println("---- MATRIZ B ----");
    for(int l=0; l<linhas; l++)
        for(int c=0; c<colunas; c++){
            B[l][c] = Integer.parseInt(IO.readln("Informe o elemento B[" + (l+1) + (c+1) + "] "));
            C[l][c] = A[l][c] + B[l][c];
        }
    
    IO.println("---- MATRIZ A ----");
    for(int l=0; l<linhas; l++){
        for(int c=0; c<colunas; c++)
            System.out.printf("%5d", A[l][c]);
        System.out.println();
    }

    IO.println("---- MATRIZ B ----");
    for(int l=0; l<linhas; l++){
        for(int c=0; c<colunas; c++)
            System.out.printf("%5d", B[l][c]);
        System.out.println();
    }

    IO.println("---- MATRIZ C ----");
    for(int l=0; l<linhas; l++){
        for(int c=0; c<colunas; c++)
            System.out.printf("%5d", C[l][c]);
        System.out.println();
    }


}   