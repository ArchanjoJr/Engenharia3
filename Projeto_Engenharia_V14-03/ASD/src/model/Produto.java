package model;

public class Produto {

	private static int seq = 0;
	private String nome;
	private int id;
	private int qtd;
	private SpecProduto espec;

	public Produto(String nome, int id, int qtd, SpecProduto espec) {
		this.nome = nome;
		this.id = id;
		this.espec = espec;
		this.qtd = qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getQtd() {
		return qtd;
	}

	public String getNome() {
		return this.nome;
	}

	public int getId() {
		return this.id;
	}

	public SpecProduto getSpec() {
		return this.espec;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId() {
		this.id = this.id + seq;
		seq++;
	}

	public void setEspec(SpecProduto espec) {
		this.espec = espec;
	}

}
