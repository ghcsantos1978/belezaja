package br.com.nolimits.apps.mobile.belezaonlinerepository.entity;

public enum TipoPessoaFisicaEnum {

	CLIENTE(1),
	PRESTADOR(2);
	
	private int tipo;
	
	TipoPessoaFisicaEnum(int valor){
		this.tipo = valor;
	}
	
	public int getTipo(){
		return tipo;
	}
	
}
