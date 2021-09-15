package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.ObservacionValoracion;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IObservacionValoracionService;


@Named
@RequestScoped
public class ObservacionValoracionController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IObservacionValoracionService uService;
	private ObservacionValoracion observacionValoracion;
	List<ObservacionValoracion> listaObservacionValoracion;
	
	@PostConstruct
	public void init() {
		this.listaObservacionValoracion = new ArrayList<ObservacionValoracion>();
		this.observacionValoracion = new ObservacionValoracion();
		//this.listar();
		
		
		
	}
	

	public String nuevoObservacionValoracion() {
		this.setObservacionValoracion(new ObservacionValoracion());
		return "ObservacionValoracion.xhtml";
	}
	
	public void insertar() {
		uService.insertar(observacionValoracion);
		limpiarObservacionValoracion();
	}
	
	public void listar() {
		listaObservacionValoracion = uService.listar();
	}
	
	public void limpiarObservacionValoracion() {
		this.init();
	}
	
	public void eliminar(ObservacionValoracion observacionValoracion) {
		uService.eliminar(observacionValoracion.getID_Observacion());
	}
	
	
	
	
	
	public ObservacionValoracion getObservacionValoracion() {
		return observacionValoracion;
	}

	public void setObservacionValoracion(ObservacionValoracion observacionValoracion) {
		this.observacionValoracion = observacionValoracion;
	}

	public List<ObservacionValoracion> getListaObservacionValoracion() {
		return listaObservacionValoracion;
	}

	public void setListaObservacionValoracion(List<ObservacionValoracion> listaObservacionValoracion) {
		this.listaObservacionValoracion = listaObservacionValoracion;
	}
	
	
	
}
