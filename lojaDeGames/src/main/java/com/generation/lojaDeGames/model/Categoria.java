package com.generation.lojaDeGames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 3, max = 100)
	private String tipoJogo;
	
	@NotNull
	@Size(min = 3, max = 50)
	private String console;

	@Size(min = 5, max = 500)
	private String descricao;

	@NotNull
	@Positive
	private BigDecimal preco;

	
public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getTipoJogo() {
	return tipoJogo;
}

public void setTipoJogo(String tipoJogo) {
	this.tipoJogo = tipoJogo;
}

public String getConsole() {
	return console;
}

public void setConsole(String console) {
	this.console = console;
}

public String getAcessorios() {
	return descricao;
}

public void setAcessorios(String acessorios) {
	this.descricao = acessorios;
}

public BigDecimal getPreco() {
	return preco;
}

public void setPreco(BigDecimal preco) {
	this.preco = preco;
}

	
}
