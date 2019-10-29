import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Cliente.Cliente;
import Filme.Filme;


public class Principal {

    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            Cliente cliente = new Cliente();
            Filme filme = new Filme();
           

            int menu = 0;
            int opcao = 0;

            do {
                System.out.println("===== LOCADORA DE FILME =====");
                System.out.println("1 - CADASTRAR CLIENTE");
                System.out.println("2 - PESQUIZAR CLIENTE");
                System.out.println("3 - APAGAR CLIENTE");
                System.out.println("4 - CADASTRAR FILME");
                System.out.println("5 - LOCAR FILME ");
                opcao = entrada.nextInt();

                switch (opcao) {

                    case 1:
                        cliente.cadastracliente();
                        break;

                    case 2:
                        cliente.pesquisacliente();
                        break;

                    case 3:
                        cliente.excluicliente();
                        break;

                    case 4:
                        filme.cadastraFilme();
                        break;

                   case 5:
                       filme.locaFilme();
                        break;


                    default:
                        System.out.println("Opcao invalida.");
                        break;
                }            
            } while (menu == 0);}
        }