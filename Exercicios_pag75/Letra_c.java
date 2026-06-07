/* c) Ler 5 elementos (valores reais) para temperaturas em graus Celsius em uma matriz A 
   de uma dimensão do tipo vetor. Construir uma matriz B de mesmo tipo e dimensão, em que 
   cada elemento da matriz B deverá ser a conversão da temperatura em graus Fahrenheit do 
   elemento correspondente da matriz A. Apresentar as matrizes A e B lado a lado. 
   A fórmula de conversão é F=(9C+160)/5, sendo F a temperatura em Fahrenheit e 
   C a temperatura em Celsius. */

void main(){
    int tam=5;
    var a = new double[tam];
    var b = new double[tam];
    
    IO.println("Vetor A: ");
    for (int cont=0;cont<a.length;cont++){
        a[cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        b[cont] = (9 * a[cont] + 160) / 5;
    }
    IO.println("-- Vetores --");
    for (int cont=0;cont<tam;cont++)
        IO.println(a[cont] + "o C = " + b[cont] + "o F");
}      