/* 
* mesmo exemplo do anterior porém mostrando que os nomes de variáveis de dentro 
* das subrotinas podem ser os mesmos já que são locais e as subrotinas trocam 
* apenas valores entre si
*/

float fat(int numero){ 
    float fator=1;
    for (int contador = 1; contador <= numero; contador++)
        fator = fator * contador;
    return fator;
}    

void main() {
    
    int numero = Integer.parseInt(IO.readln("Digite um número: "));
    IO.println("O fatorial de " + numero + " é: " + fat(numero)); 
        // a função pode ser chamada sem precisar ter o seu valor atribuído a uma variável                                                                     

}