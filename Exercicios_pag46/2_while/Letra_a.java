/* a) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer. */

void main(){

    int numero = Integer.parseInt(IO.readln("Informe um número: "));
    int multiplicador = 1;

    while (multiplicador<=10){
        System.out.printf("%d x %d = %d \n", numero, multiplicador, numero*multiplicador);
        multiplicador++;
    }
}