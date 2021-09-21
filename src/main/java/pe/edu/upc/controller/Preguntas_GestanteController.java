package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Preguntas_Gestante;
import pe.edu.upc.entity.Usuario;

import pe.edu.upc.service.IPreguntas_GestanteService;
import pe.edu.upc.service.IUsuarioService;


@Named
@RequestScoped
public class Preguntas_GestanteController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IPreguntas_GestanteService uService;
	
	@Inject
	private IUsuarioService usService;
	
	private Preguntas_Gestante preguntas_Gestante;
	private Usuario usuario;
	
	List<Preguntas_Gestante> listaPreguntas_Gestante;
	List<Usuario> listaUsuario;
	
	
	@PostConstruct
	public void init() {
		this.listaPreguntas_Gestante = new ArrayList<Preguntas_Gestante>();
		this.listaUsuario = new ArrayList<Usuario>();
		
		this.preguntas_Gestante = new Preguntas_Gestante();
		this.usuario = new Usuario();
		
		
		this.listar();
		this.listarUsuario();
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
	public void listarUsuario() {
		listaUsuario = usService.listar();
	}
	
	public void limpiarPreguntas_Gestante() {
		this.init();
	}
	
	public void eliminar(Preguntas_Gestante preguntas_Gestante) {
		uService.eliminar(preguntas_Gestante.getIDPregunta(),preguntas_Gestante.getIDGestante());
	}

	public IPreguntas_GestanteService getuService() {
		return uService;
	}

	public void setuService(IPreguntas_GestanteService uService) {
		this.uService = uService;
	}

	public IUsuarioService getUsService() {
		return usService;
	}

	public void setUsService(IUsuarioService usService) {
		this.usService = usService;
	}

	public Preguntas_Gestante getPreguntas_Gestante() {
		return preguntas_Gestante;
	}

	public void setPreguntas_Gestante(Preguntas_Gestante preguntas_Gestante) {
		this.preguntas_Gestante = preguntas_Gestante;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Preguntas_Gestante> getListaPreguntas_Gestante() {
		return listaPreguntas_Gestante;
	}

	public void setListaPreguntas_Gestante(List<Preguntas_Gestante> listaPreguntas_Gestante) {
		this.listaPreguntas_Gestante = listaPreguntas_Gestante;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	
	
}