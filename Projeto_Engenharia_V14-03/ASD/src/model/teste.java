package model;

import controller.Relatorio;
import controller.RelatorioEstoquista;

public class teste {
 static BancoDados b;
	public static void main(String[] args) {
		Relatorio r = new RelatorioEstoquista();
		b = b.getInstancia();
		
		Produto pendrivao = new Produto("PENDRIVAO", 1 ,25 , new SpecProduto("164asdas", "10/01/1010", 3.0, 5.0, "ricardao"));
		Produto peno = new Produto("PENO", 2 ,225 , new SpecProduto("1LÇLÇLÇLÇLÇLÇL", "25/78/4120", 10.0, 5.0, "VITAO"));
		Produto drivao = new Produto("DRIVAO", 3 ,2 , new SpecProduto("WWWWWWWWW", "79/87/2017", 2.99, 7000.0, "ritinha"));
		Produto drivab = new Produto("", 1 ,2 , new SpecProduto("WWWWWWWWW", "79/87/2017", 2.99, 7000.0, "ritinha"));

		Produto d = new Produto("d",2,3, new SpecProduto("asdfasdfas","78/44/1954",1.32,78412.1,"dougras"));
		Funcionario rodox = new Funcionario(01,"rodox","rua coisa","77.777.777-x","77777777777","25/25/2525",new EspecFunc(Funcao.Estoquista,20.0));
		Funcionario fedex = new Funcionario(02,"fedex","rua thing","88.888.888-x","88888888888","50/50/5050",new EspecFunc(Funcao.Vendedor,1.0));
		Funcionario gerex = new Funcionario(00,"gerex","rua comando","00.000.000.0-x","0000000000","00/00/0000",new EspecFunc(Funcao.Gerente,20.0));
		Funcionario fe = new Funcionario(01,"rodox","rua coisa","77.777.777-x","777777777777","25/25/2525",new EspecFunc(Funcao.Estoquista,20.0));
		b.addProduto(pendrivao);
		b.addProduto(peno);
		b.addProduto(drivao);
		b.addFunc(rodox);
		b.addFunc(fedex);
		b.addFunc(gerex);
		r.gerarRelatorio(drivab);
		System.out.println("Quantidade de Itens no Estoque:"+b.getQtd());
		Produto resultado  = b.buscarProduto(drivab);
	}

}
