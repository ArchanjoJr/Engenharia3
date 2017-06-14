package controller;

import model.BancoDados;
import model.EspecFunc;
import model.Funcao;
import model.Funcionario;

public class CadastroFuncionario implements CadastroFunc {

	public void cadastrarFuncionario(String id, String nome, String endereco, String rg, String cpf, String data,
			Funcao funcao, Double salario, String senha) {
		BancoDados bd = BancoDados.getInstancia();
		Funcionario f = new Funcionario(id,nome,endereco,rg,cpf,data,new EspecFunc(funcao,salario),senha);
		bd.addFunc(f);
		bd.PrintFuncionario();
		
	}

}
