package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.PeriodoGestacion;
import pe.edu.upc.entity.Usuario;

import pe.edu.upc.service.IPeriodoGestacionService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class PeriodoGestacionController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private IPeriodoGestacionService pService;
	private PeriodoGestacion periodo;
	List<PeriodoGestacion> listaperiodos;

	@Inject
	private IUsuarioService uService;
	private Usuario usuario;
	List<Usuario> listaUsuarios;
	
	
	@PostConstruct
	public void init() {
		this.listaperiodos = new ArrayList<PeriodoGestacion>();
		this.listaUsuarios = new ArrayList<Usuario>();
		
		this.periodo = new PeriodoGestacion();
		this.usuario = new Usuario();

		this.listar();
		this.listarUsuarios();

	}

	public String nuevoPeriodoGestacion() {
		this.setPeriodo(new PeriodoGestacion());
		return "periodoGestacion.xhtml";
	}
	
	public void insertar() {
		pService.insertar(periodo);
		limpiarPeriodoGestacion();
		this.listar();
	}
	
	public void listar() {
		listaperiodos = pService.listar();
	}
	
	public void listarUsuarios() {
		listaUsuarios = uService.listar();
	}
	
	
	public void limpiarPeriodoGestacion() {
		this.init();
	}
	
	public void eliminar(PeriodoGestacion periodoGestacion) {
		pService.eliminar(periodoGestacion.getIdPeriodo());
		this.listar();
	}

	public IPeriodoGestacionService getpService() {
		return pService;
	}

	public void setpService(IPeriodoGestacionService pService) {
		this.pService = pService;
	}

	public PeriodoGestacion getPeriodo() {
		return periodo;
	}

	public void setPeriodo(PeriodoGestacion periodo) {
		this.periodo = periodo;
	}

	public List<PeriodoGestacion> getListaperiodos() {
		return listaperiodos;
	}

	public void setListaperiodos(List<PeriodoGestacion> listaperiodos) {
		this.listaperiodos = listaperiodos;
	}

	public IUsuarioService getuService() {
		return uService;
	}

	public void setuService(IUsuarioService uService) {
		this.uService = uService;
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
	
	
}