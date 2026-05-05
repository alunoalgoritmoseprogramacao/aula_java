/* j)Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores
    pares situados na faixa numérica de 50 a 70. */

    void main() {

    int soma=0, par=0;

    for (int contador=50; contador <= 70; contador++){
        if (contador % 2 == 0){
            soma = soma + contador;
            par++;
        }
    }
    float media = soma/par;
    
    IO.println("somatório dos valores pares existentes na faixa de 50 a 70 é: " + soma);    
    IO.println("e a média dos valores pares existentes na faixa de 50 a 70 é: " + media);        
}    