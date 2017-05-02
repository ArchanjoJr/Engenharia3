package view;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;


public class telateste {
	JFrame janela = new JFrame("janela");
	JPanel painelDados = new JPanel();
	JPanel painelbotao = new JPanel();
	JButton cadastrar = new JButton("CadastrarProduto"); 
	JTextField nomeProd = new JTextField(30);
	JTextField valorProd = new JTextField(10);
	JTextField idProduto = new JTextField(10);
	JTextField descricaoProd = new JTextField(10);
	JLabel lblnome = new JLabel("NOME:");
	JLabel lblcod = new JLabel("CODIGO:");
	JLabel lblvalor = new JLabel("VALOR:");
	JLabel lbldescr = new JLabel("DESCRICAO:");
	
public void criarPainel(){
	painelDados.add(lblcod);
	painelDados.add(idProduto);
	painelDados.add(lblnome);
	painelDados.add(nomeProd);
	painelDados.add(lblvalor);
	painelDados.add(valorProd);
	painelDados.add(lbldescr);
	painelDados.add(descricaoProd);
	painelDados.setLayout(new GridLayout(4,2));
	painelbotao.add(cadastrar);
	
	janela.add(painelDados);
	janela.setLayout(new GridLayout(2,1));
	janela.add(painelbotao);
	janela.setSize(500,180);
	janela.setVisible(true);
	
}
}
