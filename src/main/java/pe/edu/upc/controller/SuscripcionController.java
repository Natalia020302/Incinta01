package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Suscripcion;
import pe.edu.upc.service.ISuscripcionService;


@Named
@RequestScoped
public class SuscripcionController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private ISuscripcionService uService;
	private Suscripcion suscripcion;
	List<Suscripcion> listaSuscripcion;
	
	@PostConstruct
	public void init() {
		this.listaSuscripcion = new ArrayList<Suscripcion>();
		this.suscripcion = new Suscripcion();
		this.listar();
	}

	public String nuevoSuscripcion() {
		this.setSuscripcion(new Suscripcion());
		return "Suscripcion.xhtml";
	}
	
	public void insertar() {
		uService.insertar(suscripcion);
		limpiarSuscripcion();
	}
	
	public void listar() {
		listaSuscripcion = uService.listar();
	}
	
	public void limpiarSuscripcion() {
		this.init();
	}
	
	public void eliminar(Suscripcion suscripcion) {
		uService.eliminar(suscripcion.getIDSuscripcion());
	}

	public Suscripcion getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}

	public List<Suscripcion> getListaSuscripcion() {
		return listaSuscripcion;
	}

	public void setListaSuscripcion(List<Suscripcion> listaSuscripcion) {
		this.listaSuscripcion = listaSuscripcion;
	}
	
	
}