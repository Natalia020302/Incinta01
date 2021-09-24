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

	private static final long serialVersionUID = 1L;

	@Inject
	private ISuscripcionService uService;
	
	private Suscripcion suscripcion;
	
	
	List<Suscripcion> listasuscripcion;
	
	
	@PostConstruct
	public void init() {
		this.listasuscripcion = new ArrayList<Suscripcion>();
		
		this.suscripcion = new Suscripcion();
		
		this.listar();

	}

	public String nuevoObstetra() {
		this.setSuscripcion(new Suscripcion());
		return "Suscripcion.xhtml";
	}
	
	public void insertar() {
		uService.insertar(suscripcion);
		limpiarSuscripcion();
	}
	
	public void listar() {
		listasuscripcion = uService.listar();
	}
	
	
	public void limpiarSuscripcion() {
		this.init();
	}
	
	public void eliminar(Suscripcion suscripcion) {
		uService.eliminar(suscripcion.getIdsuscripcion());
	}
	
	/* GETTERS AND SETTERS */

	public ISuscripcionService getuService() {
		return uService;
	}

	public void setuService(ISuscripcionService uService) {
		this.uService = uService;
	}

	public Suscripcion getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}

	public List<Suscripcion> getListasuscripcion() {
		return listasuscripcion;
	}

	public void setListasuscripcion(List<Suscripcion> listasuscripcion) {
		this.listasuscripcion = listasuscripcion;
	}
	
}