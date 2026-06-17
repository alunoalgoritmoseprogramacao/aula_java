/* e) Ler uma matriz A de duas dimensões com 10 linhas e 10 colunas. Apresentar o somatório dos
elementos situados na diagonal principal (posições A[1,1], A[2,2], A[3,3], A[4,4] e assim por 
diante) da referida matriz. (Claro que não é para efetuar a soma deste modo: 
SOMA <- A[1,1] + A[2,2] + A[3,3] + ... + A[10,10]) */

void main(){
    int t=10;
    var A = new int[t][t];
    int somaDiagonal=0;

    IO.println("---- MATRIZ A ----");
    for (int l=0;l<t;l++)
        for (int c=0;c<t;c++)
            A[l][c] = Integer.parseInt(IO.readln("Digite A[" + (l+1) + "][" + (c+1) + "]: "));

    for (int x=0; x<t; x++)
        somaDiagonal = somaDiagonal + A[x][x];

    IO.println("---- MATRIZ A ----");
    for (int l=0;l<t;l++){
        for (int c=0;c<t;c++) 
            System.out.printf("%5d",A[l][c]);
        IO.println(); 
    } 
    IO.println("A soma da diagonal principal é: " + somaDiagonal);   
       
}