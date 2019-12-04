import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroDivida extends JFrame {
	
	private JTextField campoano;
	private JTextField campomes;
	private JTextField campovalor;
	private JTextField campopercentual_desconto;
	
	private JLabel ano;
	private JLabel mes;
	private JLabel valor;
	private JLabel percentual_desconto;
	
	private JButton button1; 
	private JButton button2; 
	
	public CadastroDivida(String titulo) {
		super(titulo);
		
		campoano = new JTextField();
		campomes = new JTextField();
		campovalor = new JTextField();
		campopercentual_desconto = new JTextField();

		ano = new JLabel("ano:");
		mes = new JLabel("mes:");
		valor = new JLabel("valor:");
		percentual_desconto = new JLabel("percentual_desconto:");
		
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
		panel.add(percentual_desconto);
		panel.add(campopercentual_desconto);
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
		panel2.add(percentual_desconto);
		panel2.add(campopercentual_desconto);
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
        			Dividas dividas = new Dividas();
        			dividas.setAno(Integer.parseInt(campoano.getText()));
        			dividas.setMes(Integer.parseInt(campomes.getText()));
        			dividas.setValor(Integer.parseInt(campovalor.getText()));
        			dividas.setPercentual_desconto(Integer.parseInt(campopercentual_desconto.getText()));
        			
        			Dao dao = new Dao();
        			try {
						dao.setDivida(dividas);
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
		
		CadastroDivida executar = new CadastroDivida("Cadastro de Divida");
		executar.mostrarTela();
	}
}
