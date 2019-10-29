public class Carro{

    String modelo;
    String marca;
    String preco;
    double percentualDesconto;

    double desconto(){
        return preco - ( preco * percentualDesconto / 100);
    }


    //Quando declarado o metodo no construtor
    CarroComConstrutor (String modeloinicial){
    modelo = modeloinicial
    }
    // quando não esta declarando metodo construtor

    CarroComConstrutor(){

    }


}