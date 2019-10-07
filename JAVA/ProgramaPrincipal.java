package arquivoordena;

import java.io.IOException;

public class ProgramaPrincipal {

    public static void main(String[] args) throws IOException {

        Arquivo arquivo = new Arquivo();
        Ordenacao ordenar = new Ordenacao();
        int[] arrayDesordenado = new int[65000];
        int[] arrayOrdenado = new int[65000];
        
        arrayDesordenado = arquivo.lerArquivo("C:\\teste\\teste.txt");
        
        //arrayOrdenado = ordenar.insertionSort(arrayDesordenado);
        //arrayOrdenado = ordenar.selectionSort(arrayDesordenado);
        //arrayOrdenado = ordenar.bubbleSort(arrayDesordenado);
        arrayOrdenado = ordenar.mergeSort(arrayDesordenado);
        arrayOrdenado = ordenar.quickSort(arrayDesordenado);
        arrayOrdenado = ordenar.heapSort(arrayDesordenado);
        arquivo.gravarArquivo("C:\\teste\\teste.txt", arrayOrdenado);
    }
}
