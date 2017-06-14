package controller;

import java.util.Date;

import model.*;

import java.util.LinkedList;

//estoquista ve:id, qtd, data de armazenamento, fornecedor
@SuppressWarnings("unused")
public class RelatorioEstoquista implements Relatorio {

	public Produto gerarRelatorio(Produto p) {
		BancoDados bd = BancoDados.getInstancia();
		Produto res = bd.buscarProduto(p);

		if (res == null) {

			return null;
		} else {
			return res;
			}

		}

	}
