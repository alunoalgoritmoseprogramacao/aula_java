/* c) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
    1 até 500. */

void main(){

    int contador=0, soma=0;

    while (contador<=500){
        soma=soma+contador;
        contador=contador+2;
    }

    IO.println("o somatório dos valores pares existentes na faixa de 1 até 500 é: " + soma);
}    