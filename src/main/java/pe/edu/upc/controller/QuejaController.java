package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Queja;

import pe.edu.upc.service.IQuejaService;


@Named
@RequestScoped
public class QuejaController implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IQuejaService uService;
	
	private Queja queja;
	
	List<Queja> listaQueja;
	
	@PostConstruct
	public void init() {
		this.listaQueja = new ArrayList<Queja>();
		
		this.queja = new Queja();
		
		this.listar();
	}

	public String nuevoQueja() {
		this.setQueja(new Queja());
		return "Queja.xhtml";
	}
	
	public void insertar() {
		uService.insertar(queja);
		limpiarQueja();
	}
	public void listar() {
		listaQueja = uService.listar();
	}
	
	public void limpiarQueja() {
		this.init();
	}
	
	public void eliminar(Queja queja) {
		uService.eliminar(queja.getIdQueja());
	}

	
	public Queja getQueja() {
		return queja;
	}

	public void setQueja(Queja queja) {
		this.queja = queja;
	}

	public List<Queja> getListaQueja() {
		return listaQueja;
	}

	public void setListaQueja(List<Queja> listaQueja) {
		this.listaQueja = listaQueja;
	}

	
	
	
}