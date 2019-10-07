import java.util.Scanner;

public class TESTE{

    static void SelectionSort(int vetor[], int tam) {

        for (int indice = 0; indice < tam; ++indice) {
            int indiceMenor = indice;
            for (int indiceSeguinte = indice + 1; indiceSeguinte < tam; ++indiceSeguinte) {
                if (vetor[indiceSeguinte] < vetor[indiceMenor]) {
                    indiceMenor = indiceSeguinte;
                }
            }
            int aux = vetor[indice];
            vetor[indice] = vetor[indiceMenor];
            vetor[indiceMenor] = aux;
        }
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
       
    }

    public static void main(String[] args) {
        int vetor[] = new int[3];
        vetor[0] = 3;
        vetor[1] = 5;
        vetor[2] = 2;
        SelectionSort(vetor, vetor.length);
        
    }

    
}