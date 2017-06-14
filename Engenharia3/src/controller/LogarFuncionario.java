package controller;

import model.BancoDados;
import model.EspecFunc;
import model.Funcao;
import model.Funcionario;

public class LogarFuncionario implements Logar {

	

	

	public boolean verLogin(String ID, String senha) {
		BancoDados bd = BancoDados.getInstancia();
		Funcionario f = new Funcionario(ID,"","","","","",new EspecFunc(null,0.0),senha);
		Funcionario DB = bd.buscarFuncionario(f);
		if (DB != null) {
			if (f.getId().equals(DB.getId()) && f.getSenha().equals(DB.getSenha())) {
				return true;
			}else {
				return false;
			}
		}else {
			
			return false;
		}
	}
}
