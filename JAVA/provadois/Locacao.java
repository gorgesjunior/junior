import java.util.Date;
import Filme.Filme;

public class Locacao {

    Scanner Entrada = new Scanner(System.in);

    // Atributos (Variaveis)
    Date data;
    double valorTotalAPagar;
    Filme listaFilmes;

    // Construtor
    public Locacao() {
        this.data = Data;
        this.valorTotalAPagar = ValorTotalAPagar;
        this.listaFilmes = ListaFilmes;
    }

    // Acoes ou Metodos (Funcoes)
    public void locacao() {

    }

    public void locacao(Date data) {

    }

    public void addFilme(Filme filme) {
        listaFilmes = filme;
    }

    // Getters e Setters
    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotalAPagar() {
        return this.valorTotalAPagar;
    }

    public void setValorTotalAPagar(double valorTotalAPagar) {
        this.valorTotalAPagar = valorTotalAPagar;
    }
}