import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroPessoa extends JFrame {

	private JLabel id = new JLabel("id");
	private JLabel nome = new JLabel("nome");
	private JLabel email = new JLabel("email");
	private JLabel retorno;

	private JTextField campoid = new JTextField(5);
	private JTextField camponome = new JTextField(20);
	private JTextField campoemail = new JTextField(20);

	private JButton button1;
	private JButton button2;

	public CadastroPessoa(String titulo) {
		super(titulo);

		id = new JLabel("id:");
		nome = new JLabel("Nome:");
		email = new JLabel("E-mail:");

		campoid = new JTextField(5);
		campoemail = new JTextField(20);
		camponome = new JTextField(20);

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
		panel.add(id);
		panel.add(campoid);
		panel.add(nome);
		panel.add(camponome);
		panel.add(email);
		panel.add(campoemail);
		panel.add(button1);
		panel.add(button2);
		cp.add(panel);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2, 6));
		panel2.add(id);
		panel2.add(campoid);
		panel2.add(email);
		panel2.add(campoemail);
		panel2.add(nome);
		panel2.add(camponome);
		panel.add(button1);
		panel.add(button2);
		cp.add(panel2);

		pack();
		setVisible(true);

		button1.addActionListener(new ActionListener() {
			int botao = 1;

			@Override
			public void actionPerformed(ActionEvent evt) {
				if (botao == 1) {
					Pessoas pessoas = new Pessoas();
					pessoas.setNome(camponome.getText());
					pessoas.setEmail(campoemail.getText());

					Dao dao = new Dao();
					try {
						dao.setPessoa(pessoas);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					botao = 0;
					retorno = new JLabel("Cadastro Realizado");
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

		CadastroPessoa executar = new CadastroPessoa("Cadastro de Pessoa");
		executar.mostrarTela();
	}
}
