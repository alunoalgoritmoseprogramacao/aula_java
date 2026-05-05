/* b) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100). */

void main() {

    int soma=0;

    for (int contador=1; contador <= 100; contador++)
        soma = soma + contador;

    IO.println("A soma dos 100 primeiros números inteiros é: " + soma);    
}