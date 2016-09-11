package br.com.nolimits.apps.mobile.belezaonlineweb.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.component.UIOutput;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.nolimits.apps.mobile.belezaonlinebusiness.facade.PessoaFacade;
import br.com.nolimits.apps.mobile.belezaonlinebusiness.facade.UsuarioFacade;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.PessoaFisica;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.PessoaJuridica;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.TipoPessoaFisicaEnum;
import br.com.nolimits.apps.mobile.belezaonlinerepository.entity.Usuario;

@Named("cadastroPessoaUsuarioMB")
@ViewScoped
public class CadastroPessoaUsuarioMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3409068677880983846L;
	
	private PessoaFisica pessoaFisica;
	private PessoaJuridica pessoaJuridica;
	private String tipoPessoa;
	
	@Inject
	private UsuarioFacade usuarioFacade;
	
	@Inject
	private PessoaFacade pessoaFacade;

	@PostConstruct
	public void inicializar(){
		pessoaFisica = new PessoaFisica();
		pessoaJuridica = new PessoaJuridica();
		pessoaFisica.setUsuario(new Usuario());
		pessoaJuridica.setUsuario(new Usuario());
	}
	
	
	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	
	public String salvar(){
		
		if ("F".equalsIgnoreCase(tipoPessoa) || "P".equalsIgnoreCase(tipoPessoa) ){
			usuarioFacade.salvar(pessoaFisica.getUsuario());
			pessoaFisica.setTipoPessoaFisica(TipoPessoaFisicaEnum.valueOf("F".equalsIgnoreCase(tipoPessoa)?TipoPessoaFisicaEnum.CLIENTE.name():TipoPessoaFisicaEnum.PRESTADOR.name()));
			pessoaFacade.salvarPessoaFisica(pessoaFisica);
		}
		else{
			usuarioFacade.salvar(pessoaJuridica.getUsuario());
			pessoaFacade.salvarPessoaJuridica(pessoaJuridica);
		}
		return "/login.xhmtl";
	}
	
	public void selecionaTipoUsuario(AjaxBehaviorEvent vce){  
		  String valor= (String) ((UIOutput) vce.getSource()).getValue();
		  this.tipoPessoa = valor;
	}
	
}
