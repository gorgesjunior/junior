import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

public class exemplo
        {
            public static void main (String[] args){

            Scanner in = new Scanner(System.in);

            int num1;
            int num2;
            
         do{  
            

        System.out.println ("Digite um valor");
        num1 = in.nextInt();
        System.out.println ("Digite um segundo valor");
        num2 = in.nextInt();

        try{
            System.out.println(num1/num2);

        }
        catch(ArithmeticException e)

        {
            System.out.println("Ocorreu o erro " + e.getMessage());
        }

     do While (num2==o)}


        }
    }
}