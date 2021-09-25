package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Unidad;

import pe.edu.upc.service.IUnidadService;

@Named
@RequestScoped
public class UnidadController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private IUnidadService uService;
	private Unidad unidad;
	List<Unidad> listaUnidades;

	
	@PostConstruct
	public void init() {
		this.listaUnidades = new ArrayList<Unidad>();
		
		this.unidad = new Unidad();

		this.listar();

	}

	public String nuevoUnidad() {
		this.setUnidad(new Unidad());
		return "unidad.xhtml";
	}
	
	public void insertar() {
		uService.insertar(unidad);
		limpiarUnidad();
		this.listar();
	}
	
	public void listar() {
		listaUnidades = uService.listar();
	}
	
	
	public void limpiarUnidad() {
		this.init();
	}
	
	public void eliminar(Unidad unidad) {
		uService.eliminar(unidad.getiDUnidad());
	}

	public IUnidadService getuService() {
		return uService;
	}

	public void setuService(IUnidadService uService) {
		this.uService = uService;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	public List<Unidad> getListaUnidades() {
		return listaUnidades;
	}

	public void setListaUnidades(List<Unidad> listaUnidades) {
		this.listaUnidades = listaUnidades;
	}
	
	
}