package br.com.nolimits.apps.mobile.belezaonlinebusiness.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.nolimits.apps.mobile.belezaonlinerepository.dao.GenericDAO;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.Usuario;

public class UsuarioServiceImpl implements UsuarioService,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 819886496367368542L;
	
	@Inject
	private GenericDAO<Usuario> dao;
	
	@Override
	public void salvar(Usuario usuario) {
		dao.setClassePersistente(Usuario.class);
		dao.salvar(usuario);
	}

}
