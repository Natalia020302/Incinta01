package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.PreguntasGestante;
import pe.edu.upc.entity.Usuario;

import pe.edu.upc.service.IPreguntasGestanteService;
import pe.edu.upc.service.IUsuarioService;


@Named
@RequestScoped
public class PreguntasGestanteController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPreguntasGestanteService pService;
	@Inject
	private IUsuarioService uService;
	
	private PreguntasGestante preguntasGestante;
	private Usuario usuario;
	
	
	List<PreguntasGestante> listaPreguntasGestante;
	List<Usuario> listaUsuario;
	
	
	@PostConstruct
	public void init() {
		this.listaPreguntasGestante = new ArrayList<PreguntasGestante>();
		this.listaUsuario = new ArrayList<Usuario>();
		
		this.preguntasGestante = new PreguntasGestante();
		this.usuario = new Usuario();
		
		this.listarPregunta();
		this.listarUsuario();
	}

	public String nuevoPreguntasGestante() {
		this.setPreguntasGestante(new PreguntasGestante());
		return "PreguntasGestante.xhtml";
	}
	
	public void insertar() {
		pService.insertar(preguntasGestante);
		limpiarPreguntasGestante();
		this.listarPregunta();
	}
	
	public void listarPregunta() {
		listaPreguntasGestante = pService.listar();
	}
	
	public void listarUsuario() {
		listaUsuario = uService.listar();
	}

	public void limpiarPreguntasGestante() {
		this.init();
	}
	
	public void eliminar(PreguntasGestante preguntasGestante) {
		pService.eliminar(preguntasGestante.getIdPregunta());
	}

	
	public PreguntasGestante getPreguntasGestante() {
		return preguntasGestante;
	}

	public void setPreguntasGestante(PreguntasGestante preguntasGestante) {
		this.preguntasGestante = preguntasGestante;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<PreguntasGestante> getListaPreguntasGestante() {
		return listaPreguntasGestante;
	}

	public void setListaPreguntasGestante(List<PreguntasGestante> listaPreguntasGestante) {
		this.listaPreguntasGestante = listaPreguntasGestante;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	
}