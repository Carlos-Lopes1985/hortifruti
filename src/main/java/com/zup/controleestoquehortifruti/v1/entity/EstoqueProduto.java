package com.zup.controleestoquehortifruti.v1.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class EstoqueProduto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private LocalDate data;
	private Integer tipoOperacao;
	private Integer qtde;
	
	private Produto produto;

	public EstoqueProduto(Integer id, LocalDate data, Integer tipoOperacao, Integer qtde, Produto produto) {
		super();
		this.id = id;
		this.data = data;
		this.tipoOperacao = tipoOperacao;
		this.qtde = qtde;
		this.produto = produto;
	}

	public EstoqueProduto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Integer getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(Integer tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
