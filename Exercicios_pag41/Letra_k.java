/* k.Elaborar um programa que efetue a leitura de um determinado valor inteiro, 
    e efetue a sua apresentação, caso o valor não seja maior que três */

void main(){

    int numero = Integer.parseInt(IO.readln("Informe um número: "));

    if (!(numero>3))
        IO.println(numero);
}    