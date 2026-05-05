/* i)Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
    somatório e a média aritmética dos valores lidos. */

void main(){

    int contador=1, numero;
    float soma=0;

    while (contador<=10){
        numero = Integer.parseInt(IO.readln("Informe um número: "));
        soma = soma + numero;
        contador++;
    }

    IO.println("A soma dos números digitados é : " + soma);
    IO.println("A média dos números digitados é: " + soma/10);
}    