package controller;

import model.*;
//mostra todos os ITEMS DO PRODUTO
public class RelatorioGerente implements Relatorio {

	public Produto gerarRelatorio(Produto p) {
		BancoDados bd = BancoDados.getInstancia();
		Produto res = bd.buscarProduto(p);
		if (res != null) {  
			return res;
		} else {
			return null;

		}
	}
}
