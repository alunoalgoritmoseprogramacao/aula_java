/* c. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir 
    uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for 
    maior ou igual a 5. Se o aluno não foi aprovado, indicar uma mensagem informando 
    esta condição. Apresentar junto das mensagens o valor da média do aluno para 
    qualquer condição. */

void main() {

    double nota1 = Double.parseDouble(IO.readln("Informe a nota da 1a unidade: "));
    double nota2 = Double.parseDouble(IO.readln("Informe a nota da 2a unidade: "));
    double nota3 = Double.parseDouble(IO.readln("Informe a nota da 3a unidade: "));
    double nota4 = Double.parseDouble(IO.readln("Informe a nota da 4a unidade: "));

    double media = (nota1 + nota2 + nota3 + nota4) / 4;

    if (media>5)
        System.out.printf("Aprovado com média: %.1f \n", media);
    else
        System.out.printf("Reprovado com média: %.1f \n", media);
}