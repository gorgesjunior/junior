public class contanova {

    public static void main (String[] agrs){
        
        conta contanova;
        contanova = new conta();
        //contanova = new contapessoa();

        contanova.titular = "Junior";
        System.out.println("Conta de " + contanova.titular);
        contanova.saldo = 1000.00;

        System.out.println("Seu Saldo Inicial " + contanova.saldo);
        
        contanova.sacar(200);
        
        contanova.depositar(500);
        System.out.println ("Seu Saldo Final " + contanova.saldo);

    }
}