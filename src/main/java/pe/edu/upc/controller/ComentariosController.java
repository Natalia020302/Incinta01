package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Comentarios;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Obstetra;

import pe.edu.upc.service.IComentariosService;
import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IObstetraService;


@Named
@RequestScoped
public class ComentariosController implements Serializable {


	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IComentariosService cService;
	@Inject
	private IUsuarioService uService;
	@Inject
	private IObstetraService oService;
	
	
	private Comentarios comentarios;
	private Usuario usuario;
	private Obstetra obstetra;
	
	List<Comentarios> listaComentarios;
	List<Usuario> listaUsuario;
	List<Obstetra> listaObstetra;
	
	
	@PostConstruct
	public void init() {
		this.listaComentarios = new ArrayList<Comentarios>();
		this.listaUsuario = new ArrayList<Usuario>();
		this.listaObstetra = new ArrayList<Obstetra>();
		
		
		this.comentarios = new Comentarios();
		this.usuario = new Usuario();
		this.obstetra = new Obstetra();
		
		this.listarComentario();
		this.listarUsuarios();
		this.listarObstetras();
		
	}

	public String nuevoComentarios() {
		this.setComentarios(new Comentarios());
		return "Comentarios.xhtml";
	}
	
	public void insertar() {
		cService.insertar(comentarios);
		limpiarComentarios();
		this.listarComentario();
	}
	
	public void listarComentario() {
		listaComentarios = cService.listar();
	}
	
	public void listarUsuarios() {
		listaUsuario = uService.listar();
	}
	public void listarObstetras() {
		listaObstetra = oService.listar();
	}
	
	public void limpiarComentarios() {
		this.init();
	}
	
	
	
	public void eliminar(Comentarios comentarios) {
		cService.eliminar(comentarios.getIdComentario());
	}

	

	public Comentarios getComentarios() {
		return comentarios;
	}

	public void setComentarios(Comentarios comentarios) {
		this.comentarios = comentarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Obstetra getObstetra() {
		return obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		this.obstetra = obstetra;
	}

	public List<Comentarios> getListaComentarios() {
		return listaComentarios;
	}

	public void setListaComentarios(List<Comentarios> listaComentarios) {
		this.listaComentarios = listaComentarios;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public List<Obstetra> getListaObstetra() {
		return listaObstetra;
	}

	public void setListaObstetra(List<Obstetra> listaObstetra) {
		this.listaObstetra = listaObstetra;
	}





	
	
}