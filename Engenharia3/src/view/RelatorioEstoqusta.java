package view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.RelatorioEstoquista;
import model.Produto;
import model.SpecProduto;

public class RelatorioEstoqusta implements ActionListener {

	JFrame janela = new JFrame("RELATORIO ESTOQUISTA");
	JPanel painelDados = new JPanel();
	JPanel painelbotao = new JPanel();
	JButton buscar = new JButton("BUSCAR");
	JButton voltar = new JButton("VOLTAR");
	JTextField idProd = new JTextField(5);
	JTextField nomeProd = new JTextField(50);
	JTextField descricao = new JTextField(15);
	JTextField fornecedor = new JTextField(30);

	JLabel lblid = new JLabel("ID:");
	JLabel lblnome = new JLabel("NOME:");
	JLabel lbldescr = new JLabel("DESCRIÇÃO:");
	JLabel lblfornecedor = new JLabel("FORNECEDOR:");

	JFrame janela2 = new JFrame("RESULTADO DA BUSCA");
	JPanel painelDados2 = new JPanel();
	JPanel painelbotao2 = new JPanel();
	JButton novaBusca = new JButton("OK");
	JButton voltar2 = new JButton("VOLTAR");

	JTextField idFunc = new JTextField(5);
	JTextField nome = new JTextField(50);
	JTextField quantidade = new JTextField(50);
	JTextField descricao2 = new JTextField(15);
	JTextField dataEntraEstoque = new JTextField(11);
	JTextField precoCompra = new JTextField(10);
	JTextField precoFinal = new JTextField(30);
	JTextField fornecedor2 = new JTextField(30);

	JLabel lblid2 = new JLabel("ID: ");
	JLabel lblnome2 = new JLabel("NOME: ");
	JLabel lblqtd = new JLabel("QUANTIDADE: ");
	JLabel lbldescr2 = new JLabel("DESCRIÇÃO: ");
	JLabel lblentrada = new JLabel("DATA/ENTRADA: ");
	JLabel lblprecoCompra = new JLabel("PREÇO COMPRA: ");
	JLabel lblprecoVenda = new JLabel("PREÇO VENDA: ");
	JLabel lblfornecedor2 = new JLabel("FORNECEDOR: ");

	public void criarPainel() {
		painelDados.add(lblid);
		painelDados.add(idProd);
		painelDados.add(lblnome);
		painelDados.add(nomeProd);
		painelDados.add(lbldescr);
		painelDados.add(descricao);
		painelDados.add(lblfornecedor);
		painelDados.add(fornecedor);

		painelDados.setLayout(new GridLayout(4, 2));
		painelbotao.add(buscar);
		painelbotao.add(voltar);
		buscar.addActionListener(this);
		voltar.addActionListener(this);
		janela.add(painelDados);
		janela.setLayout(new GridLayout(2, 1));
		janela.add(painelbotao);
		janela.setSize(500, 180);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
	}

	public void criarRelatorio(Produto p) {
		lblid2.setText("ID: "+ p.getId());
		painelDados2.add(lblid2);
		lblnome2.setText("Nome: "+p.getNome());
		painelDados2.add(lblnome2);
		lblqtd.setText("Quantidade: "+ p.getQtd());
		painelDados2.add(lblqtd);
		lbldescr2.setText("Descrição: "+p.getSpec().getDescricao());
		painelDados2.add(lbldescr2);
		lblentrada.setText("Data/Entrada: "+p.getSpec().getDataEstoque());
		painelDados2.add(lblentrada);
		lblprecoCompra.setText("Preco compra: "+p.getSpec().getPrecoCompra());
		painelDados2.add(lblprecoCompra);
		lblprecoVenda.setText("Preco Venda: "+p.getSpec().getPrecoFinal());
		painelDados2.add(lblprecoVenda);
		lblfornecedor2.setText("Fornecedor: "+p.getSpec().getFornecedor());
		painelDados2.add(lblfornecedor2);

		painelDados2.setLayout(new GridLayout(4, 2));
		painelbotao2.add(novaBusca);

		novaBusca.addActionListener(this);

		janela2.add(painelDados2);
		janela2.setLayout(new GridLayout(2, 1));
		janela2.add(painelbotao2);
		janela2.setSize(500, 180);
		janela2.setVisible(true);
		janela2.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == buscar) {
			if (idProd.getText().isEmpty() || nomeProd.getText().isEmpty()|| descricao.getText().isEmpty() || fornecedor.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null,"ALgum Campo Vazio");
				
			}else{
				RelatorioEstoqusta r = new RelatorioEstoqusta();
				RelatorioEstoquista re = new RelatorioEstoquista(); 
				r.criarRelatorio(re.gerarRelatorio(new Produto(nomeProd.getText(),Integer.parseInt(idProd.getText()), Integer.parseInt(idProd.getText()), new SpecProduto(descricao.getText(), null, null, null, fornecedor.getText()))));

			}
		}
		
		if(event.getSource() == voltar) {
			janela.setVisible(false);
		}
		if(event.getSource()== novaBusca) {
			janela2.dispose();
		}
	}

}