import Cliente.Cliente;
import Filme.Filme;

public class Conta {

    // Atributos (Variaveis)
     Cliente cliente;
     String Numero;
     double SaldoDevedor;
     Locacao[] historicoLocacao;

    // Construtor
    public conta() {

        this.cliente = Cliente;
        this.numero = Numero;
        this.saldoDevedor = SaldoDevedor = 0;
        this.historicoLocacao = new Locacao[20];
    }

    // Metodos (Acoes ou Funcoes)
    public void Conta() {

    }

    public void conta(Cliente cliente, int Numero) {

    }

    public void locarFilmes(Filme filme) {

    }

    public String extratoHistorico() {
            return extratoHistorico();

    }

    public void pagarDebito(double valor) {

    }


    // Getters e Setters
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldoDevedor() {
        return this.saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;

    }

    public Locacao[] getHistoricoLocacao() {
        return historicoLocacao;
    }

    public void setHistoricoLocacao(Locacao[] historicoLocacao) {
        this.historicoLocacao = historicoLocacao;
    }


}