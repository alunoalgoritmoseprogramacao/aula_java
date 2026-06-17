/* c) Ler 20 elementos para uma matriz qualquer, considerando que ela tenha o tamanho de 4 linhas 
   por 5 colunas, em seguida apresentar a matriz. */

void main(){
    var a = new int[4][5];
    
    for (int lin=0;lin<4;lin++)
        for (int col=0;col<5;col++)
            a[lin][col] = Integer.parseInt(IO.readln("Digite A[" + (lin+1) + "][" + (col+1) + "]: "));

    for (int lin=0;lin<4;lin++){
        for (int col=0;col<5;col++) 
            System.out.printf("%5d",a[lin][col]);
        IO.println(); 
    }
}   