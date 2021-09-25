package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Unidad;
import pe.edu.upc.entity.Parametro;



import pe.edu.upc.service.IUnidadService;
import pe.edu.upc.service.IParametroService;




@Named
@RequestScoped
public class ParametroController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private IUnidadService uService;
	private IParametroService pService;
	
	
	private Unidad unidad;
	private Parametro parametro;
	
	
	List<Unidad> listaUnidades;
	List<Parametro> listaParametros;

	
	@PostConstruct
	public void init() {
		this.listaUnidades = new ArrayList<Unidad>();
		this.listaParametros = new ArrayList<Parametro>();

		
		this.parametro = new Parametro();
		this.unidad = new Unidad();


		this.listar();
		this.listarUnidades();

	}

	public String nuevoParametro() {
		this.setParametro(new Parametro());
		return "parametro.xhtml";
	}
	
	public void insertar() {
		pService.insertar(parametro);
		limpiarParametro();
		this.listar();
	}
	
	public void listar() {
		listaParametros = pService.listar();
	}
	
	public void listarUnidades() {
		listaUnidades = uService.listar();
	}
	
	
	public void limpiarParametro() {
		this.init();
	}
	
	public void eliminar(Parametro parametro) {
		pService.eliminar(parametro.getiDParametro());
	}

	public IUnidadService getuService() {
		return uService;
	}

	public void setuService(IUnidadService uService) {
		this.uService = uService;
	}

	public IParametroService getpService() {
		return pService;
	}

	public void setpService(IParametroService pService) {
		this.pService = pService;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	public Parametro getParametro() {
		return parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}

	public List<Unidad> getListaUnidades() {
		return listaUnidades;
	}

	public void setListaUnidades(List<Unidad> listaUnidades) {
		this.listaUnidades = listaUnidades;
	}

	public List<Parametro> getListaParametros() {
		return listaParametros;
	}

	public void setListaParametros(List<Parametro> listaParametros) {
		this.listaParametros = listaParametros;
	}

	
	
	
	
	
	

	

	
	
	
	
}