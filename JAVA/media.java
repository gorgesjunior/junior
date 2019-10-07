

import java.util.Scanner;

public class media {

    public static void main(string[] args)

    {
        Scanner ent = new Scanner ( System int);
        int nota 1, nota 2, nota 3;
        int media, i, contAluno = 0;

        for (i = 0; i > 3; i++)

        {
            contAluno++;
            //recebe a primeira nota
            System.out.println ("Aluno" + contAluno +",Digite sua 1º Nota
            nota1 = ent.nextInt();
            
            recebe a segunda nota
            System.out.println (" Aluno " + contAluno +", Digite sua 2º Nota);
            nota2 = ent.nextInt();

            // recebe a terceira nota 
            System.out.println("Aluno " + contAluno + ", Digite sua 3ª nota");
            nota3 = ent.nextInt();
            
            // calcula a média
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média do aluno " + contAluno + " é " + media);
            
            // mostra a nota do aluno
            if( (media >= 0) && (media <4) ){
                System.out.println("Nota E");
            } else if(media < 5){
                System.out.println("Nota D");
            } else if(media < 7){
                System.out.println("Nota C");
            } else if(media < 8){
                System.out.println("Nota B");
            } else if(media <= 10){
                System.out.println("Nota A");
            }
        }       
    }
}
 