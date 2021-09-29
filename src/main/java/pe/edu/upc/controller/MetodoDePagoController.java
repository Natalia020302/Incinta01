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
	private MetodoDePago metodoDePago;
	List<MetodoDePago> listaMetodoDePago;

	
	@PostConstruct
	public void init() {
		this.listaMetodoDePago = new ArrayList<MetodoDePago>();
		
		this.metodoDePago = new MetodoDePago();

		this.listar();

	}

	public String nuevoMetodoDePago() {
		this.setMetodoDePago(new MetodoDePago());
		return "metodoDePago.xhtml";
	}
	
	public void insertar() {
		uService.insertar(metodoDePago);
		limpiarMetodoDePago();
	//	this.listar();
	}
	
	public void listar() {
		listaMetodoDePago = uService.listar();
	}
	
	
	public void limpiarMetodoDePago() {
		this.init();
	}
	
	public void eliminar(MetodoDePago metodoDePago) {
		uService.eliminar(metodoDePago.getiDMetodoPago());
	}

	public MetodoDePagoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MetodoDePagoController(MetodoDePago metodoDePago, List<MetodoDePago> listaMetodoDePago) {
		super();
		this.metodoDePago = metodoDePago;
		this.listaMetodoDePago = listaMetodoDePago;
	}

	public MetodoDePago getMetodoDePago() {
		return metodoDePago;
	}

	public void setMetodoDePago(MetodoDePago metodoDePago) {
		this.metodoDePago = metodoDePago;
	}

	public List<MetodoDePago> getListaMetodoDePago() {
		return listaMetodoDePago;
	}

	public void setListaMetodoDePago(List<MetodoDePago> listaMetodoDePago) {
		this.listaMetodoDePago = listaMetodoDePago;
	}

}