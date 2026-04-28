/* l.Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, 
    apresentando com saída uma das seguintes mensagens: "Ilmo Sr.", se o sexo 
    informado como masculino, ou a mensagem "Ilma Sra.", para o sexo informado 
    como feminino. Apresente também junto da mensagem de saudação o nome previamente 
    informado. */

void main(){

    String nome = IO.readln("Informe o nome do destinatário: ");
    String sexo = IO.readln("Informe o sexo do destinatário: (M/F) ");

    switch (sexo.toUpperCase()) {
        case "M":
            IO.println("Ilmo senhor " + nome);
            break;
        case "F":
            IO.println("Ilma senhora " + nome);
            break;
        default:
            IO.println(("Ilme senhore " + nome));
    }



}    