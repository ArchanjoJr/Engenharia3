package model;

public class Facade {
	static BancoDados bd;
	
	public void iniciarEstoqueProduto() {
		BancoDados bd = BancoDados.getInstancia();
		
		Produto a = new Produto("PENDRIVE", 1 ,25 , new SpecProduto("PENDRIVE 16GB KINGSTON", "10/01/2017", 9.95, 19.90, "KINGSTON LTDA"));
		Produto b = new Produto("MEMORIA SSD", 2 ,225 , new SpecProduto("MEMORIA SSD 120GB SANDISK", "01/02/2016", 159.00, 299.00, "VITAO ME"));
		Produto c = new Produto("IPAD APPLE", 3 ,2 , new SpecProduto("IPAD AIR 32GB WIFI SILVER", "12/12/2016", 1999.00, 2999.00, "APPLE DO BRASIL LTDA"));
		Produto d = new Produto("HD SAMSUNG", 4 ,2 , new SpecProduto("HD SATA 500 GB SAMSUNG", "01/05/2015", 99.00, 199.00, "SAMSUNG DO BRASIL"));
		Produto e = new Produto("PILHA AA RECARREGAVEL",5,3, new SpecProduto("PILHA SONY AA RECARREGAVEL DE 2500 MA","10/05/2014",22.00,49.00,"SONY LTDA"));
		
		bd.addProduto(a);
		bd.addProduto(b);
		bd.addProduto(c);
		bd.addProduto(d);
		bd.addProduto(e);

	}
	
	public void iniciarBDFuncionario() {
		BancoDados bd  = BancoDados.getInstancia();

		Funcionario a = new Funcionario("01","WILLIAM MOREIRA","AV JOSE PEDRO","450000000","11111111111","25/25/2015",new EspecFunc(Funcao.Estoquista,1325.00),"1234");
		Funcionario b = new Funcionario("02","MATHEUS VINICIUS","RUA CASSIANO RICARDO","460000000","22222222222","01/01/2015",new EspecFunc(Funcao.Vendedor,1540.00),"1234");
		Funcionario c = new Funcionario("03","VITOR GRANDE","RUA PARAIBUNA","4700000000","33333333333","01/01/2017",new EspecFunc(Funcao.Gerente,2500.00),"1234");
		Funcionario d = new Funcionario("04","MESSIAS SA SILVA","AV JOSE LONGO","4800000000","44444444444","02/02/2016",new EspecFunc(Funcao.Estoquista,1390.00),"1234");
		
		bd.addFunc(a);
		bd.addFunc(b);
		bd.addFunc(c);
		bd.addFunc(d);
		
	}
}
