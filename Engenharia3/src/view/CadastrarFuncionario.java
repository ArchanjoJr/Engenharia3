package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.*;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CadastroFuncionario;

public class CadastrarFuncionario implements ActionListener {

	CadastroFuncionario cf = new CadastroFuncionario();
	JFrame janela = new JFrame("CADASTRAR FUNCIONARIO");
	JPanel painelDados = new JPanel();
	JPanel painelbotao = new JPanel();
	JButton cadastrar = new JButton("CADASTRAR");
	JButton voltar = new JButton("VOLTAR");

	JTextField idFunc = new JTextField(5);
	JTextField nome = new JTextField(50);
	JTextField endereco = new JTextField(50);
	JTextField rg = new JTextField(15);
	JTextField cpf = new JTextField(11);
	JTextField dataAdmissao = new JTextField(10);
	JTextField funcao = new JTextField(30);
	JTextField login = new JTextField(10);
	JTextField salario = new JTextField(12);
	JTextField senha = new JTextField(10);

	JLabel lblid = new JLabel("ID:");
	JLabel lblnome = new JLabel("NOME:");
	JLabel lblendereco = new JLabel("ENDEREÇO:");
	JLabel lblrg = new JLabel("RG:");
	JLabel lblcpf = new JLabel("CPF:");
	JLabel lbldata = new JLabel("DATA ADMISSÃO:");
	JLabel lblfuncao = new JLabel("FUNÇAO:");
	JLabel lbllogin = new JLabel("LOGIN:");
	JLabel lblsalario = new JLabel("SALARIO:");
	JLabel lblsenha = new JLabel("SENHA:");

	public void criarPainel() {

		painelDados.add(lblid);
		painelDados.add(idFunc);
		painelDados.add(lblnome);
		painelDados.add(nome);
		painelDados.add(lblendereco);
		painelDados.add(endereco);
		painelDados.add(lblrg);
		painelDados.add(rg);
		painelDados.add(lblcpf);
		painelDados.add(cpf);
		painelDados.add(lbldata);
		painelDados.add(dataAdmissao);
		painelDados.add(lblfuncao);
		painelDados.add(funcao);
		painelDados.add(lblsalario);
		painelDados.add(salario);
		painelDados.add(lblsenha);
		painelDados.add(senha);

		painelDados.setLayout(new GridLayout(5, 2));
		painelbotao.add(cadastrar);
		painelbotao.add(voltar);
		cadastrar.addActionListener(this);
		voltar.addActionListener(this);
		janela.add(painelDados);
		janela.setLayout(new GridLayout(2, 1));
		janela.add(painelbotao);
		janela.setSize(700, 300);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent event) {
		Menu menu = new Menu();
		if (event.getSource() == voltar) {
			menu.criarPainel();
			janela.dispose();
		}
		if (event.getSource() == cadastrar) {
			if (idFunc.getText().isEmpty() || nome.getText().isEmpty() || endereco.getText().isEmpty()
					|| rg.getText().isEmpty() || cpf.getText().isEmpty() || dataAdmissao.getText().isEmpty()
					|| funcao.getText().isEmpty() || salario.getText().isEmpty() || senha.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Algum Campo Vazio !");
			} else {
				Funcao fun = null;
				if (funcao.getText().toLowerCase().equals("estoquista")) {
					 fun = Funcao.Estoquista;
				} else {
					if (funcao.getText().toLowerCase().equals("vendedor")) {
						 fun = Funcao.Vendedor;
					} else {
						if (funcao.getText().toLowerCase().equals("gerente")) {
							 fun = Funcao.Gerente;
						}
					}
				}
				cf.cadastrarFuncionario(idFunc.getText(), nome.getText(), endereco.getText(), rg.getText(),
						cpf.getText(), dataAdmissao.getText(), fun, Double.parseDouble(salario.getText()),
						senha.getText());

				JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso !");
				

			}
		}

	}
}