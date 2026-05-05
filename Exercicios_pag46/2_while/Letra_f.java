/* f) Elaborar um programa que apresente como resultado o valor de uma potência de uma base
    qualquer elevada a um expoente qualquer, ou seja, de B , em que B é o valor da base e E o valor
    do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
    portuguol (^). */

void main(){
    int contador=1, resultado=1;

    int base = Integer.parseInt(IO.readln("Informe a base: "));
    int expoente = Integer.parseInt(IO.readln("Informe o expoente: "));

    while (contador<=expoente){
        resultado = resultado * base;
        contador++;
    }
    IO.println(base + "^" + expoente + " = " + resultado);
}