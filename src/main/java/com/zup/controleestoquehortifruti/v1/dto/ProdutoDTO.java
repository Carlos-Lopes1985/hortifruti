package com.zup.controleestoquehortifruti.v1.dto;

import java.time.LocalDate;

public class ProdutoDTO {

	private String nome;
	private String categoria;
	private LocalDate dataValidade;
	private Double quantidadeEstoque;
	private String messagem;
	
	public ProdutoDTO(String nome, String categoria, LocalDate dataValidade, Double quantidadeEstoque,
			String messagem) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.dataValidade = dataValidade;
		this.quantidadeEstoque = quantidadeEstoque;
		this.messagem = messagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public LocalDate getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
	public Double getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(Double quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public String getMessagem() {
		return messagem;
	}
	public void setMessagem(String messagem) {
		this.messagem = messagem;
	}
	
	
	
}
