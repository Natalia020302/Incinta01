package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Pais;
import pe.edu.upc.entity.Tipo_identificacion;
import pe.edu.upc.entity.Metodo_de_pago;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IPaisService;
import pe.edu.upc.service.ITipo_identificacionService;
import pe.edu.upc.service.IMetodo_de_pagoService;


@Named
@RequestScoped
public class ObstetraController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IUsuarioService uService;
	private Usuario usuario;
	List<Usuario> listaUsuarios;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.usuario = new Usuario();
		this.listar();
	}

	public String nuevoUsuario() {
		this.setUsuario(new Usuario());
		return "usuario.xhtml";
	}
	
	public void insertar() {
		uService.insertar(usuario);
		limpiarUsuario();
	}
	
	public void listar() {
		listaUsuarios = uService.listar();
	}
	
	public void limpiarUsuario() {
		this.init();
	}
	
	public void eliminar(Usuario usuario) {
		uService.eliminar(usuario.getUsuarioID());
	}
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	//wuenas noches
	
	
}