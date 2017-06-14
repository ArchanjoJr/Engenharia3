package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu implements ActionListener {
	JFrame janela = new JFrame("MENU PRINCIPAL");
	JPanel painelDados = new JPanel();
	JPanel painelbotao = new JPanel();
	JButton cadastrarFunc = new JButton("CADASTRAR FUNCIONARIO");
	JButton cadastrarProd = new JButton("CADASTRAR PRODUTO");
	JButton gerarRelatorio = new JButton("BUSCA/RELATORIO PRODUTO");
	JButton buscarFunc = new JButton("BUSCAR FUNCIONARIO");
	JButton sair = new JButton("SAIR SISTEMA");

	public void criarPainel() {
		cadastrarFunc.addActionListener(this);
		cadastrarProd.addActionListener(this);
		gerarRelatorio.addActionListener(this);
		buscarFunc.addActionListener(this);
		sair.addActionListener(this);
		painelDados.setLayout(new GridLayout(4, 2));
		painelbotao.add(cadastrarFunc);
		painelbotao.add(cadastrarProd);
		painelbotao.add(gerarRelatorio);
		painelbotao.add(buscarFunc);
		painelbotao.add(sair);
		janela.add(painelDados);
		janela.setLayout(new GridLayout(2, 2));
		janela.add(painelbotao);
		janela.setSize(600, 180);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == sair) {
			janela.dispose();
		}
		if (event.getSource() == cadastrarProd) {
			CadastrarProduto cp = new CadastrarProduto();
			cp.criarPainel();
			janela.dispose();
		}
		if (event.getSource() == cadastrarFunc) {
			CadastrarFuncionario cf = new CadastrarFuncionario();
			cf.criarPainel();
			janela.dispose();
		}
		if (event.getSource() == buscarFunc) {
			BuscarFuncionario bf = new BuscarFuncionario();
			bf.criarPainel();
			janela.dispose();
		}

	}
}