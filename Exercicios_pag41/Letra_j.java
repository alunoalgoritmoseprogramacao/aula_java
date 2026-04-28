/* j.Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9.
     Após a leitura do valor fornecido pelo usuário, o programa deverá indicar uma de duas 
     mensagens: "O valor está na faixa permitida", caso o usuário forneça o valor nesta 
     faixa, ou a mensagem "O valor está fora da faixa permitida", 
     caso o usuário forneça valores menores que 1 ou maiores que 9. */

void main(){

    int numero = Integer.parseInt(IO.readln("Informe um número entre 1 e 9: "));

    if (numero >=1 && numero<=9)
        IO.println(numero + " está dentro da faixa permitida!");
    else
        IO.println(numero + " está fora da faixa permitida!");
}     