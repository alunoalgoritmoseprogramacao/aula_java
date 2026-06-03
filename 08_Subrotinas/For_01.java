
void main(){

    int multiplicador;

    IO.println("-- Variável multiplicador global --");
    int numero = Integer.parseInt(IO.readln("Informe um número: "));

    for (multiplicador=1; multiplicador<=10; multiplicador++)
        System.out.printf("%5d x %5d = %5d \n", numero, multiplicador, numero*multiplicador);
    
    IO.println("Valor da variável multiplicador: " + multiplicador);
}