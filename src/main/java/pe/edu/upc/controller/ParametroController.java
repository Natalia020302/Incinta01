package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Parametro;
import pe.edu.upc.entity.Unidad;

import pe.edu.upc.service.IParametroService;
import pe.edu.upc.service.IUnidadService;


@Named
@RequestScoped
public class ParametroController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IParametroService paraService;
	@Inject
	private IUnidadService unService;
	
	
	private Parametro parametro;
	private Unidad unidad;
	
	
	List<Parametro> listaParametros;
	List<Unidad> listaUnidades;
	
	
	
	@PostConstruct
	public void init() {
		this.listaParametros = new ArrayList<Parametro>();
		this.listaUnidades = new ArrayList<Unidad>();
		
		
		this.parametro = new Parametro();
		this.unidad = new Unidad();
		
		
		this.listar();
		this.listarUnidades();
	}

	public String nuevoParametro() {
		this.setParametro(new Parametro());
		return "Parametro.xhtml";
	} 
	
	public void insertar() {
		paraService.insertar(parametro);
		limpiarParametro();
	}
	
	public void listar() {
		listaParametros = paraService.listar();
	}
	
	public void listarUnidades() {
		listaUnidades=unService.listar();
	}
	
	
	
	
	public void limpiarParametro() {
		this.init();
	}
	
	public void eliminar(Parametro parametro) {
		paraService.eliminar(parametro.getIDParametro());
	}

	public IParametroService getParaService() {
		return paraService;
	}

	public void setParaService(IParametroService paraService) {
		this.paraService = paraService;
	}

	public IUnidadService getUnService() {
		return unService;
	}

	public void setUnService(IUnidadService unService) {
		this.unService = unService;
	}

	public Parametro getParametro() {
		return parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	public List<Parametro> getListaParametros() {
		return listaParametros;
	}

	public void setListaParametros(List<Parametro> listaParametros) {
		this.listaParametros = listaParametros;
	}

	public List<Unidad> getListaUnidades() {
		return listaUnidades;
	}

	public void setListaUnidades(List<Unidad> listaUnidades) {
		this.listaUnidades = listaUnidades;
	}


	


	
	
	
	
}