package com.zup.controleestoquehortifruti.v1.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Grupo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	private String nome;
	
	@OneToMany(mappedBy = "grupo",cascade = CascadeType.ALL)
	private List<Produto>produtos = new ArrayList<Produto>();

	public Grupo(Integer codigo, String nome, List<Produto> produtos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.produtos = produtos;
	}

	public Grupo(Integer codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.nome = descricao;
	}

	public Grupo() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Grupo [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return nome;
	}

	public void setDescricao(String descricao) {
		this.nome = descricao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
