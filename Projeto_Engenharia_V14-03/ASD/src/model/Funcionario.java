package model;

import java.util.Date;

public class Funcionario {
 
	private int id;
	private String nome;
	private String endereco;
	private String rg;
	private int cpf;
	private Date dataAdmissao;
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
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public EspecFunc getEspecificacaoFunc() {
		return especificacaoFunc;
	}
	public void setEspecificacaoFunc(EspecFunc especificacaoFunc) {
		this.especificacaoFunc = especificacaoFunc;
	}
	
	
	
}
