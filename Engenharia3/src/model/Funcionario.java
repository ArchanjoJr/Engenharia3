package model;
public class Funcionario {
	private String id;
	private String nome;
	private String endereco;
	private String rg;
	private String cpf;
	private String dataAdmissao;
	private EspecFunc especificacaoFunc;
	private String senha;
	
	public String  getId() {
		return id;
	}
	public void setarID(String i) {
		this.id = i;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getRg() {
		return rg;
	}
	
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String s) {
		this.senha = s;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public EspecFunc getEspecificacaoFunc() {
		return especificacaoFunc;
	}
	public void setEspecificacaoFunc(EspecFunc especificacaoFunc) {
		this.especificacaoFunc = especificacaoFunc;
	}
	public Funcionario(String id, String nome, String endereco, String rg,
			String cpf, String dataAdmissao, EspecFunc especificacaoFunc,String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.rg = rg;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
		this.especificacaoFunc = especificacaoFunc;
		this.senha = senha;
	}
	
	
	
}
