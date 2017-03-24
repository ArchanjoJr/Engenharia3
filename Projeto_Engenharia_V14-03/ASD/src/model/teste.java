package model;

public class teste {

	public static void main(String[] args) {
		Produto p = new Produto();
		Produto q = new Produto();
		Produto r = new Produto();
		SpecProduto p1 = new SpecProduto();
		SpecProduto q1 = new SpecProduto();
		SpecProduto r1 = new SpecProduto();
		Estoque estoque = new Estoque();
		p.setId(001);
		q.setId(002);
		r.setId(003);
		p.setNome("PENDRIVAO");
		q.setNome("QIPHONE");
		r.setNome("RAWSPEBERRY PI");
		p1.setDescricao("pendrive grande e formoso");
		q1.setDescricao("barato e pirata mais tem a maça");
		r1.setDescricao("PARA HACKERS GAMERS");
		p.setEspec(p1);
		q.setEspec(q1);
		r.setEspec(r1);
		estoque.addProduto(p);
		estoque.addProduto(q);
		estoque.addProduto(r);
		System.out.println("Quantidade de Itens no Estoque:"+estoque.getQtd());
	}

}
