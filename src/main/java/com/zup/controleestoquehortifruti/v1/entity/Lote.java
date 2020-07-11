package com.zup.controleestoquehortifruti.v1.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lote implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer quantidade;
	private LocalDate dataValidade;
	private LocalDate dataEntrada;
	
	@OneToMany(mappedBy = "lote",cascade = CascadeType.ALL)
	private List<Estoque> estoque = new ArrayList<Estoque>();

	public Lote() {
		super();
	}

	public Lote(Integer id, Integer quantidade, LocalDate dataValidade, LocalDate dataEntrada) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.dataValidade = dataValidade;
		this.dataEntrada = dataEntrada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lote [id=");
		builder.append(id);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append(", dataValidade=");
		builder.append(dataValidade);
		builder.append(", dataEntrada=");
		builder.append(dataEntrada);
		builder.append("]");
		return builder.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
}
