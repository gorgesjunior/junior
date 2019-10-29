import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bancoatualizado {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        boolean continuar=true,estado,estado2;
        String execucao,nome;
        int nconta,numero,escolha;
        conta c=null;
        double saldoinicial,valor;
        ArrayList lista = new ArrayList();
       
        while(continuar==true){
            System.out.println("Digite 1 para criar conta, "
                    + "2 para sacar, 3 para depositar, 4 para ver"
                    + " o saldo e 5 para fechar a conta: ");
            escolha = in.nextInt();
            if(escolha==1){
                System.out.println("Digite o número da sua conta: ");
                numero = in.nextInt();
                System.out.println("Digite o nome do titular: ");
                nome = in.next();
                System.out.println("Digite o depósito inicial: ");
                saldoinicial = in.nextDouble();
                estado=true;
                c = new contad(numero,nome,saldoinicial,estado);
                lista.add(c);
                System.out.println("Saldo atual: "+c.getSaldo());
            }
            if(escolha==2){
                System.out.println("Digite o número da conta: ");
                nconta = in.nextInt();
                Iterator i = lista.iterator();
                while (i.hasNext()) {
                    c=(conta)i.next();
                    if(c.numero==nconta) {
                        System.out.println("Digite o valor que deseja sacar: ");
                        valor = in.nextDouble();
                        boolean saque_efetuado = c.sacar(valor);
                        if (saque_efetuado==true){
                            System.out.println("Saque realizado com sucesso!");
                            System.out.println("Saldo atual: "+c.getSaldo());
                        }else{
                            System.out.println("Valor inválido!");
                        }
                        break;
                    }}}      
            if(escolha==3){
                System.out.println("Digite o número da conta: ");
                nconta = in.nextInt();
                Iterator i = lista.iterator();
                while (i.hasNext()) {
                    c=(conta)i.next();
                    if(c.numero==nconta) {
                        System.out.println("Digite o valor que deseja depositar: ");
                        valor = in.nextDouble();
                        boolean deposito_efetuado = c.setSaldo(valor);
                        if(deposito_efetuado==true){
                            System.out.println("Depósito realizado com sucesso!");
                            System.out.println("Saldo atual: "+c.getSaldo());}
                        else{
                            System.out.println("Valor inválido.");
                        break;
                        }
                    }}}
            if(escolha==4){
                System.out.println("Digite o número da conta: ");
                nconta = in.nextInt();
                Iterator i = lista.iterator();
                while (i.hasNext()) {
                    c=(conta)i.next();
                    if(c.numero==nconta) {
                        System.out.println("Saldo atual: "+ c.getSaldo());
                        System.out.println("Número da conta: "+c.getNumero());
                        System.out.println("Titular: "+c.getTitular());
                        if (c.estado==true){
                            System.out.println("Conta aberta.");
                        }else{
                            System.out.println("Conta fechada.");
                        }
                        break;
            }}}
            if(escolha==5){
                System.out.println("Digite o número da conta: ");
                nconta = in.nextInt();
                Iterator i = lista.iterator();
                while (i.hasNext()) {
                    c=(conta)i.next();
                    if(c.numero==nconta) {
                        estado2=c.fecharConta();
                            if(estado2==true){
                                System.out.println("Conta fechada com sucesso!");
                            }else{
                    System.out.println("Impossível completar ação pois ou você deve ou ainda tem dinheiro na conta.");
                    }
                    break;
                }
              }    
            }
            System.out.println("Deseja continuar? s - sim/ n - não");
            execucao = in.next();
            if(execucao.equals("n")){
                continuar=false;
            }
        }  
    }
}