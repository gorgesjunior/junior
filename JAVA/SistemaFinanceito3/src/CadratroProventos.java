import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadratroProventos extends JFrame {
	
	private JTextField campoano;
	private JTextField campomes;
	private JTextField campovalor;
	private JTextField campocampoimposto;
	
	private JLabel ano;
	private JLabel mes;
	private JLabel valor;
	private JLabel imposto;
	
	private JButton button1; 
	private JButton button2; 
	
	public CadratroProventos(String titulo) {
		super(titulo);
		
		campoano = new JTextField();
		campomes = new JTextField();
		campovalor = new JTextField();
		campocampoimposto = new JTextField();

		ano = new JLabel("ano:");
		mes = new JLabel("mes:");
		valor = new JLabel("valor:");
		imposto = new JLabel("imposto:");
		
		button1 = new JButton("Enviar");
		button2 = new JButton("Voltar menu");
	}
	
	public void mostrarTela() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(150, 300);
		setLayout(new GridLayout(2, 1));
		Container cp = getContentPane();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		panel.add(ano);
		panel.add(campoano);
		panel.add(mes);
		panel.add(campomes);
		panel.add(valor);
		panel.add(campovalor);
		panel.add(imposto);
		panel.add(campocampoimposto);
		panel.add(button1);
		panel.add(button2);
		cp.add(panel);
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2, 6));
		panel2.add(ano);
		panel2.add(campoano);
		panel2.add(mes);
		panel2.add(campomes);
		panel2.add(valor);
		panel2.add(campovalor);
		panel2.add(imposto);
		panel2.add(campocampoimposto);
		panel2.add(button1);
		panel2.add(button2);
		cp.add(panel2);
		
		pack();
		setVisible(true);
		
		button1.addActionListener(new ActionListener() {
			int botao = 1;
        	@Override
        	public void actionPerformed(ActionEvent evt) {
        		if (botao == 1) {
        			Proventos proventos = new Proventos();
        			proventos.setAno(Integer.parseInt(campoano.getText()));
        			proventos.setMes(Integer.parseInt(campomes.getText()));
        			proventos.setValor(Integer.parseInt(campovalor.getText()));
        			proventos.setImposto(Integer.parseInt(campocampoimposto.getText()));
        			
        			Dao dao = new Dao();
        			try {
						dao.setProventos(proventos);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
        			botao = 0;
				}
        	}
        });
		
		button2.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent evt) {
        		dispose();
        	}
        });
	}
	
	public static void main(String[] args) {
		
		CadratroProventos executar = new CadratroProventos("Cadastro de Poventos");
		executar.mostrarTela();
	}
}
