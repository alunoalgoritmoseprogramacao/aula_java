/* 
* Programa para cálculo de fatorial com um procedimento modificando variáveis globais
*/

// declaração de variáveis globais, ou seja variáveis que irão funcionar no programa todo

int numero;
float fatorial; 

void fat(){ // void quer dizer que não haverá retorno
 
    fatorial = 1;
    for (int contador = 1; contador <= numero; contador++)
        fatorial = fatorial * contador; 
}    
    
void main() { // programa principal
    
    numero = Integer.parseInt(IO.readln("Digite um número: "));
    fat(); // chamada da subrotina (um procedimento)
    IO.println("O fatorial de " + numero + " é: " + fatorial);
    
}
