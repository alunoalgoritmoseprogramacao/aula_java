/* f. Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los 
    dispostos em ordem crescente. */

void main(){
    int aux;

    IO.println("Informe os valores de a, b, c");
    int a = Integer.parseInt(IO.readln("a: "));
    int b = Integer.parseInt(IO.readln("b: "));
    int c = Integer.parseInt(IO.readln("c: "));
    
    if (a > b){
        aux = a;
        a = b;
        b = aux;
    }
    if (a > c){
        aux = a;
        a = c;
        c = aux;
    }
    if (b > c){
        aux = b;
        b = c;
        c = aux;
    }

    IO.println("Aqui estão os valores ordenados: " + a + " - " + b + " - " + c);
}    