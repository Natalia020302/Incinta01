package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;



import pe.edu.upc.entity.Eventos;
import pe.edu.upc.entity.Usuario;


import pe.edu.upc.service.IEventosService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class EventosController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEventosService rService;
	
	@Inject
	private IUsuarioService uService;

	private Eventos eventos;
	private Usuario usuario;
	
	
	private Eventos eventoSeleccionado;

	
	
	List<Eventos> listaEventos;
	List<Usuario> listaUsuarios;

	
	@PostConstruct
	public void init() {
		this.listaEventos = new ArrayList<Eventos>();
		this.listaUsuarios = new ArrayList<Usuario>();

		
		this.eventos = new Eventos();
		this.usuario = new Usuario();
		this.eventoSeleccionado = new Eventos();

		this.listareventos();
		this.listarusuario();

	}

	public String nuevoEventos() {
		this.setEventos(new Eventos());
		return "insertEvento.xhtml";
	}
	
	
	
	
	
	
	public void insertar() {
		rService.insertar(eventos);
		limpiarEventos();
	}
	
	
	public String Atrapar(Eventos eventos) {
		this.setEventoSeleccionado(eventos);
		return "updateEvento.xhtml";
	}
	
	@Transactional
	public void updatec(){
		rService.update(this.getEventoSeleccionado());
	}
	
	
	
	
	
	
	public void listareventos() {
		listaEventos = rService.listar();
	}
	
	
	public void listarusuario() {
		listaUsuarios = uService.listar();
	}
	
	public void limpiarEventos() {
		this.init();
	}
	
	public void eliminar(Eventos eventos) {
		rService.eliminar(eventos.getiDEvento());
		this.listareventos();
	}
	
	
	
	
	

	public Eventos getEventos() {
		return eventos;
	}

	public void setEventos(Eventos eventos) {
		this.eventos = eventos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Eventos getEventoSeleccionado() {
		return eventoSeleccionado;
	}

	public void setEventoSeleccionado(Eventos eventoSeleccionado) {
		this.eventoSeleccionado = eventoSeleccionado;
	}

	public List<Eventos> getListaEventos() {
		return listaEventos;
	}

	public void setListaEventos(List<Eventos> listaEventos) {
		this.listaEventos = listaEventos;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	
	
	
	
	
	
	

	

	
	
	
	


	
	
}