package com.emarra.EmarraShop.entities;

public enum Pagamento {
	
	CREDITO(1),
	DEBITO(2),
	PIX(3),
	DINHEIRO(4),
	BOLETO(5);
	
	private final Integer id;
	
	Pagamento(Integer id) {
		this.id = id;
	}
	
	public Integer getPagamento() {
		return id;
	}
	
	public static Pagamento getById(Integer id) {
		for (Pagamento tipo : values()) {
			if (tipo.id.equals(id))
				return tipo;
		}
		return Pagamento.CREDITO;
	}
}
