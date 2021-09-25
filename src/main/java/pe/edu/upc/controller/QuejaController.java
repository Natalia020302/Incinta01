package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Queja;
import pe.edu.upc.entity.Parametro;

import pe.edu.upc.service.IQuejaService;
import pe.edu.upc.service.IParametroService;

@Named
@RequestScoped
public class QuejaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IQuejaService qService;
	@Inject
	private IParametroService pService;
	
	
	private Queja queja;
	private Parametro parametro;
	
	List<Queja> listaQueja;
	List<Parametro> listaParametro;
	
	@PostConstruct
	public void init() {
		this.listaQueja = new ArrayList<Queja>();
		this.listaParametro = new ArrayList<Parametro>();
		
		this.queja = new Queja();
		this.parametro = new Parametro();
		
		this.listarQuejas();
		this.listarParametros();
	}

	public String nuevoQueja() {
		this.setQueja(new Queja());
		return "Queja.xhtml";
	}
	
	public void insertar() {
		qService.insertar(queja);
		limpiarQueja();
		this.listarQuejas();
	}
	public void listarQuejas() {
		listaQueja = qService.listar();
	}
	public void listarParametros() {
		listaParametro = pService.listar();
	}
	
	public void limpiarQueja() {
		this.init();
	}
	
	public void eliminar(Queja queja) {
		qService.eliminar(queja.getIdQueja());
	}

	public IQuejaService getqService() {
		return qService;
	}

	public void setqService(IQuejaService qService) {
		this.qService = qService;
	}

	public IParametroService getpService() {
		return pService;
	}

	public void setpService(IParametroService pService) {
		this.pService = pService;
	}

	public Queja getQueja() {
		return queja;
	}

	public void setQueja(Queja queja) {
		this.queja = queja;
	}

	public Parametro getParametro() {
		return parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}

	public List<Queja> getListaQueja() {
		return listaQueja;
	}

	public void setListaQueja(List<Queja> listaQueja) {
		this.listaQueja = listaQueja;
	}

	public List<Parametro> getListaParametro() {
		return listaParametro;
	}

	public void setListaParametro(List<Parametro> listaParametro) {
		this.listaParametro = listaParametro;
	}

	
}