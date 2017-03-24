package model;
import java.util.Date;

public class SpecProduto {

private String descricao;
 private Date dataEstoque;
 private int precoFinal;
 private int precoCompra;
 private String fornecedor;
 
 public String getDescricao(){
	 return this.descricao;
 }
 public Date getDataEstoque(){
	 return this.dataEstoque;
 }
 public int getPreçoFinal(){
	 return this.precoFinal;
 }
 public int getPreçoCompra(){
	 return this.precoCompra;
 }
 public String getFornecedor(){
	 return this.fornecedor;
 }
 public void setDescricao(String descricao) {
		this.descricao = descricao;
}
public void setDataEstoque(Date dataEstoque) {
		this.dataEstoque = dataEstoque;
}
public void setPrecoFinal(int precoFinal) {
		this.precoFinal = precoFinal;
}
public void setPrecoCompra(int precoCompra) {
	this.precoCompra = precoCompra;
}
public void setFornecedor(String fornecedor) {
	this.fornecedor = fornecedor;
}
}
