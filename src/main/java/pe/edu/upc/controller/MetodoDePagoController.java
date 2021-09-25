package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.MetodoDePago;

import pe.edu.upc.service.IMetodoDePagoService;

@Named
@RequestScoped
public class MetodoDePagoController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IMetodoDePagoService uService;
	private MetodoDePago metpago;
	List<MetodoDePago> listaMetodoDePagos;

	
	@PostConstruct
	public void init() {
		this.listaMetodoDePagos = new ArrayList<MetodoDePago>();
		
		this.metpago = new MetodoDePago();

		this.listar();

	}

	public String nuevoMetodoDePago() {
		this.setMetpago(new MetodoDePago());
		return "metpago.xhtml";
	}
	
	public void insertar() {
		uService.insertar(metpago);
		limpiarMetodoDePago();
		this.listar();
	}
	
	public void listar() {
		listaMetodoDePagos = uService.listar();
	}
	
	
	public void limpiarMetodoDePago() {
		this.init();
	}
	
	public void eliminar(MetodoDePago metpago) {
		uService.eliminar(metpago.getiDMetodoPago());
	}

	public IMetodoDePagoService getuService() {
		return uService;
	}

	public void setuService(IMetodoDePagoService uService) {
		this.uService = uService;
	}

	public MetodoDePago getMetpago() {
		return metpago;
	}

	public void setMetpago(MetodoDePago metpago) {
		this.metpago = metpago;
	}

	public List<MetodoDePago> getListaMetodoDePagos() {
		return listaMetodoDePagos;
	}

	public void setListaMetodoDePagos(List<MetodoDePago> listaMetodoDePagos) {
		this.listaMetodoDePagos = listaMetodoDePagos;
	}

}