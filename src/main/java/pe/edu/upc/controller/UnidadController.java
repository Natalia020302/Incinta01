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

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IUnidadService uService;
	private Unidad unidad;
	List<Unidad> listaUnidad;
	
	@PostConstruct
	public void init() {
		this.listaUnidad = new ArrayList<Unidad>();
		this.unidad = new Unidad();
		this.listar();
	}

	public String nuevoUnidad() {
		this.setUnidad(new Unidad());
		return "usuario.xhtml";
	}
	
	public void insertar() {
		uService.insertar(unidad);
		limpiarUnidad();
	}
	
	public void listar() {
		listaUnidad = uService.listar();
	}
	
	public void limpiarUnidad() {
		this.init();
	}
	
	public void eliminar(Unidad unidad) {
		uService.eliminar(unidad.getIDUnidad());
	}
	
	
	
	

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	public List<Unidad> getListaUnidad() {
		return listaUnidad;
	}

	public void setListaUnidads(List<Unidad> listaUnidad) {
		this.listaUnidad = listaUnidad;
	}

	public IUnidadService getuService() {
		return uService;
	}

	public void setuService(IUnidadService uService) {
		this.uService = uService;
	}

	public void setListaUnidad(List<Unidad> listaUnidad) {
		this.listaUnidad = listaUnidad;
	}
	

	
	
}