package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

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
	
	
	List<Eventos> listaEventos;
	List<Usuario> listaUsuarios;

	
	@PostConstruct
	public void init() {
		this.listaEventos = new ArrayList<Eventos>();
		this.listaUsuarios = new ArrayList<Usuario>();

		
		this.eventos = new Eventos();
		this.usuario = new Usuario();

		this.listareventos();
		this.listarusuario();

	}

	public String nuevoEventos() {
		this.setEventos(new Eventos());
		return "eventos.xhtml";
	}
	
	public void insertar() {
		rService.insertar(eventos);
		limpiarEventos();
		this.listareventos();
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

	public IEventosService getrService() {
		return rService;
	}

	public void setrService(IEventosService rService) {
		this.rService = rService;
	}

	public IUsuarioService getuService() {
		return uService;
	}

	public void setuService(IUsuarioService uService) {
		this.uService = uService;
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