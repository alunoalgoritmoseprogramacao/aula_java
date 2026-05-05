/* e) Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
    considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
    neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^). */

void main(){
    
    int resultado=1, expoente=0;

    while(expoente<=15){
        IO.println("3^" + expoente + " = " + resultado);
        resultado = resultado * 3;
        expoente++;
    }
}