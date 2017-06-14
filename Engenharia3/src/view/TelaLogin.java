package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.*;
import javax.swing.*;

public class TelaLogin implements ActionListener {
	Menu menu = new Menu();
	LogarFuncionario logarfuncionario = new LogarFuncionario();
	JFrame janela = new JFrame("LOGAR NO SISTEMA");
	JPanel painelDados = new JPanel();
	JPanel painelbotao = new JPanel();
	JButton logar = new JButton("LOGAR");
	JButton sair = new JButton("SAIR");
	JTextField login = new JTextField(10);
	JPasswordField senha = new JPasswordField(8);
	JLabel lbllogin = new JLabel("LOGIN:");
	JLabel lblsenha = new JLabel("SENHA:");

	public void criarPainel() {
		logar.addActionListener(this);
		sair.addActionListener(this);
		
		painelDados.add(lbllogin);
		painelDados.add(login);
		painelDados.add(lblsenha);
		painelDados.add(senha);
		painelDados.setLayout(new GridLayout(4, 2));
		painelbotao.add(logar);
		painelbotao.add(sair);
		janela.add(painelDados);
		janela.setLayout(new GridLayout(2, 1));
		janela.add(painelbotao);
		janela.setSize(250, 180);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == logar) {
			if (login.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "LOGIN OU SENHA SEM VALORES !");
			} else {
				if(logarfuncionario.verLogin(login.getText().toString(), senha.getText().toString())) {
					JOptionPane.showMessageDialog(null, "USUARIO LOGADO COM SUCESSO !");
					menu.criarPainel();
					janela.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "LOGIN OU SENHA INCORRETOS");
				}
			}
		}

		if (event.getSource() == sair) {
			janela.dispose();
		}

	}

}
