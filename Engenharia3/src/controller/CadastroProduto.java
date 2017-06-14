package controller;
import model.*;

public class CadastroProduto implements CadastroProd {
	@Override
	public void cadastrarProduto(String ID, String Nome,String Qtd,String Desc,String Data,String PrecoCom, String PrecoFinal,String fornecedor) {
		BancoDados bd = BancoDados.getInstancia();
		Produto p = new Produto(Nome,Integer.parseInt(ID),Integer.parseInt(Qtd),new SpecProduto(Desc,Data,Double.parseDouble(PrecoFinal),Double.parseDouble(PrecoCom),fornecedor));
		bd.addProduto(p);
	}

	
}
