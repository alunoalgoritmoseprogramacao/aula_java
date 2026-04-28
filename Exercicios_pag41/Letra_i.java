/* i.Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma 
    mensagem informando se o número é par ou ímpar. */

void main(){

    int numero = Integer.parseInt(IO.readln("Informe um número: "));
    
    if (numero%2==0)
        IO.println(numero + " é par");
    else
        IO.println(numero + " é ímpar");

}    