package model;

import java.util.List;
import java.util.LinkedList;
public class Estoque {
	private List observers;
	private LinkedList produtos= new LinkedList();
	
	public void addProduto(Produto p){
		produtos.addFirst(p);
	}
	public void removerProduto(Produto p ){
		produtos.remove(p);
	}
	
	public void buscarProduto(){
		//codigo de buscar produto
	}
	public int getQtd(){
		return this.produtos.size();
	}
}
