/* c) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
    1 até 500. */

void main(){
    int contador=1, soma=0;

    do{
        if (contador%2==0)
            soma=soma+contador;
        contador++;
    }while (contador<=500);
    IO.println("somatório dos valores pares existentes na faixa de 1 até 500: " + soma);
}