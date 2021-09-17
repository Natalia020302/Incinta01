package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Tipo_identificacion;
import pe.edu.upc.service.ITipo_identificacionService;


@Named
@RequestScoped
public class Tipo_identificacionController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private ITipo_identificacionService uService;
	private Tipo_identificacion tipo_identificacion;
	List<Tipo_identificacion> listaTipo_identificacion;
	
	@PostConstruct
	public void init() {
		this.listaTipo_identificacion = new ArrayList<Tipo_identificacion>();
		this.tipo_identificacion = new Tipo_identificacion();
		this.listar();
	}

	public String nuevoTipo_identificacion() {
		this.setTipo_identificacion(new Tipo_identificacion());
		return "Tipo_identificacion.xhtml";
	}
	
	public void insertar() {
		uService.insertar(tipo_identificacion);
		limpiarTipo_identificacion();
	}
	
	public void listar() {
		listaTipo_identificacion = uService.listar();
	}
	
	public void limpiarTipo_identificacion() {
		this.init();
	}
	
	public void eliminar(Tipo_identificacion tipo_identificacion) {
		uService.eliminar(tipo_identificacion.getID_TipoIdentificacion());
	}

	public ITipo_identificacionService getuService() {
		return uService;
	}

	public void setuService(ITipo_identificacionService uService) {
		this.uService = uService;
	}

	public Tipo_identificacion getTipo_identificacion() {
		return tipo_identificacion;
	}

	public void setTipo_identificacion(Tipo_identificacion tipo_identificacion) {
		this.tipo_identificacion = tipo_identificacion;
	}

	public List<Tipo_identificacion> getListaTipo_identificacion() {
		return listaTipo_identificacion;
	}

	public void setListaTipo_identificacion(List<Tipo_identificacion> listaTipo_identificacion) {
		this.listaTipo_identificacion = listaTipo_identificacion;
	}
	
	
	
	


}