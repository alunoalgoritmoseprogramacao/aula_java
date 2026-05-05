/* k) Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
    banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do
    nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
    do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar
    calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor
    total acumulado da área residencial. */

void main(){
    String continua="S", comodo;
    float largura, comprimento, areaTotal=0;

    while (continua.equalsIgnoreCase("S")){
        comodo = IO.readln("Informe o nome do cômodo: ");
        largura = Float.parseFloat(IO.readln("Informe a largura do(a) " + comodo + ": "));
        comprimento = Float.parseFloat(IO.readln("Informe o comprimento largura do(a) " + comodo + ": "));
        areaTotal = areaTotal + largura*comprimento;
        continua = IO.readln("Deseja continuar (S/N)?: ");
    }
    IO.println("A área total da residência é: " + areaTotal + "m2");
}    
