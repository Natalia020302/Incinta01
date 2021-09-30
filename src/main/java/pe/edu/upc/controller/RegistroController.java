package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Registro;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Parametro;

import pe.edu.upc.service.IRegistroService;
import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IParametroService;


@Named
@RequestScoped
public class RegistroController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRegistroService rService;
	@Inject
	private IUsuarioService uService;
	@Inject
	private IParametroService pService;


	
	private Registro registro;
	private Usuario usuario;
	private Parametro parametro;
	
	private Registro registroseleccionado;
	
	private int sup1;
	private Date sup2;
	
	
	List<Registro> listaRegistros;
	List<Usuario> listaUsuarios;
	List<Parametro> listaParametros;


	
	@PostConstruct
	public void init() {
		this.listaRegistros = new ArrayList<Registro>();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaParametros = new ArrayList<Parametro>();

		
		this.registro = new Registro();
		this.parametro = new Parametro();
		this.usuario = new Usuario();
		this.registroseleccionado = new Registro();

		this.listarregistro();
		this.listarparametro();
		this.listarusuario();

	}

	public String nuevoRegistro() {
		this.setRegistro(new Registro());
		return "registroNuevo.xhtml";
	}
	
	public void insertar() {
		registro.setUsuarioID(this.filtrar(sup1));
		rService.insertar(registro);
		this.listarregistro();
	}
	
	public String Seleccionar(Registro r) {
		this.setRegistroseleccionado(r);
		return "registroInfo.xhtml";
	}
	
	public Usuario filtrar(int IDUsuario) {
		return listaUsuarios.get(IDUsuario);
	}
	
	public void listarregistro() {
		listaRegistros = rService.listar();
	}
	
	public void listarparametro() {
		listaParametros = pService.listar();
	}
	
	public void listarusuario() {
		listaUsuarios = uService.listar();
	}
	
	public void limpiarRegistro() {
		this.init();
	}
	
	public void eliminar(Registro registro) {
		rService.eliminar(registro.getiDRegistro());
		this.listarregistro();
	}

	public IRegistroService getrService() {
		return rService;
	}

	public void setrService(IRegistroService rService) {
		this.rService = rService;
	}

	public IUsuarioService getuService() {
		return uService;
	}

	public void setuService(IUsuarioService uService) {
		this.uService = uService;
	}

	public IParametroService getpService() {
		return pService;
	}

	public void setpService(IParametroService pService) {
		this.pService = pService;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Parametro getParametro() {
		return parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}

	public List<Registro> getListaRegistros() {
		return listaRegistros;
	}

	public void setListaRegistros(List<Registro> listaRegistros) {
		this.listaRegistros = listaRegistros;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Parametro> getListaParametros() {
		return listaParametros;
	}

	public void setListaParametros(List<Parametro> listaParametros) {
		this.listaParametros = listaParametros;
	}

	public Registro getRegistroseleccionado() {
		return registroseleccionado;
	}

	public void setRegistroseleccionado(Registro registroseleccionado) {
		this.registroseleccionado = registroseleccionado;
	}

	public int getSup1() {
		return sup1;
	}

	public void setSup1(int sup1) {
		this.sup1 = sup1;
	}

	public Date getSup2() {
		return sup2;
	}

	public void setSup2(Date sup2) {
		this.sup2 = sup2;
	}
	
}