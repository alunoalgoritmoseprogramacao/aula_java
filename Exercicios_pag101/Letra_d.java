/* d) Ler duas matrizes A e B de duas dimensões com 5 linhas e 5 colunas. A matriz A deverá ser
formada por valores que não sejam divisíveis por 3, enquanto a matriz B deverá ser formada por
valores que não sejam divisíveis por 6. As entradas dos valores nas matrizes deverão ser validadas
pelo programa então pelo usuário. Construir e apresentar uma matriz C de mesma dimensão e
número de elementos que contenha a soma dos elementos da matrizes A e B.  */

void main(){
    int lin=5, col=5;
    var A = new int[lin][col];
    var B = new int[lin][col];
    var C = new int[lin][col];

    IO.println("---- MATRIZ A ----");
    for (int l=0;l<lin;l++)
        for (int c=0;c<col;c++)
            do{
                A[l][c] = Integer.parseInt(IO.readln("Digite A[" + (l+1) + "][" + (c+1) + "]: "));
            } while (A[l][c]%3==0);

    IO.println("---- MATRIZ B ----");
    for (int l=0;l<lin;l++)
        for (int c=0;c<col;c++){
            do{
                B[l][c] = Integer.parseInt(IO.readln("Digite B[" + (l+1) + "][" + (c+1) + "]: "));
            } while (B[l][c]%6==0);
            C[l][c] = A[l][c]+B[l][c];
        }

    IO.println("---- MATRIZES ----");
    for (int l=0;l<lin;l++){
        for (int c=0;c<col;c++) 
            System.out.printf("%5d",A[l][c]);
        IO.print("      ");
        for (int c=0;c<col;c++) 
            System.out.printf("%5d",B[l][c]);
        IO.print("      ");
        for (int c=0;c<col;c++) 
            System.out.printf("%5d",C[l][c]);        
        IO.println(); 
    }      

            

        

}