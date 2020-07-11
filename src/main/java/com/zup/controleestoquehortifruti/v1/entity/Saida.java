package com.zup.controleestoquehortifruti.v1.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Saida implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer quantidade;
	private LocalDate dataSaida;
	
	@ManyToOne
	@JoinColumn(name = "estoque_id")
	private Estoque estoque;
	
	public Saida() {
		super();
	}
	
	
	public Saida(Integer id, Integer quantidade, LocalDate dataSaida, Estoque estoque) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.dataSaida = dataSaida;
		this.estoque = estoque;
	}


	public Saida(Integer id, Integer quantidade, LocalDate dataSaida) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.dataSaida = dataSaida;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Saida [id=");
		builder.append(id);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append(", dataSaida=");
		builder.append(dataSaida);
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
	public LocalDate getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
}
