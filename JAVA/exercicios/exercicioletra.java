import java.util.Scanner;

public class exercicioletra {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String nome;
        int contador=1;
        System.out.println("Digite uma palavra: ");
        nome = input.nextLine();
        while(contador <= 5 ){
            System.out.println(nome);
            contador++;
        }
    }
}
    



