package controller;

import model.*;
//mostra todos os ITEMS DO PRODUTO
public class RelatorioGerente implements Relatorio {

	public String[] gerarRelatorio(Produto p) {
		BancoDados bd = BancoDados.getInstancia();
		Produto res = bd.buscarProduto(p);
		if (res != null) {  
			String[] relatorio = { Integer.toString(res.getId()), res.getNome(), Integer.toString(res.getQtd()), res.getSpec().getDescricao(), res.getSpec().getDataEstoque(), Double.toString(res.getSpec().getPrecoFinal()), Double.toString(res.getSpec().getPrecoCompra()), res.getSpec().getFornecedor()};
			return relatorio;
		} else {
			return null;

		}
	}
}
