package br.com.nolimits.apps.mobile.belezaonlinerepository.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idPessoa")
public class PessoaFisica extends Pessoa implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8987382443040837023L;
	private String cpf;
	private String telefoneCelular;
	@Enumerated(EnumType.ORDINAL)
	
	
	private TipoPessoaFisicaEnum tipoPessoaFisica;
	private String telefoneResidencial;

	
	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public TipoPessoaFisicaEnum getTipoPessoaFisica() {
		return tipoPessoaFisica;
	}

	public void setTipoPessoaFisica(TipoPessoaFisicaEnum tipoPessoaFisica) {
		this.tipoPessoaFisica = tipoPessoaFisica;
	}
	
	
}
