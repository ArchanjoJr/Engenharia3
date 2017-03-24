package model;

public class Produto {


	private String nome;
	private int id;
	private SpecProduto espec;
	
	
	public String getNome(){
		return this.nome;
	}
	public int getId(){
		return this.id;
	}
	public SpecProduto getSpec(){
		return this.espec;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEspec(SpecProduto espec) {
		this.espec = espec;
	}
	
}
