public class contapessoa {

    
     String nome;
     String endereco;
     String telefone;
     

// getters & Setters ..  
    
}

public class PessoaFisica extends Pessoa{
    
     String cpf;
     String rg;
  
  // getters & Setters ..  
}

public class PessoaJuridica extends Pessoa {
     String cnpj;
     String ie;

// getters & Setters ..  
}

public class Cliente {
    
public static final int FISICA = 0;
public static final int JURIDICA = 1;
PessoaFisica pf;
PessoaJuridica pj;

    public Cliente(int type) {
        
        switch(type){
            case FISICA:
                pf = new PessoaFisica();
        
        case JURIDICA:
                pj = new PessoaJuridica();        
        
        }
        
    }

    public PessoaFisica getPf() {
        return pf;
    }

    public void setPf(PessoaFisica pf) {
        this.pf = pf;
    }

    public PessoaJuridica getPj() {
        return pj;
    }

    public void setPj(PessoaJuridica pj) {
        this.pj = pj;
    }


    
}