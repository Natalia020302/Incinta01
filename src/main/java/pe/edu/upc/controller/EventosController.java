package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Eventos;
import pe.edu.upc.service.IEventosService;


@Named
@RequestScoped
public class EventosController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IEventosService uService;
	private Eventos eventos;
	List<Eventos> listaEventoss;
	
	@PostConstruct
	public void init() {
		this.listaEventoss = new ArrayList<Eventos>();
		this.eventos = new Eventos();
		this.listar();
	}

	public String nuevoEventos() {
		this.setEventos(new Eventos());
		return "eventos.xhtml";
	}
	
	public void insertar() {
		uService.insertar(eventos);
		limpiarEventos();
	}
	
	public void listar() {
		listaEventoss = uService.listar();
	}
	
	public void limpiarEventos() {
		this.init();
	}
	
	public void eliminar(Eventos eventos) {
		uService.eliminar(eventos.getID_Evento());
	}
	
	
	
	

	public Eventos getEventos() {
		return eventos;
	}

	public void setEventos(Eventos eventos) {
		this.eventos = eventos;
	}

	public List<Eventos> getListaEventoss() {
		return listaEventoss;
	}

	public void setListaEventoss(List<Eventos> listaEventoss) {
		this.listaEventoss = listaEventoss;
	}
	

	
	
}