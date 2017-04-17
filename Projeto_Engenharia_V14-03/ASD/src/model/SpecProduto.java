package model;

import java.util.Date;

public class SpecProduto {

	private String descricao;
	private String dataEstoque;
	private Double precoFinal;
	private Double precoCompra;
	private String fornecedor;

	public SpecProduto(String descricao, String dataEstoque, Double precoFinal,
			Double precoCompra, String fornecedor) {

		this.descricao = descricao;
		this.dataEstoque = dataEstoque;
		this.precoFinal = precoFinal;
		this.precoCompra = precoCompra;
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public String getDataEstoque() {
		return this.dataEstoque;
	}

	public Double getPreçoFinal() {
		return this.precoFinal;
	}

	public Double getPreçoCompra() {
		return this.precoCompra;
	}

	public String getFornecedor() {
		return this.fornecedor;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDataEstoque(String dataEstoque) {
		this.dataEstoque = dataEstoque;
	}

	public void setPrecoFinal(Double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
}
