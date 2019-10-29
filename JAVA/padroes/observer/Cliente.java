//OBSERVER


// Exemplo

package br.padroes.observer;

public class Cliente {
	public static void main(String[] args) {
		DadosSubject dados = new DadosSubject();
		dados.attach(new TabelaObserver(dados));
		dados.attach(new BarraObserver(dados));
		dados.attach(new PorcentoObserver(dados));

		dados.setState(new Dados(7, 3, 1));
		dados.setState(new Dados(2, 3, 1));
	}
}


//Problema

//Suponha que em um programa é necessário fazer várias representações de um mesmo
//conjunto de dados, este conjunto de dados consiste de uma estrutura que contém 3
//atributos: valorA, valorB e valorC, como mostra o código.

//Solução

//Definir uma dependência um para muitos entre objetos, de maneira que quando um
//objeto muda de estado todos os seus dependentes são notificados e atualizados
//automaticamente.