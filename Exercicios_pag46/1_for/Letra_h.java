/* h) Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de
    10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O
    programa deve apresentar os valores das duas temperaturas. A fórmula de conversão
    é F = (9C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */

void main(){

    for (int celsius=10; celsius<=100; celsius=celsius+10)
        IO.println(celsius + " graus C equivalem a " + ((9*celsius + 160) / 5) + " graus F");
}    