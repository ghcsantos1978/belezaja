package br.com.nolimits.apps.mobile.belezaonlinebusiness.facade;

import java.io.Serializable;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.nolimits.apps.mobile.belezaonlinebusiness.service.PessoaService;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.PessoaFisica;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.PessoaJuridica;

@Transactional(rollbackOn=Exception.class)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class PessoaFacadeImpl implements PessoaFacade,Serializable {

	private static final long serialVersionUID = -3695377515876844986L;

	@Inject
	private PessoaService pessoaService;
	
	@Override
	public void salvarPessoaFisica(PessoaFisica pessoa) {
		pessoaService.salvarPessoaFisica(pessoa);
	}

	@Override
	public void salvarPessoaJuridica(PessoaJuridica pessoa) {
		pessoaService.salvarPessoaJuridica(pessoa);
	}

}
