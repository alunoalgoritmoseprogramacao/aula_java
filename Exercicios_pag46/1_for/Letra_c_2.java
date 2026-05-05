/* c) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
    1 até 500. */

void main() {

    int soma=0;

    for (int contador=0; contador <= 500; contador=contador+2)
            soma = soma + contador;
    
    IO.println("somatório dos valores pares existentes na faixa de 1 até 500 é: " + soma);    
}    