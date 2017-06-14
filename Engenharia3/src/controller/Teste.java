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
//		TelaLogin telalogin = new TelaLogin();
//		telalogin.criarPainel();
//		Menu menu = new Menu();
//		menu.criarPainel();
//	
//		CadastrarFuncionario cf = new CadastrarFuncionario();
//		cf.criarPainel();
//		Funcionario rodox = new Funcionario("01","rodox","rua coisa","77.777.777-x","77777777777","25/25/2525",new EspecFunc(Funcao.Estoquista,20.0),"senha");
//		BuscarFuncionario bf = new BuscarFuncionario();
//		bf.criarPainel();
		RelatorioEstoqusta re = new RelatorioEstoqusta();
		Produto e = new Produto("PILHA AA RECARREGAVEL",2,3, new SpecProduto("PILHA SONY AA RECARREGAVEL DE 2500 MA","10/05/2014",22.00,49.00,"SONY LTDA"));
		re.criarRelatorio(e);
	}

}