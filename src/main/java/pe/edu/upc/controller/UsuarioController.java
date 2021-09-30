package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.TipoIdentificacion;
import pe.edu.upc.entity.Pais;
import pe.edu.upc.entity.MetodoDePago;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.ITipoIdentificacionService;
import pe.edu.upc.service.IPaisService;
import pe.edu.upc.service.IMetodoDePagoService;


@Named
@RequestScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IUsuarioService uService;
	
	@Inject
	private ITipoIdentificacionService tipService;
	
	@Inject
	private IPaisService paService;
	
	@Inject
	private IMetodoDePagoService mService;
	
	
	private Usuario usuario;
	private TipoIdentificacion tipoidentificacion;
	private Pais pais;
	private MetodoDePago metododepago;
	
	
	
	List<Usuario> listaUsuarios;
	List<TipoIdentificacion> listatipoidentificacion;
	List<Pais> listapaises;
	List<MetodoDePago> listametododepago;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listatipoidentificacion = new ArrayList<TipoIdentificacion>();
		this.listapaises = new ArrayList<Pais>();
		this.listametododepago = new ArrayList<MetodoDePago>();
		
		
		
		this.usuario = new Usuario();
		this.tipoidentificacion = new TipoIdentificacion();
		this.pais = new Pais();
		this.metododepago = new MetodoDePago();
		
		
		this.listar();
		this.listarTipoIdentificacion();
		this.listarpais();
		this.listarmetododepago();
	}

	public String nuevoUsuario() {
		this.setUsuario(new Usuario());
		return "usuario.xhtml";
	}
	
	public String ingreso() {
		return "/WEB-INF/template/template.xhtml";
	}
	
	public void insertar() {
		uService.insertar(usuario);
		limpiarUsuario();
		this.listar();
	}
	
	public void listar() {
		listaUsuarios = uService.listar();
	}
	
	public void listarTipoIdentificacion() {
		listatipoidentificacion = tipService.listar();
	}
	
	public void listarpais() {
		listapaises = paService.listar();
	}
	
	public void listarmetododepago() {
		listametododepago = mService.listar();
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

	public TipoIdentificacion getTipoidentificacion() {
		return tipoidentificacion;
	}

	public void setTipoidentificacion(TipoIdentificacion tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public MetodoDePago getMetododepago() {
		return metododepago;
	}

	public void setMetododepago(MetodoDePago metododepago) {
		this.metododepago = metododepago;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<TipoIdentificacion> getListatipoidentificacion() {
		return listatipoidentificacion;
	}

	public void setListatipoidentificacion(List<TipoIdentificacion> listatipoidentificacion) {
		this.listatipoidentificacion = listatipoidentificacion;
	}

	public List<Pais> getListapaises() {
		return listapaises;
	}

	public void setListapaises(List<Pais> listapaises) {
		this.listapaises = listapaises;
	}

	public List<MetodoDePago> getListametododepago() {
		return listametododepago;
	}

	public void setListametododepago(List<MetodoDePago> listametododepago) {
		this.listametododepago = listametododepago;
	}

}