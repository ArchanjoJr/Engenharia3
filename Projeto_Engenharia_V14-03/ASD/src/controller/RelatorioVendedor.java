package controller;
import  model.*;

public class RelatorioVendedor implements Relatorio {

//vendedor ve :id,descrição preçofinal	
	public String[] gerarRelatorio(Produto p){
		BancoDados bd = BancoDados.getInstancia();
		Produto res = bd.buscarProduto(p);
		if(res != null) {		//id   							descrição					preço final										quantidade no estoque
			String[] relatorio = {Integer.toString(res.getId()),res.getSpec().getDescricao(),Double.toString(res.getSpec().getPrecoFinal()),Integer.toString(res.getQtd())};
			return relatorio;
		}else {
			return null;
		}
		
	}
}
