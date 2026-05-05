/* c) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
    1 até 500. */

void main(){
    int contador=0, soma=0;

    do{
        soma=soma+contador;
        contador=contador+2;
    }while (contador<=500);
    IO.println("somatório dos valores pares existentes na faixa de 1 até 500: " + soma);
}