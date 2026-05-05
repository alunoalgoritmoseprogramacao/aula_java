/* e) Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
    considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
    neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^). */

void main(){
    int expoente=0, resultado=1;

    do{
        IO.println("3^" + expoente + " = " + resultado);
        resultado = resultado*3;
        expoente++;
    }while(expoente<=15);
}