package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.ObstetraSuscripcion;
import pe.edu.upc.entity.PreguntasGestante;
import pe.edu.upc.service.IPreguntasGestanteService;


@Named
@RequestScoped
public class PreguntasGestanteController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IPreguntasGestanteService uService;
	private PreguntasGestante preguntasGestante;
	List<PreguntasGestante> listaPreguntasGestante;
	
	@PostConstruct
	public void init() {
		this.listaPreguntasGestante = new ArrayList<PreguntasGestante>();
		this.preguntasGestante = new PreguntasGestante();
		//this.listar();
	}

	
	public String nuevoPreguntasGestante() {
		this.setPreguntasGestante(new PreguntasGestante());
		return "PreguntasGestante.xhtml";
	}
	
	public void insertar() {
		uService.insertar(preguntasGestante);
		limpiarPreguntasGestante();
	}
	
	public void listar() {
		listaPreguntasGestante = uService.listar();
	}
	
	public void limpiarPreguntasGestante() {
		this.init();
	}
	
	public void eliminar(PreguntasGestante preguntasGestante) {
		uService.eliminar(preguntasGestante.getIDGestante());
	}
	
	

	public PreguntasGestante getPreguntasGestante() {
		return preguntasGestante;
	}

	public void setPreguntasGestante(PreguntasGestante preguntasGestante) {
		this.preguntasGestante = preguntasGestante;
	}

	public List<PreguntasGestante> getListaPreguntasGestante() {
		return listaPreguntasGestante;
	}

	public void setListaPreguntasGestante(List<PreguntasGestante> listaPreguntasGestante) {
		this.listaPreguntasGestante = listaPreguntasGestante;
	}

	
	
}
