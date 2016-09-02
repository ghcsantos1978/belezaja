package br.com.nolimits.apps.mobile.belezaonlineweb.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.nolimits.apps.mobile.belezaonlinebusiness.entity.Usuario;
import br.com.nolimits.apps.mobile.belezaonlinebusiness.facade.LoginFacade;

@Named("loginMB")
@SessionScoped
public class LoginMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6672962591934509025L;

	private Usuario usuario;

	@Inject
	private LoginFacade loginFacade;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@PostConstruct
	public void inicializar(){
		usuario = new Usuario();
	}
	
	public String logar(){
		return "/paginas/menu.xhtml";
	}
	
	public String cadastro(){
		return "paginas/cadastro.xhtml";
	}
	
}
