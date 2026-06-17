/* h) Ler uma matriz A de duas dimensões com 10 linhas e 7 colunas. Ao final apresentar o total de
elementos pares e o total de elementos ímpares existentes dentro da matriz. Apresentar também o
percentual de elementos pares e ímpares em relação ao total de elementos da matriz. Supondo a
existência de 20 elementos pares e 50 elementos ímpares, ter-se-ia 28.6 % de elementos pares e
71,4% de elementos ímpares. */

void main(){
    double qtdElementosPares=0, qtdElementosImpares=0;
    int lin=10, col=7;
    var A = new int[lin][col];

    IO.println("---- MATRIZ A ----");
    for (int l=0;l<lin;l++)
        for (int c=0;c<col;c++){
            A[l][c] = Integer.parseInt(IO.readln("Digite A[" + (l+1) + "][" + (c+1) + "]: "));
            if (A[l][c]%2==0)
                qtdElementosPares++;
            else
                qtdElementosImpares++;
        }

    IO.println("---- MATRIZ A ----");
    for (int l=0;l<lin;l++){
        for (int c=0;c<col;c++) 
            System.out.printf("%5d",A[l][c]);
        IO.println(); 
    }    
    System.out.printf("Quantidade de elementos pares na matriz: %.0f \n", qtdElementosPares);
    System.out.printf("Quantidade de elementos ímpares na matriz: %.0f \n", qtdElementosImpares);
    System.out.printf("Percentual de elementos pares na matriz: %.1f%% \n", (qtdElementosPares/(lin*col))*100);
    System.out.printf("Percentual de elementos ímpares na matriz: %.1f%% \n", (qtdElementosImpares/(lin*col))*100);

}