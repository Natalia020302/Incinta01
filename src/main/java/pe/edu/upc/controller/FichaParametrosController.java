package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.FichaParametros;


import pe.edu.upc.service.IFichaParametrosService;


@Named
@RequestScoped
public class FichaParametrosController implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IFichaParametrosService uService;
	
	private FichaParametros fichaParametros;
	
	List<FichaParametros> listaFichaParametros;
	
	
	
	@PostConstruct
	public void init() {
		this.listaFichaParametros = new ArrayList<FichaParametros>();
		
		
		this.fichaParametros = new FichaParametros();
		
		
		this.listar();
	}

	public String nuevoFichaParametros() {
		this.setFichaParametros(new FichaParametros());
		return "FichaParametros.xhtml";
	}
	
	public void insertar() {
		uService.insertar(fichaParametros);
		limpiarFichaParametros();
	}
	
	public void listar() {
		listaFichaParametros = uService.listar();
	}
	
	
	public void limpiarFichaParametros() {
		this.init();
	}
	
	public void eliminar(FichaParametros fichaParametros) {
		uService.eliminar(fichaParametros.getIdFichaParametro());
	}



	public FichaParametros getFichaParametros() {
		return fichaParametros;
	}

	public void setFichaParametros(FichaParametros fichaParametros) {
		this.fichaParametros = fichaParametros;
	}

	public List<FichaParametros> getListaFichaParametros() {
		return listaFichaParametros;
	}

	public void setListaFichaParametros(List<FichaParametros> listaFichaParametros) {
		this.listaFichaParametros = listaFichaParametros;
	}

}