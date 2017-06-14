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
import controller.CadastroProduto;
import model.BancoDados;

public class CadastrarProduto implements ActionListener{


	JFrame janela = new JFrame("CADASTRAR PRODUTO");
	JPanel painelDados = new JPanel();
	JPanel painelbotao = new JPanel();
	JButton cadastrar = new JButton("CADASTRAR");
	JButton voltar = new JButton("VOLTAR");
	Menu m = new Menu();
	JTextField idProd = new JTextField(5);
	JTextField nome = new JTextField(50);
	JTextField quantidade = new JTextField(50);
	JTextField descricao = new JTextField(15);
	JTextField dataEntraEstoque = new JTextField(11);
	JTextField precoCompra = new JTextField(10);
	JTextField precoFinal = new JTextField(30);
	JTextField fornecedor = new JTextField(30);

	JLabel lblid = new JLabel("ID:");
	JLabel lblnome = new JLabel("NOME:");
	JLabel lblqtd = new JLabel("QUANTIDADE:");
	JLabel lbldescr = new JLabel("DESCRIÇÃO:");
	JLabel lblentrada = new JLabel("DATA/ENTRADA:");
	JLabel lblprecoCompra = new JLabel("PREÇO COMPRA:");
	JLabel lblprecoVenda = new JLabel("PREÇO VENDA:");
	JLabel lblfornecedor = new JLabel("FORNECEDOR:");

	
public void criarPainel(){
	cadastrar.addActionListener(this);
	voltar.addActionListener(this);
	painelDados.add(lblid);
	painelDados.add(idProd);
	painelDados.add(lblnome);
	painelDados.add(nome);
	painelDados.add(lblqtd);
	painelDados.add(quantidade);
	painelDados.add(lbldescr);
	painelDados.add(descricao);
	painelDados.add(lblentrada);
	painelDados.add(dataEntraEstoque);
	painelDados.add(lblprecoCompra);
	painelDados.add(precoCompra);
	painelDados.add(lblprecoVenda);
	painelDados.add(precoFinal);
	painelDados.add(lblfornecedor);
	painelDados.add(fornecedor);

	painelDados.setLayout(new GridLayout(4,2));
	painelbotao.add(cadastrar);
	painelbotao.add(voltar);
	
	janela.add(painelDados);
	janela.setLayout(new GridLayout(2,1));
	janela.add(painelbotao);
	janela.setSize(500,180);
	janela.setVisible(true);
	janela.setLocationRelativeTo(null);
}


@Override
public void actionPerformed(ActionEvent event) {
	if(event.getSource() == voltar) {
		m.criarPainel();
		janela.dispose();
	}
	if(event.getSource()== cadastrar) {
		CadastroProduto cp = new CadastroProduto();
		if(idProd.getText().isEmpty() || nome.getText().isEmpty() || quantidade.getText().isEmpty() || descricao.getText().isEmpty()|| dataEntraEstoque.getText().isEmpty()|| precoCompra.getText().isEmpty()|| precoFinal.getText().isEmpty()|| fornecedor.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Algum Campo VAZIO !, TENTAR NOVAMENTE !");
		}else {
			cp.cadastrarProduto(idProd.getText(),nome.getText(),quantidade.getText(),descricao.getText(),dataEntraEstoque.getText(),precoCompra.getText(),precoFinal.getText(),fornecedor.getText());
			BancoDados bd= BancoDados.getInstancia();
		
		}
	}
	
}
	
	
	
	
}
