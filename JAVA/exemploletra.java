
import java.util.Scanner;

public class exemploletra {

public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    String S;
    int i, j, cont=0;
    System.out.println("Digite a palavra/frase:");


    // usuário digita string
    S = ent.nextLine();


    // a string é convertida para letras minúsculas
    // para que não haja diferenciação entre 'A' e 'a'
    String s = S.toLowerCase();
    String v = "";
    for (i=0; i<s.length(); i++) {
        for (j=0; j<s.length(); j++) {
            if (s.charAt(i)==s.charAt(j)) {
                cont++;
            } 
        }

        
        // ao imprimir as frequências, exclui a contagem dos espaços
        char c = s.charAt(i);
        if (c >= 'a' && c <= 'z' && !v.contains("" + c)) {
            v = v + c;
            System.out.println("A letra "+s.charAt(i)+" aparece "+cont+" vezes.");
        }
        cont=0;
    }
}
}