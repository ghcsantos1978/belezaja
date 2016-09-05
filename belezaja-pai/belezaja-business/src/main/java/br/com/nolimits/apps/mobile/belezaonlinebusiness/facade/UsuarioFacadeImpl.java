package br.com.nolimits.apps.mobile.belezaonlinebusiness.facade;

import java.io.Serializable;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.nolimits.apps.mobile.belezaonlinebusiness.service.UsuarioService;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.Usuario;

@Transactional(rollbackOn=Exception.class)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UsuarioFacadeImpl implements UsuarioFacade,Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5181302012214434178L;
	@Inject
	private UsuarioService usuarioService;
	
	@Override
	public void salvar(Usuario usuario) {
		usuarioService.salvar(usuario);
	}

}
