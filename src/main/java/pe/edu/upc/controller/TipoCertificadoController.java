package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.TipoCertificado;

import pe.edu.upc.service.ITipoCertificadoService;


@Named
@RequestScoped
public class TipoCertificadoController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ITipoCertificadoService uService;

	private TipoCertificado tipocertificado;
	
	List<TipoCertificado> listatipocertificado;
	
	
	@PostConstruct
	public void init() {
		this.listatipocertificado = new ArrayList<TipoCertificado>();
		
		this.tipocertificado = new TipoCertificado();
		
		this.listar();
		
	}

	public String nuevoObstetra() {
		this.setTipocertificado(new TipoCertificado());
		return "TipoCertificado.xhtml";
	}
	
	public void insertar() {
		uService.insertar(tipocertificado);
		limpiarTipoCertificado();
	}
	
	public void listar() {
		listatipocertificado = uService.listar();
	}
	
	public void limpiarTipoCertificado() {
		this.init();
	}
	
	public void eliminar(TipoCertificado tipocertificado) {
		uService.eliminar(tipocertificado.getIdcertificado());
	} /* GETTERS AND SETTERS */

	public ITipoCertificadoService getuService() {
		return uService;
	}

	public void setuService(ITipoCertificadoService uService) {
		this.uService = uService;
	}

	public TipoCertificado getTipocertificado() {
		return tipocertificado;
	}

	public void setTipocertificado(TipoCertificado tipocertificado) {
		this.tipocertificado = tipocertificado;
	}

	public List<TipoCertificado> getListatipocertificado() {
		return listatipocertificado;
	}

	public void setListatipocertificado(List<TipoCertificado> listatipocertificado) {
		this.listatipocertificado = listatipocertificado;
	}	
	
}