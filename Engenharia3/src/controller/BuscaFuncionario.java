package controller;
import model.*;

public class BuscaFuncionario implements BuscaFunc {

	public Funcionario buscarFuncionario( Funcionario f) {
		BancoDados bd = BancoDados.getInstancia();
		Funcionario res = bd.buscarFuncionario(f);
		if(res != null) {
			System.out.println("Nome :"+res.getNome());
			return res;
		}
		return null;
	}

}
