package br.com.nolimits.apps.mobile.belezaonlinebusiness.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.nolimits.apps.mobile.belezaonlinerepository.dao.GenericDAO;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.PessoaFisica;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.PessoaJuridica;

public class PessoaServiceImpl implements PessoaService,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4595867564995201694L;

	@Inject
	private GenericDAO<PessoaFisica> daoPessoaFisica;

	@Inject
	private GenericDAO<PessoaJuridica> daoPessoaJuridica;

	
	@Override
	public void salvarPessoaFisica(PessoaFisica pessoa) {
		daoPessoaFisica.setClassePersistente(PessoaFisica.class);
		daoPessoaFisica.salvar(pessoa);
	}

	@Override
	public void salvarPessoaJuridica(PessoaJuridica pessoa) {
		daoPessoaFisica.setClassePersistente(PessoaJuridica.class);
		daoPessoaJuridica.salvar(pessoa);
	}
	
	
}
