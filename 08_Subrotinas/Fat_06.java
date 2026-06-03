
// Modificando uma variável por referência

void fat(int num, float fatorial[]){
    int contador;
    for (contador = 1; contador <= num; contador++)
        fatorial[0] = fatorial[0] * contador;
    }    
    
void main() {

    var fatorialPrincipal = new float[1];

    int numero = Integer.parseInt(IO.readln("Digite um número: "));

    fatorialPrincipal[0] = 1;
        
    fat(numero, fatorialPrincipal);
        
    IO.println("O fatorial de " + numero + " é: " + fatorialPrincipal[0]);
}