package com.financa.model;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class Tipo extends Receita {

	private static final long serialVersionUID = 1L;
	private Long idt;
	private String nome;
	
	public Tipo() {
		
	}
	
	public Tipo(Long id, String descricao, Date vencimento, Long valor,
				Long idt, String nome) {
		super(id, descricao, vencimento, valor);
		this.idt = idt;
		this.nome = nome;
	}
	

	public Long getIdt() {
		return idt;
	}

	public void setId(Long idt) {
		this.idt = idt;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
