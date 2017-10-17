package controller;


import model.*;
import view.*;


public class Teste {

	public static void main(String[] args) {

		BancoDados bd = BancoDados.getInstancia();
		Facade facade = new Facade();
		facade.iniciarBDFuncionario();
		facade.iniciarEstoqueProduto();
		//teste da tela de login
		TelaLogin telalogin = new TelaLogin();
		telalogin.criarPainel();
	}

}