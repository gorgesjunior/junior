import java.util.Scanner;

public class Bubblesortchar  {
  public static void main(String args[]){
    int qtd;
    Scanner in = new Scanner(System.in);
    System.out.println("Informe a Quantidade de Espaços");
    qtd= in.nextInt();
    String auxilio;

    char vet[] = new char[qtd];

    for(int i=0; i<qtd;i++){
        System.out.println("Informe o "+(i+1)+"º Letra");
        auxilio = in.next();
        vet[i] = auxilio.charAt(0);
    }
    char aux = 0;
    int i = 0;
    System.out.println("Vetor desordenado: ");
    for(i = 0; i<qtd; i++){
        System.out.println(" "+vet[i]);
    }
    System.out.println(" ");
    
    for(i = 0; i<qtd; i++){
        for(int j = 0; j<qtd-1; j++){
            if(vet[j] > vet[j + 1]){
                aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
            }
        }
    }
    System.out.println("Vetor organizado:");
    for(i = 0; i<qtd; i++){
        System.out.println(" "+vet[i]);
    }
  }
}