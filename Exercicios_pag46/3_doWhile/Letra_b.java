/* b) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100). */

void main(){

    int contador=1, soma=0;

    do{
        soma=soma+contador;
        contador++;
    }while (contador<=100);
    IO.println("o total da soma obtida dos cem primeiros números inteiros é: " + soma);
}