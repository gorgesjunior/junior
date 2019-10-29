//Nome do padrao - OBSERVER


//O padrão Observer funciona como assinaturas de jornais e revistas, ou seja, temos uma editora que
//publica as edições e pessoas que assinam os jornais ou revistas dessa editora e sempre recebem as
//novas edições assim que elas são publicadas. Enquanto a pessoa é assinante ela continua recebendo
//as edições na sua casa. Se a pessoa cancelar a assinatura do jornal ou da revista ela para de receber
//as edições.
//O padrão Observer funciona da mesma forma, no entanto, tem-se que a editora (que publica) é o
//chamado SUBJECT no Padrão Observer e os assinantes (que recebem as novas publicações) são os
//chamados OBSERVER.
//Os OBSERVERs registram-se no SUBJECT para receber atualizações quando os dados do SUBJECT são
//alterados. Os OBSERVERs também podem cancelar o seu registro e dessa forma não receber mais
//nenhuma atualização do SUBJECT.


import java.util.Observable;
import java.util.Observer;
 
public class RevistaInformatica extends Observable {
 
    private int edicao;
 
    public void setNovaEdicao(int novaEdicao) {
        this.edicao = novaEdicao;
         
        setChanged();
        notifyObservers();
    }
     
    public int getEdicao() {
        return this.edicao;
    }
     
    public static void main(String[] args) {
        //poderia receber a nova edicao atraves de um recurso externo
        int novaEdicao = 3;
        RevistaInformatica revistaInformatica = new RevistaInformatica();       
        Assinante1 assinante1 = new Assinante1(revistaInformatica);
         
        revistaInformatica.setNovaEdicao(novaEdicao);
    }
 
}
 
class Assinante1 implements Observer {
     
    Observable revistaInformatica;
     
    int edicaoNovaRevista;
     
    public Assinante1(Observable revistaInformatica) {
        this.revistaInformatica = revistaInformatica;
        revistaInformatica.addObserver(this);
    }
     
    @Override
    public void update(Observable revistaInfSubject, Object arg1) {
        if (revistaInfSubject instanceof RevistaInformatica) {
            RevistaInformatica revistaInformatica = (RevistaInformatica) revistaInfSubject;
            edicaoNovaRevista = revistaInformatica.getEdicao();
            System.out.println("Atenção, já chegou a mais uma edição da Revista Informatica. " +
                    "Esta é a sua edição número: " + edicaoNovaRevista);
        }
    }   
}