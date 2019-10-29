public class Carro{

    String modelo;
    String marca;
    String preco;
    double percentualDesconto;

    double desconto(){
        return preco - ( preco * percentualDesconto / 100);
    }
}