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

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IEventosService uService;
	@Inject
	private IUsuarioService usuService;
	
	
	private Eventos eventos;
	private Usuario usuario;
	
	
	List<Eventos> listaEventoss;
	List<Usuario> listaUsuario;
	
	@PostConstruct
	public void init() {
		this.listaEventoss = new ArrayList<Eventos>();
		this.listaUsuario = new ArrayList<Usuario>();
		
		this.eventos = new Eventos();
		this.usuario = new Usuario();
		
		
		this.listar();
		this.listarUsuario();
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
	
	public void listarUsuario() {
		listaUsuario = usuService.listar();
	}
	
	public void limpiarEventos() {
		this.init();
	}
	
	public void eliminar(Eventos eventos) {
		uService.eliminar(eventos.getID_Evento());
	}

	public IEventosService getuService() {
		return uService;
	}

	public void setuService(IEventosService uService) {
		this.uService = uService;
	}

	public IUsuarioService getUsuService() {
		return usuService;
	}

	public void setUsuService(IUsuarioService usuService) {
		this.usuService = usuService;
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

	public List<Eventos> getListaEventoss() {
		return listaEventoss;
	}

	public void setListaEventoss(List<Eventos> listaEventoss) {
		this.listaEventoss = listaEventoss;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	
	
	

	

	
	
}