/* l) Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
    seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
    usuário. */

void main(){

    int valor = Integer.parseInt(IO.readln("Informe um valor: "));

    if (valor>=0){
        int maior=valor;
        int menor=valor;
        
        while (valor>=0){
            valor = Integer.parseInt(IO.readln("Informe um valor: "));
            if (valor>=0){
                if (valor>=maior)
                    maior=valor;
                if (valor<=menor)
                    menor=valor;
            }
        }
        IO.println("Maior valor digitado: " + maior);
        IO.println("Menor valor digitado: " + menor);
    }
    else 
        IO.println("Você não digitou valor nenhum!");
}    