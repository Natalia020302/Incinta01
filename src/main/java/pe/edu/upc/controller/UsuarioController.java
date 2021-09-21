package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Tipo_identificacion;
import pe.edu.upc.entity.Pais;
import pe.edu.upc.entity.Metodo_de_pago;



import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.ITipo_identificacionService;
import pe.edu.upc.service.IPaisService;
import pe.edu.upc.service.IMetodo_de_pagoService;




@Named
@RequestScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IUsuarioService uService;
	@Inject
	private ITipo_identificacionService tipService;
	@Inject
	private IPaisService paService;
	@Inject
	private IMetodo_de_pagoService mService;
	
	
	private Usuario usuario;
	private Tipo_identificacion tipo_identificacion;
	private Pais pais;
	private Metodo_de_pago metodo_de_pago;
	
	
	
	List<Usuario> listaUsuarios;
	List<Tipo_identificacion> listatipo_identificacion;
	List<Pais> listapaises;
	List<Metodo_de_pago> listametodo_de_pago;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listatipo_identificacion = new ArrayList<Tipo_identificacion>();
		this.listapaises = new ArrayList<Pais>();
		this.listametodo_de_pago = new ArrayList<Metodo_de_pago>();
		
		
		
		this.usuario = new Usuario();
		this.tipo_identificacion = new Tipo_identificacion();
		this.pais = new Pais();
		this.metodo_de_pago = new Metodo_de_pago();
		
		
		this.listar();
		this.listarTipo_identificacion();
		this.listarpais();
		this.listarmetodo_de_pago();
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
	
	public void listarTipo_identificacion() {
		listatipo_identificacion = tipService.listar();
	}
	
	public void listarpais() {
		listapaises = paService.listar();
	}
	
	public void listarmetodo_de_pago() {
		listametodo_de_pago = mService.listar();
	}
	
	public void limpiarUsuario() {
		this.init();
	}
	
	public void eliminar(Usuario usuario) {
		uService.eliminar(usuario.getUsuarioID());
	}

	public IUsuarioService getuService() {
		return uService;
	}

	public void setuService(IUsuarioService uService) {
		this.uService = uService;
	}

	public ITipo_identificacionService getTipService() {
		return tipService;
	}

	public void setTipService(ITipo_identificacionService tipService) {
		this.tipService = tipService;
	}

	public IPaisService getPaService() {
		return paService;
	}

	public void setPaService(IPaisService paService) {
		this.paService = paService;
	}

	public IMetodo_de_pagoService getmService() {
		return mService;
	}

	public void setmService(IMetodo_de_pagoService mService) {
		this.mService = mService;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tipo_identificacion getTipo_identificacion() {
		return tipo_identificacion;
	}

	public void setTipo_identificacion(Tipo_identificacion tipo_identificacion) {
		this.tipo_identificacion = tipo_identificacion;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Metodo_de_pago getMetodo_de_pago() {
		return metodo_de_pago;
	}

	public void setMetodo_de_pago(Metodo_de_pago metodo_de_pago) {
		this.metodo_de_pago = metodo_de_pago;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Tipo_identificacion> getListatipo_identificacion() {
		return listatipo_identificacion;
	}

	public void setListatipo_identificacion(List<Tipo_identificacion> listatipo_identificacion) {
		this.listatipo_identificacion = listatipo_identificacion;
	}

	public List<Pais> getListapaises() {
		return listapaises;
	}

	public void setListapaises(List<Pais> listapaises) {
		this.listapaises = listapaises;
	}

	public List<Metodo_de_pago> getListametodo_de_pago() {
		return listametodo_de_pago;
	}

	public void setListametodo_de_pago(List<Metodo_de_pago> listametodo_de_pago) {
		this.listametodo_de_pago = listametodo_de_pago;
	}
	
	
	
	

	
	
	
	
}