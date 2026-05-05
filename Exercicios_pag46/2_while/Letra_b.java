/* b) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100). */

void main(){

    int soma=0, contador=1;

    while (contador<=100){
        soma = soma + contador;
        contador++;
    }

    IO.println("soma obtida dos cem primeiros números inteiros é: " + soma);
}