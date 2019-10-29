

public class Pessoa{

    String nome;
    double peso;
    double altura;
    String dataDeNascimento;
    double imc;

    double imc (){
    return ((altura * altura)/peso);
    }

}