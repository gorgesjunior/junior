import java.util.Scanner;

public class Baralho {

	private Carta[] cartas;
	
	public static void main(String args[])
	
	public Baralho() {
		String naipes[] = new String[4];
		String nomes[] = new String[14];
		int aux = 1;
	
		naipes[0] = "ouro";
		naipes[1] = "espada";
		naipes[2] = "paus";
		naipes[3] = "copas";
	
		int x = 0;
		int j = 0;
		cartas = new Carta[56];
		int pos = 0;
	
		for (j = 0; j < 15; j++) {
	
			nomes[j] = Integer.toString(aux);
			aux++;
			if (j == 0) {
				nomes[j] = "A";
			}
			if (j == 10) {
				nomes[j] = "J";
			}
			if (j == 11) {
				nomes[j] = "Q";
			}
			if (j == 12) {
				nomes[j] = "K";
			}
			if (j== 13) {
				nomes[j] = "C";
	
		}
	
	
	
	
	}
	
		for (x = 0; x < 4; x++) {
			for (j = 0; j < 14; j++) {
				cartas[pos] = new Carta(naipes[x], nomes[j]);
				pos++;
	
			}
		}
	
	}
	
	public void daCarta() {
	
	}
	
	public static void main(String[] args) {
		new Baralho();
	
	}
	
	}
