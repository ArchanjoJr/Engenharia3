package controller;

import model.BancoDados;
import model.Funcionario;
import java.util.Scanner;

public class AlterarFuncionario implements AlterarFunc {

	@Override
	public void altFunc(Funcionario f) {
		Scanner sc = new Scanner(System.in);
		BancoDados bd = BancoDados.getInstancia();
		Funcionario re = bd.buscarFuncionario(f);
		if (re != null) {
			System.out.println("Funcionario :" + re.getNome());
			System.out.print("Digite o Novo Nome:");re.setNome(sc.next());
			System.out.println("FUNCIONARIO:" + re.getNome());
			System.out.println("---------------------------------------------------");
			
			System.out.println("Endereço :" + re.getEndereco());
			System.out.print("Digite o Novo Endereço:");re.setEndereco(sc.next());
			System.out.println("Endereço:" + re.getEndereco());
			System.out.println("---------------------------------------------------");
			
			System.out.println("Rg :" + re.getRg());
			System.out.print("Digite o Novo RG:");re.setNome(sc.next());
			System.out.println("Rg:" + re.getRg());
			System.out.println("---------------------------------------------------");
			
			System.out.println("CPF:" + re.getCpf());
			System.out.print("Digite o Novo CPF:");re.setCpf(sc.next());
			System.out.println("CPF:" + re.getCpf());
			System.out.println("---------------------------------------------------");
			
			System.out.println("Data de Admissão:" + re.getDataAdmissao());
			System.out.print("Digite a nova data de admissâo:");re.setDataAdmissao(sc.next());
			System.out.println("Data de Admissão:" + re.getDataAdmissao());
		}

	}
}
