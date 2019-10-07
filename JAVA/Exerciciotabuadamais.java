import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Exerciciotabuadamais {
    
    public static void main(String args[]) {

        int A;
        do {
        
        {
            Scanner tab = new Scanner(System.in);
            System.out.println("Informar um número (0(zero) para finalizar):");
    
            A = tab.nextInt();
            if (A != 0) 
            {
                int mult = 0;
                while (mult < 10)

                             
                {
                    mult++;
                    System.out.println(A + " * " + mult + "  = " + (A * mult));
                }

            }

            
         }
        } while (A != 0);

        try{
            BufferedWriter escrita = new BufferedWriter(new FileWriter("./saidadoconsole.txt"));
            
            String digitado = "";
            Scanner in = new Scanner(System.in);
            digitado = in.nextLine();

            in.close();
            escrita.append(digitado + "\n");
            escrita.close();
        } catch (IOException exception){
            System.out.println("Erro de exceção I/O: " + exception.getMessage());
        }

        try{
            BufferedReader leitura = new BufferedReader(new FileReader("./saidadoconsole.txt"));
            String value = "";
            while (true){
                if(value != null)
                    System.out.println(value);
                else
                    break;
                
                value = leitura.readLine();

            }
            leitura.close();
        } catch (IOException exception){
            System.out.println("Erro de exceção I/O: " + exception.getMessage());
        }  
    

               
    }
    
 

}
   
    
 


