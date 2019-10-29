import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import Cliente.Cliente;


public class Filme {

    Scanner Entrada = new Scanner(System.in);

    List<Filme> listaFilme = new ArrayList<Filme>();

     String titulo;
     int ano;
     String genero;
     double valorLocacao;

    public Filme() {

        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.valorLocacao = valorLocacao;
    }



    //Acoes ou Metodos (Funcoes)
    public void cadastraFilme() {
        Filme filme = new Filme();
        System.out.println("===== CADASTRAR FILME =====");

        System.out.println("TITULO: ");
        filme.setTitulo(Entrada.nextLine());

        System.out.println("GENERO: ");
        filme.setGenero(Entrada.nextLine());

        System.out.println("ANO: ");
        filme.ano = Integer.parseInt(Entrada.nextLine());

        System.out.println("VALOR DA LOCACAO: ");
        filme.valorLocacao = Double.parseDouble(Entrada.nextLine());

        listaFilme.add(filme);
    }

    public void locaFilme() {

        String nomeFilme;

        Cliente cliente = new Cliente();

        System.out.println("===== LOCAR FILME =====\n");
        System.out.println("DIGITE O NOME DO FILME DESEJADO: ");
        nomeFilme = Entrada.nextLine();

        for (Filme filme : listaFilme) {
            if (filme.getTitulo().equals(nomeFilme)) {
                System.out.println(".::: A PESQUISA ENCONTROU :::." + 
            "\n TITULO: " + getTitulo() + 
            "\n ANO: " + getAno() + 
            "\n GENERO: " + getGenero() + 
            "\n VALOR: " + getValorLocacao());

            }
        }
        System.out.println("FILME NAO ENCONTRADO.");

        if (!("FILME NAO ENCONTRADO".equals(nomeFilme))) {

            System.out.println("DESEJA REALMENTE LOCAR ESTE FILME? ");

            //String Opcao = null;

            switch (" ") {
            case "s":
            case "S":
                System.out.println("DIGITE O CPF DO CLIENTE: ");
                String cpfCliente = Entrada.nextLine();

                for (Cliente pcliente  : cliente.listaCliente) {
                    if (cliente.getCpf().equals(cliente.getCpf())) {
                        System.out.println(".::: A PESQUISA ENCONTROU :::." + 
                    "\n ID: " + cliente.getId() + 
                    "\n NOME: " + cliente.getNome() + 
                    "\n DATA NASCIMENTO: " + cliente.getDatanascimento() + 
                    "\n CPF: " + cliente.getCpf());

                    }
                }
                System.out.println("CLIENTE NAO ENCONTRADO.");

                if (!("CLIENTE NAO ENCONTRADO.".equals(cpfCliente))) {


                }

                break;

            case "n":
            case "N":


            default:
                System.out.println("APERTE APENAS S PARA SIM OU N PARA NAO.");
                break;
            }

        }
    }


    // Getters e Setters    
    public void setListaFilme(List<Filme> listaFilme) {
        this.listaFilme = listaFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
}