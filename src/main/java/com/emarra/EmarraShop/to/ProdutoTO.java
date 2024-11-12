package com.emarra.EmarraShop.to;

import com.emarra.EmarraShop.entities.Produto;

public class ProdutoTO {
	
	private Long id;
	private String name;
	private Double price;
	private Integer qtd_estoque;
	
	public ProdutoTO() {}

	public ProdutoTO(Long id, String name, Double price, Integer qtd_estoque) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qtd_estoque = qtd_estoque;
	}
	
	public ProdutoTO(Produto product) {
		id = product.getId();
		name = product.getName();
		price = product.getPrice();
		qtd_estoque = product.getQtd_estoque();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQtd_estoque() {
		return qtd_estoque;
	}
	
}
