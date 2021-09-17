package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.PeriodoGestacion;
import pe.edu.upc.service.IPeriodoGestacionService;


@Named
@RequestScoped
public class PeriodoGestacionController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IPeriodoGestacionService uService;
	private PeriodoGestacion periodoGestacion;
	List<PeriodoGestacion> listaPeriodoGestacions;
	
	@PostConstruct
	public void init() {
		this.listaPeriodoGestacions = new ArrayList<PeriodoGestacion>();
		this.periodoGestacion = new PeriodoGestacion();
		this.listar();
	}

	public String nuevoPeriodoGestacion() {
		this.setPeriodoGestacion(new PeriodoGestacion());
		return "periodoGestacion.xhtml";
	}
	
	public void insertar() {
		uService.insertar(periodoGestacion);
		limpiarPeriodoGestacion();
	}
	
	public void listar() {
		listaPeriodoGestacions = uService.listar();
	}
	
	public void limpiarPeriodoGestacion() {
		this.init();
	}
	
	public void eliminar(PeriodoGestacion periodoGestacion) {
		uService.eliminar(periodoGestacion.getUsuarioID(),periodoGestacion.getFecha_Actualizacion());
	}
	
	
	
	

	public PeriodoGestacion getPeriodoGestacion() {
		return periodoGestacion;
	}

	public void setPeriodoGestacion(PeriodoGestacion periodoGestacion) {
		this.periodoGestacion = periodoGestacion;
	}

	public List<PeriodoGestacion> getListaPeriodoGestacions() {
		return listaPeriodoGestacions;
	}

	public void setListaPeriodoGestacions(List<PeriodoGestacion> listaPeriodoGestacions) {
		this.listaPeriodoGestacions = listaPeriodoGestacions;
	}
	

	
	
}