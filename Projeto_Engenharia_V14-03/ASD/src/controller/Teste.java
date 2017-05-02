package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {
		Produto q = new Produto("PENO", 2, 225, new SpecProduto("111111111", "25/78/4120", 10.0, 5.0, "VITAO"));
		RelatorioEstoquista r = new RelatorioEstoquista();
		RelatorioVendedor rv = new RelatorioVendedor();
		RelatorioGerente  rg = new RelatorioGerente();
		Facade f = new Facade();
		f.iniciarEstoqueProduto();
		String[] val = r.gerarRelatorio(q);
		if (val != null) {
			System.out.println("id:"+val[0]);
			System.out.println("Quantidade no Estoque:"+val[1]);
			System.out.println("Data De Armazenamento :"+val[2]);
			System.out.println("Fornecedor:"+val[3]);
			System.out.println("------------------------------------------------------------------");
			}
		val = rv.gerarRelatorio(q);
		if (val != null) {
			System.out.println("id:"+val[0]);
			System.out.println("Descrição:"+val[1]);
			System.out.println("preço final:"+Double.parseDouble(val[2]));
			System.out.println("Quantidade em estoque:"+val[3]);
			System.out.println("------------------------------------------------------------------");
			}
		val = rg.gerarRelatorio(q);
		if (val != null) {
			System.out.println("id:"+val[0]);
			System.out.println("Nome:"+val[1]);
			System.out.println("Quantidade:"+val[2]);
			System.out.println("Descrição:"+val[3]);
			System.out.println("Data Entrada Estoque:"+val[4]);
			System.out.println("Preço Final:"+Double.parseDouble(val[5]));
			System.out.println("Preço Compra:"+Double.parseDouble(val[6]));
			System.out.println("Fornecedor:"+val[7]);
			System.out.println("-------------------------------------------------------------------------");
		}
		
		}

	}