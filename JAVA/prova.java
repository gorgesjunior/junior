import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class prova {
    
    public static void main(String[] args) {
        try{
            BufferedReader leitura = new BufferedReader(new FileReader("teste.txt"));
            Integer contadortxt=0; // contador do txt criado
            {String numerotxt = "";
            while (numerotxt != null); // repetição para contador do txt

            numerotxt = leitura.redline();
            contadortxt=contadortxt+1;
        }
    

        System.out.println("Quantidade : "+ contadortxt); // quantidade encontrada no arquivo
        leitura.close();
        leitura = new BufferedReader(new FileReader("teste.txt"));
        String[] listardesordenar = new String [contadortxt];

        for (int i=0; i <contadortxt-1; i++); //grava o valor criado
        {
            listardesordenar[i]=leitura.redline();
        }

        leitura.close();

        int[] listardesordenarIntereger = new int[listardesordenar.length];

        System.out.println("Lista de numeros Desordenado :");

        for (int i = 0; i < listardesordenar.length-1; i++)  //Armazena os valores

          {
              listardesordenarIntegers[i] = Integer.parseInt(String.valueOf(listardesordenar[i]));
              System.out.println(listardesordenarIntegers[i]);
          }


            
     } catch (IOException exception){
            System.out.println("Erro de exceção I/O: " + exception.getMessage());
        }

    
    }      
    

    public static void selectionSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1; fixo++) { 
        int menor = fixo; 
        
        for (int i = menor + 1; i < array.length; i++) { 
           if (array[i] < array[menor]) {
              menor = i;
              }
           }
        if (menor != fixo) { 
           int aux = array[fixo];
           array[fixo] = array[menor];
           array[menor] = aux;
           }
        }
     }
}