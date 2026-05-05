/* c) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
    1 até 500. */

void main() {

    int soma=0;

    for (int contador=1; contador <= 500; contador++){
        if (contador % 2 == 0)
            soma = soma + contador;
    }
    IO.println("somatório dos valores pares existentes na faixa de 1 até 500 é: " + soma);    
}    