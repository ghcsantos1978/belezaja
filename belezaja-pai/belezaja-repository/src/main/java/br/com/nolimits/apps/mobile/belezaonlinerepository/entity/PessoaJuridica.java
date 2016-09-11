package br.com.nolimits.apps.mobile.belezaonlinerepository.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idPessoa")
public class PessoaJuridica extends Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4921700767427179742L;
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String telefone1;
	private String telefone2;
	private String telefoneCelularZap;

	
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getTelefoneCelularZap() {
		return telefoneCelularZap;
	}
	public void setTelefoneCelularZap(String telefoneCelularZap) {
		this.telefoneCelularZap = telefoneCelularZap;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	
}
