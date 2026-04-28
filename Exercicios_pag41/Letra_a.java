/* a. Ler dois valores numéricos inteiros e apresentar o resultado
    da diferença do maior pelo menor valor.*/

void main(){

    int valor1 = Integer.parseInt(IO.readln("Informe um valor qualquer: "));
    int valor2 = Integer.parseInt(IO.readln("Informe outro valor: "));

    if (valor1 > valor2)
        IO.println(valor1 + " - " + valor2 + " = " + (valor1-valor2));
    else
        IO.println(valor2 + " - " + valor1 + " = " + (valor2-valor1));
}    