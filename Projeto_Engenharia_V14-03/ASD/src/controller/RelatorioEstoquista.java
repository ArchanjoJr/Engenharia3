package controller;

import java.util.Date;

import model.*;

import java.util.LinkedList;

//estoquista ve:id, qtd, data de armazenamento, fornecedor
@SuppressWarnings("unused")
public class RelatorioEstoquista implements Relatorio {

	public String[] gerarRelatorio(Produto p) {
		BancoDados bd = BancoDados.getInstancia();
		Produto res = bd.buscarProduto(p);

		if (res == null) {

			return null;
		} else {
			String[] resultado = { Integer.toString(res.getId()), Integer.toString(res.getQtd()),
					res.getSpec().getDataEstoque(), res.getSpec().getFornecedor() };
			return resultado;
		}

	}

}
