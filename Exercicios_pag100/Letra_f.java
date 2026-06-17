/* f) Ler uma matriz A de duas dimensões com 7 linhas e 7 colunas. Construir uma matriz B de mesma
dimensão, sendo que cada elemento da matriz B deverá ser o somatório de cada elemento
correspondente da matriz A com o os seus índices (ou seja, se A[1,2] possui o valor 8, B[1,2]
deverá possuir o valor 11, correspondente a 8+1+2), com exceção para os valores situados nos
índices ímpares da diagonal principal (B[1,1], B[3,3] , B[5,5] , B[7,7]), os quais deverão ser 
o fatorial de cada elemento correspondente da matriz A. Apresentar ao final a matriz A e B 
lado a lado.  */

void main(){
    int t = 7;
    var A = new int[t][t];
    var B = new int[t][t];

    IO.println("---- MATRIZ A ----");
    for (int l=0;l<t;l++)
        for (int c=0;c<t;c++){
            A[l][c] = Integer.parseInt(IO.readln("Digite A[" + (l+1) + "][" + (c+1) + "]: "));
            if ((l==c) && ((l+1)%2!=0)){
                B[l][c]=1;
                for(int cont=1; cont<=A[l][c]; cont++)
                    B[l][c] = B[l][c] * cont;
            }
            else
                B[l][c] = A[l][c] + (l+1) + (c+1);
        }
    IO.println("---- MATRIZES ----");
    for (int l=0;l<t;l++){
        for (int c=0;c<t;c++) 
            System.out.printf("%5d",A[l][c]);
        IO.print("      ");
        for (int c=0;c<t;c++) 
            System.out.printf("%5d",B[l][c]);
        IO.println(); 
    }    


        
}