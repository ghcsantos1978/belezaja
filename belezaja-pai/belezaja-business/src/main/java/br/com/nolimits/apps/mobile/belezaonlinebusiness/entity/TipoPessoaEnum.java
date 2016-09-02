package br.com.nolimits.apps.mobile.belezaonlinebusiness.entity;

public enum TipoPessoaEnum {

	FISICA(1), JURIDICA(2);
	
	private final int tipo;
	
	TipoPessoaEnum(int tipo){
		this.tipo = tipo;
	}
	public int getTipo(){
		return tipo;
	}
	
}
