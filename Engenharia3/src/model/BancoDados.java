package model;

//mudanca pesquisa buscar produtos: nome e id
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import view.Observer;

import java.util.LinkedList;

import controller.Relatorio;

public class BancoDados implements Subject {
	private List observers;
	private LinkedList<Produto> produtos;
	private LinkedList<Funcionario> funcionarios;
	private static BancoDados instancia;

	private BancoDados() {
		produtos = new LinkedList();
		funcionarios = new LinkedList();
	}

	public void addFunc(Funcionario f) {
		funcionarios.add(f);
	}

	public void removerFunc(Funcionario f) {
		funcionarios.remove(f);
	}

	public void addProduto(Produto p) {
		produtos.add(p);
	}

	public void removerProduto(Produto p) {
		produtos.remove(p);
	}

	public static BancoDados getInstancia() {
		if (instancia == null) {
			instancia = new BancoDados();
		}
		return instancia;
	}

	public Produto buscarProduto(Produto p) {
		for (int i = 0; i < produtos.size(); i++) {

				if (produtos.get(i).getNome() == p.getNome() || produtos.get(i).getId() == p.getId()) {
					return produtos.get(i);
				}
			}
			return null;
		}
		
	
	public Funcionario buscarFuncionario(Funcionario f) {
		for(int i = 0;i <funcionarios.size();i++) {
			if(f.getId().equals(funcionarios.get(i).getId())) {
				return funcionarios.get(i);
			}
		}
		return null;
		
	}
	public void PrintProduto() {
		for (int i = 0; i < produtos.size(); i++) {
			
			System.out.println("Nome: "+produtos.get(i).getNome());
			System.out.println("ID: "+produtos.get(i).getId());
			System.out.println("QTD: "+produtos.get(i).getQtd());
			System.out.println("Descricao: "+produtos.get(i).getSpec().getDescricao());
			System.out.println("DATA: "+produtos.get(i).getSpec().getDataEstoque());
			System.out.println("PREÇO COMPRA: "+produtos.get(i).getSpec().getPrecoCompra());
			System.out.println("PREÇO FINAL: "+produtos.get(i).getSpec().getPrecoFinal());
			System.out.println("fornecedor: "+produtos.get(i).getSpec().getFornecedor());
			
		}
		
	}

	public void PrintFuncionario() {
		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println("ID: "+funcionarios.get(i).getId());
			System.out.println("Nome: "+funcionarios.get(i).getNome());
			System.out.println("Endereço: "+funcionarios.get(i).getEndereco());
			System.out.println("RG: "+funcionarios.get(i).getRg());
			System.out.println("CPF: "+funcionarios.get(i).getCpf());
			System.out.println("DATA DE ADMISSAO: "+funcionarios.get(i).getDataAdmissao());
			System.out.println("RG: "+funcionarios.get(i).getRg());
			System.out.println("FUNÇÃO: "+funcionarios.get(i).getEspecificacaoFunc().getNome());
			System.out.println("SALARIO: "+funcionarios.get(i).getEspecificacaoFunc().getSalario());
		}
		
	}
	public int getQtd() {
		int acc = 0;
		for (int i = 0; i < produtos.size(); i++) {
			acc++;
		}
		System.out.println(acc);
		return acc;
		
	}
	public int getQtdfUNC() {
		int acc = 0;
		for (int i = 0; i < funcionarios.size(); i++) {
			acc++;
		}
		return acc;
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

}
