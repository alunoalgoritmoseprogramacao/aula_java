/* a) Ler duas matrizes A e B, cada uma com uma dimensão para 12 elementos. Construir uma matriz C
de duas dimensões, sendo que a primeira coluna da matriz C deverá ser formada pelos elementos
da matriz A multiplicados por 2 e a segunda coluna deverá ser formada pelos elementos da matriz B
subtraídos de 5. Apresentar a matriz C.  */

void main(){
    int t=12;
    var A = new int[t];
    var B = new int[t];
    var C = new int[t][2];

    IO.println("--- VETOR A ---");
    for (int l=0; l<A.length; l++){
        A[l] = Integer.parseInt(IO.readln("Informe A[" + l +"]: "));
        C[l][0] = A[l]*2;
    }
    IO.println("--- VETOR B ---");
    for (int l=0; l<B.length; l++){
        B[l] = Integer.parseInt(IO.readln("Informe B[" + l +"]: "));
        C[l][1] = B[l]-5;
    }
    IO.println("--- MATRIZ C ---");
    for(int l=0; l<C.length; l++){
        for(int c=0; c<2; c++)
            System.out.printf("%5d", C[l][c]);
        IO.println();
    }
       
}