package br.com.nolimits.apps.mobile.belezaonlinebusiness.service;

import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.PessoaFisica;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.PessoaJuridica;

public interface PessoaService {

	public void salvarPessoaFisica(PessoaFisica pessoa);

	public void salvarPessoaJuridica(PessoaJuridica pessoa);
	
}
