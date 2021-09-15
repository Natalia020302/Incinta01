package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.ObstetraSuscripcion;
import pe.edu.upc.service.IObstetraSuscripcionService;


@Named
@RequestScoped
public class ObstetraSuscripcionController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IObstetraSuscripcionService uService;
	private ObstetraSuscripcion obstetraSuscripcion;
	List<ObstetraSuscripcion> listaObstetraSuscripcion;
	
	@PostConstruct
	public void init() {
		this.listaObstetraSuscripcion = new ArrayList<ObstetraSuscripcion>();
		this.obstetraSuscripcion = new ObstetraSuscripcion();
		//this.listar();
	}

	
	public String nuevoObstetraSuscripcion() {
		this.setObstetraSuscripcion(new ObstetraSuscripcion());
		return "ObstetraSuscripcion.xhtml";
	}
	
	public void insertar() {
		uService.insertar(obstetraSuscripcion);
		limpiarObstetraSuscripcion();
	}
	
	public void listar() {
		listaObstetraSuscripcion = uService.listar();
	}
	
	public void limpiarObstetraSuscripcion() {
		this.init();
	}
	
	public void eliminar(ObstetraSuscripcion obstetraSuscripcion) {
		uService.eliminar(obstetraSuscripcion.getID_Obstetra());
	}
	
	
	

	public ObstetraSuscripcion getObstetraSuscripcion() {
		return obstetraSuscripcion;
	}

	public void setObstetraSuscripcion(ObstetraSuscripcion obstetraSuscripcion) {
		this.obstetraSuscripcion = obstetraSuscripcion;
	}

	public List<ObstetraSuscripcion> getListaObstetraSuscripcion() {
		return listaObstetraSuscripcion;
	}

	public void setListaObstetraSuscripcion(List<ObstetraSuscripcion> listaObstetraSuscripcion) {
		this.listaObstetraSuscripcion = listaObstetraSuscripcion;
	}

}
