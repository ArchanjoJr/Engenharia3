package model;

import java.util.Iterator;
import java.util.List;

import view.Observer;

import java.util.LinkedList;

import controller.Relatorio;
public class Estoque implements Subject {
	private List observers;
	private LinkedList produtos= new LinkedList();
	
	public void addProduto(Produto p){
		produtos.addFirst(p);
	}
	public void removerProduto(Produto p ){
		produtos.remove(p);
	}
	
	public Produto buscarProduto(Produto p){
		Iterator i = produtos.iterator();
		while(i.hasNext()){
			Produto pr = (Produto) i.next();
			if(pr.getNome() == p.getNome() || pr.getSpec().getDescricao() == p.getSpec().getDescricao()){
				return (Produto) pr;
			}else{
				System.out.println("Produto Não Encontrado !");
			}
		}
		return null;
		
	}
	public int getQtd(){
		return this.produtos.size();
	}
	public void removeObserver(Observer o){
		observers.remove(o);
	}
	public void registerObserver(Observer o){
		observers.add(o);
	}
	public Relatorio gerarRelatorio(Relatorio r,Produto p ){
		return r;
	}
}
