package com.zup.controleestoquehortifruti.v1.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.lang.NonNull;

@Entity
public class Estoque implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "unidade_id")
	@NonNull
	private UnidadeMedida uMedidas;
	
	@ManyToOne
	@JoinColumn(name = "lote_id")
	@NonNull
	private Lote lote;
	
	@OneToMany(mappedBy = "estoque",cascade = CascadeType.ALL)
	private List<Saida>saidas = new ArrayList<Saida>();
	
	public Estoque() {
		super();
	}

	public Estoque(Integer id, Integer quantidade, Produto produto, UnidadeMedida uMedidas,Lote lote) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.produto = produto;
		this.uMedidas = uMedidas;
		this.lote = lote;
	}

	public Estoque(Integer id, Integer quantidade) {
		super();
		this.id = id;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estoque [id=");
		builder.append(id);
		builder.append(", quantidade=");
		builder.append(quantidade);
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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public UnidadeMedida getuMedidas() {
		return uMedidas;
	}

	public void setuMedidas(UnidadeMedida uMedidas) {
		this.uMedidas = uMedidas;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public List<Saida> getSaidas() {
		return saidas;
	}

	public void setSaidas(List<Saida> saidas) {
		this.saidas = saidas;
	}

}
