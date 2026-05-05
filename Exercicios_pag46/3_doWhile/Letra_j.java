/* j)Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores
    pares situados na faixa numérica de 50 a 70. */

void main(){
    int contador=50, par=0;
    float soma=0;
    
    do{
        if (contador%2==0){
            soma = soma + contador;
            par++;
        }
        contador++;
    }while(contador<=70);
    
    IO.println("A soma dos valores pares situados na faixa numérica de 50 a 70 é: " + soma);
    IO.println("A média dos valores pares situados na faixa numérica de 50 a 70 é: " + soma/par);    
}