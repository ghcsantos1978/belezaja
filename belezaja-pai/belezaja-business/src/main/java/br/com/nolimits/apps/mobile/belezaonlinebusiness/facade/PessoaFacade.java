package br.com.nolimits.apps.mobile.belezaonlinebusiness.facade;

import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.PessoaFisica;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.PessoaJuridica;

public interface PessoaFacade {

	public void salvarPessoaFisica(PessoaFisica pessoa);

	public void salvarPessoaJuridica(PessoaJuridica pessoa);

	
	
}
