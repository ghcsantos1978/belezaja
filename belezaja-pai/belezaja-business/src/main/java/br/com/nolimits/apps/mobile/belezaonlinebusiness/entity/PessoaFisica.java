package br.com.nolimits.apps.mobile.belezaonlinebusiness.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class PessoaFisica extends Pessoa {

	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Enumerated(EnumType.ORDINAL)
	private TipoPessoaFisicaEnum tipoPessoaFisica;
	
	
}
