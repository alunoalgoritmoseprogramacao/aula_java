/* Exemplo: desvio condicional encadeado
Elaborar um programa que efetue o cálculo de um aumento salarial respeitando o seguinte critério:
se salário for menor ou igual a R$1.000,00, aumento de 15%;
se salário for maior que R$1.000,00 mas menor ou igual a R$2.000,00, aumento de 12,5%; 
se salário for maior que R$2.000,00, aumento de 10%. */

void main(){

double salario = Double.parseDouble(IO.readln("Informe o seu salário: "));

    if (salario > 2000)
        salario = salario * 1.10;
    else
        if (salario > 1000)
            salario = salario * 1.125;
        else 
            salario = salario * 1.15;
    
    System.out.printf("O novo salário é %.2f \n", salario);
    IO.println("O novo salário é R$ " + salario);
}