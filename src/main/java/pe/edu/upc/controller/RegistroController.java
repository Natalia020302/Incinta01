package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
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
	private IUsuarioService uService;
	private IParametroService pService;


	
	private Registro registro;
	private Usuario usuario;
	private Parametro parametro;
	
	
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

		this.listarregistro();
		this.listarparametro();
		this.listarusuario();

	}

	public String nuevoRegistro() {
		this.setRegistro(new Registro());
		return "registro.xhtml";
	}
	
	public void insertar() {
		rService.insertar(registro);
		limpiarRegistro();
		this.listarregistro();
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

	

	
	
	
	
	
	
	
	
	
	
	

	

	
	
	
	
}