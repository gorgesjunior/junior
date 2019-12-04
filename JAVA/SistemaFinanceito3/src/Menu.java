
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JFrame {

    JButton button1 = new JButton("Cadastrar Pessoas");
    JButton button2 = new JButton("Cadastrar Divida");
    JButton button3 = new JButton("Cadastrar Proventos");
    JButton button4 = new JButton("Consultar Pessoas");
    JButton button5 = new JButton("Consultar Divida");
    JButton button6 = new JButton("Consultar Proventos");
    JButton button7 = new JButton("Sair");
    JTextField login = new JTextField();
    JPasswordField senha = new JPasswordField();

    public Menu() {

        final Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
        pane.add(button4);
        pane.add(button5);
        pane.add(button6);
        pane.add(button7);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 170);
        this.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CadastroPessoa cadastroPessoa = new CadastroPessoa("Cadastro de Cliente");
                cadastroPessoa.mostrarTela();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        Menu janela = new Menu();
    }
}