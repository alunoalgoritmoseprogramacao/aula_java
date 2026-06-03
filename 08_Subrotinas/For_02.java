
void main(){

    IO.println("-- Variável multiplicador local --");
    int numero = Integer.parseInt(IO.readln("Informe um número: "));

    for (int multiplicador=1; multiplicador<=10; multiplicador++){
        System.out.printf("%5d x %5d = %5d \n", numero, multiplicador, numero*multiplicador);
    }
    IO.println(multiplicador);
}