/* d. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma 
    mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou 
    igual a 7. Se o valor da média for menor que 7, solicitar a nota de exame, somar com 
    o valor da média e obter nova média. Se a nova média for maior ou igual a 5, apresentar
    uma mensagem dizendo que o aluno foi aprovado em exame. Se o aluno não foi aprovado, 
    indicar uma mensagem informando esta condição. 
    Apresentar com as mensagens o valor da média do aluno, para qualquer condição. */

void main(){

    double nota1 = Double.parseDouble(IO.readln("Informe a nota da 1a unidade: "));
    double nota2 = Double.parseDouble(IO.readln("Informe a nota da 2a unidade: "));
    double nota3 = Double.parseDouble(IO.readln("Informe a nota da 3a unidade: "));
    double nota4 = Double.parseDouble(IO.readln("Informe a nota da 4a unidade: "));

    double media = (nota1 + nota2 + nota3 + nota4) / 4;

    if (media >= 7)
        System.out.printf("Aprovado com média %.1f \n", media);
    else {
        System.out.printf("Média: %.1f - Exame final! \n", media);
        double provaFinal = Double.parseDouble(IO.readln("Informe o valor do exame final: "));
        double novaMedia = (provaFinal + media) / 2;
        if (novaMedia>=5)
            System.out.printf("Aprovado no exame final com média: %.1f \n", novaMedia);
        else
            System.out.printf("Reprovado no exame final com média: %.1f \n", novaMedia);
    }
    
    IO.println("Boas férias!");

}    