/* 
* Programa para cálculo de fatorial com um procedimento modificando variáveis globais porém já com declaração 
* de variáveis dentro da subrotina e com recebimento de parâmetros vindos do programa principal
*/

float fatorial;

void fat(int num){ // variável num recebe o valor de numero vindo do programa principal
                   // esta variável só vai ser instanciada durante a execução do procedimento
    fatorial = 1;
    for (int contador = 1; contador <= num; contador++)
        fatorial = fatorial * contador;
    /* nada que acontece com a variável numero no procedimento, 
    *  influencia na variável numero do programa principal*/

}    
    
void main() {

    int numero = Integer.parseInt(IO.readln("Digite um número: "));
    fat(numero);
    IO.println("O fatorial de " + numero + " é: " + fatorial);

}