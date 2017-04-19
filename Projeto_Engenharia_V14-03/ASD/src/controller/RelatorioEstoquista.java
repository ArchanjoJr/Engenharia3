package controller;

import java.util.Date;

import model.*;

import java.util.LinkedList;


@SuppressWarnings("unused")
public class RelatorioEstoquista implements Relatorio {
	
	public Produto gerarRelatorio(Produto p) {
		BancoDados bd = BancoDados.getInstancia();
		Produto resultado = bd.buscarProduto(p);
		return (Produto) resultado;
		
	}

	

}
