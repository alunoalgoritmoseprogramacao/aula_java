/* g) Ler uma matriz A de duas dimensões com 4 linhas e 4 colunas. Ao final apresentar o total de
elementos pares existentes dentro da matriz. (Observe que é o total de Elementos e não a soma
total do conteúdo dos elementos.) */

void main(){
    int qtdElementosPares=0;
    int t=4;
    var A = new int[t][t];

    IO.println("---- MATRIZ A ----");
    for (int l=0;l<t;l++)
        for (int c=0;c<t;c++){
            A[l][c] = Integer.parseInt(IO.readln("Digite A[" + (l+1) + "][" + (c+1) + "]: "));
            if (A[l][c]%2==0)
                qtdElementosPares++;
        }

    IO.println("---- MATRIZ A ----");
    for (int l=0;l<t;l++){
        for (int c=0;c<t;c++) 
            System.out.printf("%5d",A[l][c]);
        IO.println(); 
    }    
    IO.println("Quantidade de elementos pares na matriz: " + qtdElementosPares);


}