package com.zup.controleestoquehortifruti.v1.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class Lote implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer numLote;
	private Integer qtdeLote;
	private LocalDate dataEntrada;
	private LocalDate dataValidade;
	
	private Produto produto;
	
	public Lote(Integer id, Integer numLote, Integer qtdeLote, LocalDate dataEntrada, LocalDate dataValidade) {
		super();
		this.id = id;
		this.numLote = numLote;
		this.qtdeLote = qtdeLote;
		this.dataEntrada = dataEntrada;
		this.dataValidade = dataValidade;
	}

	public Lote() {
		super();
	}

	public Lote(Integer id, Integer numLote, Integer qtdeLote, LocalDate dataEntrada, LocalDate dataValidade,
			Produto produto) {
		super();
		this.id = id;
		this.numLote = numLote;
		this.qtdeLote = qtdeLote;
		this.dataEntrada = dataEntrada;
		this.dataValidade = dataValidade;
		this.produto = produto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumLote() {
		return numLote;
	}

	public void setNumLote(Integer numLote) {
		this.numLote = numLote;
	}

	public Integer getQtdeLote() {
		return qtdeLote;
	}

	public void setQtdeLote(Integer qtdeLote) {
		this.qtdeLote = qtdeLote;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
}
