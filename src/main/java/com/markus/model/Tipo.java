package com.markus.model;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class Tipo extends Receita {

	private static final long serialVersionUID = 1L;
	private Long id_tp;
	private String nome;
	
	public Tipo() {
		
	}
	
	public Tipo(Long id, String descricao, Date vencimento, Long valor,
				Long id_tp, String nome) {
		super(id, descricao, vencimento, valor);
		this.id_tp = id_tp;
		this.nome = nome;
	}
	

	public Long getid_tp() {
		return id_tp;
	}

	public void setid_tp(Long id_tp) {
		this.id_tp = id_tp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
