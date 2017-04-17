package model;

public class EspecFunc {
	
	public EspecFunc(Funcao nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	private Funcao nome;
	private Double salario;
	
	public Funcao getNome() {
		return nome;
	}
	public void setNome(Funcao nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
