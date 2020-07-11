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

@Entity
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "grupo_id")
	private Grupo grupo;
	
	@OneToMany(mappedBy = "produto",cascade = CascadeType.ALL)
	private List<Estoque>estoques = new ArrayList<Estoque>();
	
	public Produto() {
		super();
	}
	public Produto(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Produto(Integer id, String nome, Grupo grupo) {
		super();
		this.id = id;
		this.nome = nome;
		this.grupo = grupo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public List<Estoque> getEstoques() {
		return estoques;
	}
	public void setEstoques(List<Estoque> estoques) {
		this.estoques = estoques;
	}
}
