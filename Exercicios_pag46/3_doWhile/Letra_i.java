/* i)Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
    somatório e a média aritmética dos valores lidos. */

void main(){
    int contador=1, valor;
    float soma=0;

    do{
        valor = Integer.parseInt(IO.readln("informe o " + contador + "o valor: "));
        soma = soma + valor;
        contador++;
    }while(contador<=10);
    IO.println("A soma dos valores digitados  é: " + soma);
    IO.println("A média dos valores digitados é: " + soma/10);
}    