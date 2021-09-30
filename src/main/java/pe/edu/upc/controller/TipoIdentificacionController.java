package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.TipoIdentificacion;
import pe.edu.upc.service.ITipoIdentificacionService;

@Named
@RequestScoped
public class TipoIdentificacionController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITipoIdentificacionService uService;
	private TipoIdentificacion tipoIdentificacion;
	List<TipoIdentificacion> listaTipoIdentificacion;
	
	@PostConstruct
	public void init() {
		this.listaTipoIdentificacion = new ArrayList<TipoIdentificacion>();
		this.tipoIdentificacion = new TipoIdentificacion();
		this.listar();
	}

	public String nuevoTipoIdentificacion() {
		this.setTipoIdentificacion(new TipoIdentificacion());
		return "TipoIdentificacion.xhtml";
	}
	
	public void insertar() {
		uService.insertar(tipoIdentificacion);
		limpiarTipoIdentificacion();
	}
	
	public void listar() {
		listaTipoIdentificacion = uService.listar();
	}
	
	public void limpiarTipoIdentificacion() {
		this.init();
	}
	
	public void eliminar(TipoIdentificacion tipoIdentificacion) {
		uService.eliminar(tipoIdentificacion.getiDTipoIdentificacion());
	}

	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public List<TipoIdentificacion> getListaTipoIdentificacion() {
		return listaTipoIdentificacion;
	}

	public void setListaTipoIdentificacion(List<TipoIdentificacion> listaTipoIdentificacion) {
		this.listaTipoIdentificacion = listaTipoIdentificacion;
	}

}