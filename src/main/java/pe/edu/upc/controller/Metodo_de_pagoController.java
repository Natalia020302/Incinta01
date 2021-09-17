package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Metodo_de_pago;
import pe.edu.upc.service.IMetodo_de_pagoService;


@Named
@RequestScoped
public class Metodo_de_pagoController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IMetodo_de_pagoService metService;
	private Metodo_de_pago metodo_de_pago;
	List<Metodo_de_pago> listaMetodo_de_pago;
	
	@PostConstruct
	public void init() {
		this.listaMetodo_de_pago = new ArrayList<Metodo_de_pago>();
		this.metodo_de_pago = new Metodo_de_pago();
		this.listar();
	}

	public String nuevoMetodo_de_pago() {
		this.setMetodo_de_pago(new Metodo_de_pago());
		return "usuario.xhtml";
	} 
	
	public void insertar() {
		metService.insertar(metodo_de_pago);
		limpiarMetodo_de_pago();
	}
	
	public void listar() {
		listaMetodo_de_pago = metService.listar();
	}
	
	public void limpiarMetodo_de_pago() {
		this.init();
	}
	
	public void eliminar(Metodo_de_pago metodo_de_pago) {
		metService.eliminar(metodo_de_pago.getIDMetodo_Pago());
	}
	
	

	public Metodo_de_pago getMetodo_de_pago() {
		return metodo_de_pago;
	}

	public void setMetodo_de_pago(Metodo_de_pago metodo_de_pago) {
		this.metodo_de_pago = metodo_de_pago;
	}

	public List<Metodo_de_pago> getListaMetodo_de_pago() {
		return listaMetodo_de_pago;
	}

	public void setListaMetodo_de_pago(List<Metodo_de_pago> listaMetodo_de_pago) {
		this.listaMetodo_de_pago = listaMetodo_de_pago;
	}
	
	
	
	
}