public class conta {

    int numero;
    String titular;
    double saldo;


    void sacar(double quantidade){
    double saldonovo = this.saldo - quantidade;
    this.saldo = saldonovo;
    }

    void depositar(double quantidade){
    double saldonovo = this.saldo + quantidade;
    this.saldo = saldonovo;
    }
}


