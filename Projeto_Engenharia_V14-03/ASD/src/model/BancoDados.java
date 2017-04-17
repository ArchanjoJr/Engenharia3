package model;

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
	
	
	
	private BancoDados(){
		produtos  = new LinkedList();
		funcionarios = new LinkedList();
	}
	
	
	public void addFunc(Funcionario f){
		funcionarios.add(f);
	}
	
	public void removerFunc(Funcionario f){
		funcionarios.remove(f);
	}
	public boolean buscarFunc(Funcionario f){
		for (int i = 0;i < funcionarios.size();i++){
			if(funcionarios.get(i).equals(f)){
				System.out.println(f.getNome());
				return true;
			}
		}
		return false;
		
	}
	public void addProduto(Produto p) {	
		produtos.addFirst(p);
	}
	public void removerProduto(Produto p) {
		produtos.remove(p);
	}

	
	public static BancoDados getInstancia(){
		if(instancia == null){
			instancia  = new BancoDados();
		}
		return instancia;
	}
	
	
	
	public boolean buscarProduto(Produto p) {
		
		for (int i = 0;i < produtos.size();i++){
			if(produtos.get(i).equals(p)){
				System.out.println(p.getNome());
				return true;
			}
		}
		return false;
		
	}

	
	public int getQtd() {
		int acc = 0;
		for(int i = 0;i < produtos.size();i++){
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

	public Relatorio gerarRelatorio(Relatorio r, Produto p) {
		return r;
	}
}
