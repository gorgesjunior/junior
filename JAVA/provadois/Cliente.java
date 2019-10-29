import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Principal.Principal;
import Conta.Conta;

public class Cliente {

    // Atributos (Variaveis)
     String id;
     String nome;
     String datanascimento;
     String cpf;
     
     

    // Construtor
    public Cliente() {
        
        this.id = id;
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.cpf = cpf;
        
        
    }

    Scanner entrada = new Scanner(System.in);

    public ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    // Metodos (Acoes ou Funcoes)
    public void cadastracliente() {

        Cliente cliente = new Cliente();

        System.out.println("===== CADASTRAR CLIENTE =====");

        System.out.println(" ID: ");
        cliente.setId(entrada.nextLine());

        System.out.println("NOME: ");
        cliente.setNome(entrada.nextLine());

        System.out.println(" DATA DE NASCIMENTO: ");
        cliente.setDatanascimento(entrada.nextLine());

        System.out.println("CPF: ");
        cliente.setCpf(entrada.nextLine());

               
        listaCliente.add(cliente);

    }

    public void pesquisacliente() {

        String cpf;
        boolean resul;

        System.out.println("DIGITE O CPF: ");

        cpf = entrada.nextLine(); 

        for (Cliente cliente : listaCliente) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente: "+ cliente.getNome() + " | " + "CPF: " + cliente.getCpf() + " | " + " ID " + cliente.getId());
                return;
            }
        }
        System.out.println("CLIENTE NAO ENCONTRADO.");
    }

    public void excluicliente() {

        String cpf;
        String decisao = null;

        System.out.println("DIGITE O CPF: ");
        cpf = entrada.nextLine();

        for (Cliente cliente : listaCliente) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente: "+ cliente.getNome() + " | " + "CPF: "+cliente.getCpf());
            }
        }

        System.out.println("DESEJA REALMENTE APAGAR ESTE CLIENTE? ");
        decisao = entrada.nextLine();

        if (decisao == "s") {
            listaCliente.remove(cpf);
        }
        else {
            return;
        }


        return;
    }

    public Scanner getentrada() {
        return Entrada;
    }

    public void setentrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}