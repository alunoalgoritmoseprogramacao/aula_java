/* g. Efetuar a leitura de quatro números inteiros e apresentar os números 
    que são divisíveis por 2 e 3. */

void main(){

    int num1 = Integer.parseInt(IO.readln("Informe um número qualquer: "));
    int num2 = Integer.parseInt(IO.readln("Informe outro número qualquer: "));
    int num3 = Integer.parseInt(IO.readln("Informe mais um número qualquer: "));
    int num4 = Integer.parseInt(IO.readln("Informe e mais um número qualquer: "));

    if ( (num1%3==0) && (num1%2==0))
        IO.println(num1 + " é divisível por 2 e 3");
    if ( (num2%3==0) && (num2%2==0))
        IO.println(num2 + " é divisível por 2 e 3");
    if ( (num3%6==0))
        IO.println(num3 + " é divisível por 2 e 3");
    if ( (num4%6==0))
        IO.println(num4 + " é divisível por 2 e 3");


}