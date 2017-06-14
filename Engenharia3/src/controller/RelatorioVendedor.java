package controller;
import  model.*;

public class RelatorioVendedor implements Relatorio {

//vendedor ve :id,descrição preçofinal	
	public Produto gerarRelatorio(Produto p){
		BancoDados bd = BancoDados.getInstancia();
		Produto res = bd.buscarProduto(p);
		if(res != null) {		//id   							descrição					preço final										quantidade no estoque
			return res;
		}else {
			return null;
		}
		
	}
}
