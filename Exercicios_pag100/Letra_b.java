/* b) Ler duas matrizes A e B, cada uma com uma dimensão para 7 elementos. Construir uma matriz
      C de duas dimensões, em que a primeira coluna deverá ser formada pelos elementos da matriz 
      A e a segunda coluna deverá ser formada pelos elementos da matriz B. Apresentar a matriz C. */
    
void main(){
    var A = new int[7];
    var B = new int[7];
    var C = new int[7][2];

    IO.println("--- VETOR A ---");
    for (int l=0; l<A.length; l++){
        A[l] = Integer.parseInt(IO.readln("Informe A[" + l +"]: "));
        C[l][0] = A[l];
    }
    IO.println("--- VETOR B ---");
    for (int l=0; l<B.length; l++){
        B[l] = Integer.parseInt(IO.readln("Informe B[" + l +"]: "));
        C[l][1] = B[l];
    }
    IO.println("--- MATRIZ C ---");
    for(int l=0; l<7; l++){
        for(int c=0; c<2; c++)
            System.out.printf("%5d", C[l][c]);
        IO.println();
    }
       
}