package com.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	
	private String categoria;
	
	@NotNull
	private boolean higiene;
	
	@NotNull
	private boolean cosmeticos;
	
	@NotNull
	private boolean bula;
	
	
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto>produto;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return categoria;
	}

	public void setTipo(String categoria) {
		this.categoria = categoria;
	}

	public boolean isHigiene() {
		return higiene;
	}

	public void setHigiene(boolean higiene) {
		this.higiene = higiene;
	}

	public boolean isCosmeticos() {
		return cosmeticos;
	}

	public void setCosmeticos(boolean cosmeticos) {
		this.cosmeticos = cosmeticos;
	}

	public boolean isBula() {
		return bula;
	}

	public void setBula(boolean bula) {
		this.bula = bula;
	}


	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	

	
}