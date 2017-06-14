package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.BuscaFuncionario;
import model.EspecFunc;
import model.Funcionario;

public class BuscarFuncionario implements ActionListener {

	JFrame janela = new JFrame("BUSCAR FUNCIONARIO");
	JPanel painelDados = new JPanel();
	JPanel painelbotao = new JPanel();
	JButton buscar = new JButton("BUSCAR");
	JButton voltar = new JButton("VOLTAR");
	JButton voltarRE = new JButton("VOLTAR");
	JTextField idFunc = new JTextField(5);
	JTextField nomeFunc = new JTextField(50);
	JTextField cpf = new JTextField(15);
	JTextField nome = new JTextField(50);
	JTextField endereco = new JTextField(50);
	JTextField rg = new JTextField(15);
	JTextField dataAdmissao = new JTextField(10);
	JTextField funcao = new JTextField(30);
	JLabel lblid = new JLabel("ID:");
	JLabel lblidResultado = new JLabel("ID RESULTADO");
	JLabel lblnomeFunc = new JLabel("NOME:");
	JLabel lblnomeResultado = new JLabel("NOME RESULTADO");
	JLabel lblcpf = new JLabel("CPF:");
	JLabel lblcpfResultado = new JLabel("CPF RESULTADO");
	JLabel lblnome = new JLabel("NOME:");
	JLabel lblendereco = new JLabel("ENDEREÇO:");
	JLabel lblenderecoResultado = new JLabel("ENDERECO RESULTADO");
	JLabel lblrg = new JLabel("RG:");
	JLabel lblrgResultado = new JLabel("RG RESULTADO");
	JLabel lbldata = new JLabel("DATA ADMISSÃO:");
	JLabel lbldataResultado = new JLabel("DATA RESULTADO");
	JLabel lblfuncao = new JLabel("FUNÇAO:");
	JLabel lblfuncaoResultado = new JLabel("FUNCAO RESULTADO");
	JLabel lblSalario = new JLabel("SALARIO:");
	JLabel lblSalarioResultado = new JLabel("SALARIO RESULTADO");

	public void criarPainel() {
		painelDados.add(lblid);
		painelDados.add(idFunc);
		painelDados.add(lblnomeFunc);
		painelDados.add(nomeFunc);
		painelDados.add(lblcpf);
		painelDados.add(cpf);
		painelDados.setLayout(new GridLayout(4, 2));
		painelbotao.add(buscar);
		painelbotao.add(voltar);
		janela.add(painelDados);
		janela.setLayout(new GridLayout(2, 1));
		janela.add(painelbotao);
		janela.setSize(500, 180);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		buscar.addActionListener(this);
		voltar.addActionListener(this);
	}

	public void criarPainelResultado(Funcionario f) {

		painelDados.add(lblid);
		lblidResultado.setText(f.getId());
		painelDados.add(lblidResultado);
		painelDados.add(lblnome);
		lblnomeResultado.setText(f.getNome());
		painelDados.add(lblnomeResultado);
		painelDados.add(lblendereco);
		lblenderecoResultado.setText(f.getEndereco());
		painelDados.add(lblenderecoResultado);
		painelDados.add(lblrg);
		lblrgResultado.setText(f.getRg());
		painelDados.add(lblrgResultado);
		painelDados.add(lblcpf);
		lblcpfResultado.setText(f.getCpf());
		painelDados.add(lblcpfResultado);
		painelDados.add(lbldata);
		lbldataResultado.setText(f.getDataAdmissao());
		painelDados.add(lbldataResultado);
		painelDados.add(lblfuncao);
		lblfuncaoResultado.setText(f.getEspecificacaoFunc().getNome().name());
		painelDados.add(lblfuncaoResultado);
		painelDados.add(lblSalario);
		lblSalarioResultado.setText(f.getEspecificacaoFunc().getSalario().toString());
		painelDados.add(lblSalarioResultado);
		painelDados.setLayout(new GridLayout(4, 2));
		painelbotao.add(voltarRE);
		janela.add(painelDados);
		janela.setLayout(new GridLayout(2, 1));
		janela.add(painelbotao);
		janela.setSize(500, 180);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		voltarRE.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == buscar) {
			BuscaFuncionario bf = new BuscaFuncionario();
			Funcionario f = new Funcionario(idFunc.getText(), "", "", "", cpf.getText(), "", new EspecFunc(null, 0.0),
					"");
			Funcionario res = bf.buscarFuncionario(f);
			if (res != null) {
				BuscarFuncionario b = new BuscarFuncionario();
				b.criarPainelResultado(res);
			} else {
				JOptionPane.showMessageDialog(null, "USUARIO NAO ENCONTRADO NO BANCO DE DADOS !");
			}

		}
		
		if (event.getSource() == voltar) {
			Menu m = new Menu();
			m.criarPainel();
			janela.dispose();
		}
		if (event.getSource() == voltarRE) {
			BuscarFuncionario bf = new BuscarFuncionario();
			bf.criarPainel();
			janela.dispose();
		}

	}
}
