package com.zup.controleestoquehortifruti.v1.enuns;


public enum Categoria {
	
	VERDURAS(1,"Verduras"),
	FRUTAS(2,"Frutas"),
	LEGUMES(3,"Legumes");
	
	private int cod;
	private String descricao;
	
	private Categoria(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public static Categoria toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (Categoria x : Categoria.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
