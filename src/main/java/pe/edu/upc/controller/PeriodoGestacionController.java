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

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IPeriodoGestacionService uService;
	@Inject
	private IUsuarioService usuService;
	
	
	private PeriodoGestacion periodoGestacion;
	private Usuario usuario;
	
	
	List<PeriodoGestacion> listaPeriodoGestacions;
	List<Usuario> listaUsuario;
	
	
	@PostConstruct
	public void init() {
		this.listaPeriodoGestacions = new ArrayList<PeriodoGestacion>();
		this.listaUsuario = new ArrayList<Usuario>();
		
		this.periodoGestacion = new PeriodoGestacion();
		this.usuario = new Usuario();
		
		
		this.listar();
		this.listarUsuario();
	}

	public String nuevoPeriodoGestacion() {
		this.setPeriodoGestacion(new PeriodoGestacion());
		return "PeriodoGestacion.xhtml";
	}
	
	public void insertar() {
		uService.insertar(periodoGestacion);
		limpiarPeriodoGestacion();
	}
	
	public void listar() {
		listaPeriodoGestacions = uService.listar();
	}
	
	public void listarUsuario() {
		listaUsuario = usuService.listar();
	}
	
	
	
	public void limpiarPeriodoGestacion() {
		this.init();
	}
	
	public void eliminar(PeriodoGestacion periodoGestacion) {
		uService.eliminar(periodoGestacion.getUsuarioID(),periodoGestacion.getFecha_Actualizacion());
	}

	public IPeriodoGestacionService getuService() {
		return uService;
	}

	public void setuService(IPeriodoGestacionService uService) {
		this.uService = uService;
	}

	public IUsuarioService getUsuService() {
		return usuService;
	}

	public void setUsuService(IUsuarioService usuService) {
		this.usuService = usuService;
	}

	public PeriodoGestacion getPeriodoGestacion() {
		return periodoGestacion;
	}

	public void setPeriodoGestacion(PeriodoGestacion periodoGestacion) {
		this.periodoGestacion = periodoGestacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<PeriodoGestacion> getListaPeriodoGestacions() {
		return listaPeriodoGestacions;
	}

	public void setListaPeriodoGestacions(List<PeriodoGestacion> listaPeriodoGestacions) {
		this.listaPeriodoGestacions = listaPeriodoGestacions;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	
	
	

	
	
	

	
	
}