import java.util.Scanner;

public class exemploimpar {
    public static void main(String[] argss){
        Scanner ent = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número");
            num = ent.nextInt();

           //para informar numero pares
            
           // if(num % 2 == 0){
           //     contPar++;
            //}

            // para informar números impares
            
            if(num % 2 == 1){
                contImpar++;
            }
            
        }
        
        //System.out.println("Foram digitados " + contImpar + " números  \n");
        System.out.println("E " + contImpar + " números ímpares");
        
    }
}