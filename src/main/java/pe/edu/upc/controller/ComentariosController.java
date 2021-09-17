package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Comentarios;
import pe.edu.upc.service.IComentariosService;


@Named
@RequestScoped
public class ComentariosController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IComentariosService uService;
	private Comentarios comentarios;
	List<Comentarios> listaComentarios;
	
	@PostConstruct
	public void init() {
		this.listaComentarios = new ArrayList<Comentarios>();
		this.comentarios = new Comentarios();
		this.listar();
	}

	public String nuevoComentarios() {
		this.setComentarios(new Comentarios());
		return "Comentarios.xhtml";
	}
	
	public void insertar() {
		uService.insertar(comentarios);
		limpiarComentarios();
	}
	
	public void listar() {
		listaComentarios = uService.listar();
	}
	
	public void limpiarComentarios() {
		this.init();
	}
	
	public void eliminar(Comentarios comentarios) {
		uService.eliminar(comentarios.getIDComentario());
	}

	public IComentariosService getuService() {
		return uService;
	}

	public void setuService(IComentariosService uService) {
		this.uService = uService;
	}

	public Comentarios getComentarios() {
		return comentarios;
	}

	public void setComentarios(Comentarios comentarios) {
		this.comentarios = comentarios;
	}

	public List<Comentarios> getListaComentarios() {
		return listaComentarios;
	}

	public void setListaComentarios(List<Comentarios> listaComentarios) {
		this.listaComentarios = listaComentarios;
	}
	
	
	
	

	//wuenas noches
	
	
}