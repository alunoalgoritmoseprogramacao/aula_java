/* h. Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores. */

void main(){

    int num1 = Integer.parseInt(IO.readln("Informe um número qualquer: "));
    int maior = num1;
    int menor = num1;
    int num2 = Integer.parseInt(IO.readln("Informe outro número qualquer: "));
    if (num2>maior)
        maior = num2;
    if (num2<menor)
        menor = num2;
    int num3 = Integer.parseInt(IO.readln("Informe mais um número qualquer: "));
    if (num3>maior)
        maior = num3;
    if (num3<menor)
        menor = num3;    
    int num4 = Integer.parseInt(IO.readln("Informe e mais um número qualquer: "));    
    if (num4>maior)
        maior = num4;
    if (num4<menor)
        menor = num4;    
    int num5 = Integer.parseInt(IO.readln("Informe só mais um número qualquer: "));
    if (num5>maior)
        maior = num5;
    if (num5<menor)
        menor = num5;

    IO.println("O maior número lido foi: " + maior);
    IO.println("O menor número lido foi: " + menor);


}