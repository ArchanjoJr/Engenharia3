package model;

import java.util.Date;

public class Funcionario {
 
	private int id;
	private String nome;
	private String endereco;
	private String rg;
	private String cpf;
	private String dataAdmissao;
	private EspecFunc especificacaoFunc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Funcionario(int id, String nome, String endereco, String rg,
			String cpf, String dataAdmissao, EspecFunc especificacaoFunc) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.rg = rg;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
		this.especificacaoFunc = especificacaoFunc;
	}
	
	
	
}
