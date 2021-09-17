package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Preguntas_Gestante;
import pe.edu.upc.service.IPreguntas_GestanteService;


@Named
@RequestScoped
public class Preguntas_GestanteController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IPreguntas_GestanteService uService;
	private Preguntas_Gestante preguntas_Gestante;
	List<Preguntas_Gestante> listaPreguntas_Gestante;
	
	@PostConstruct
	public void init() {
		this.listaPreguntas_Gestante = new ArrayList<Preguntas_Gestante>();
		this.preguntas_Gestante = new Preguntas_Gestante();
		this.listar();
	}

	public String nuevoPreguntas_Gestante() {
		this.setPreguntas_Gestante(new Preguntas_Gestante());
		return "Preguntas_Gestante.xhtml";
	}
	
	public void insertar() {
		uService.insertar(preguntas_Gestante);
		limpiarPreguntas_Gestante();
	}
	
	public void listar() {
		listaPreguntas_Gestante = uService.listar();
	}
	
	public void limpiarPreguntas_Gestante() {
		this.init();
	}
	
	public void eliminar(Preguntas_Gestante preguntas_Gestante) {
		uService.eliminar(preguntas_Gestante.getIDPregunta());
	}

	public IPreguntas_GestanteService getuService() {
		return uService;
	}

	public void setuService(IPreguntas_GestanteService uService) {
		this.uService = uService;
	}

	public Preguntas_Gestante getPreguntas_Gestante() {
		return preguntas_Gestante;
	}

	public void setPreguntas_Gestante(Preguntas_Gestante preguntas_Gestante) {
		this.preguntas_Gestante = preguntas_Gestante;
	}

	public List<Preguntas_Gestante> getListaPreguntas_Gestante() {
		return listaPreguntas_Gestante;
	}

	public void setListaPreguntas_Gestante(List<Preguntas_Gestante> listaPreguntas_Gestante) {
		this.listaPreguntas_Gestante = listaPreguntas_Gestante;
	}
	
	
	
}