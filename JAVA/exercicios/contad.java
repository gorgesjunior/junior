public class contad {

     int numero;
     String titular;
     double saldo;
     boolean estado;
   
    public contad(int numero,String nome,double saldo, boolean estado){
        this.numero=numero;
        this.titular=nome;
        this.saldo=saldo;
        this.estado=estado;
    }
    public boolean sacar(double valor){
        if(valor>0 && valor<=this.saldo){
            this.saldo-=valor;
            return true;
        }else{
            return false;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean setSaldo(double valor){
        if(valor>0){
            this.saldo+=valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean getEstado(){
        return estado;
    }
    public int getNumero(){
        return numero;
    }
    public String getTitular(){
        return titular;
    }
    public boolean fecharContad(){
        if(this.saldo>0 || this.saldo<0){
            return false;
        }else{
            this.estado=false;
            return true;
        }
    }
   
}

