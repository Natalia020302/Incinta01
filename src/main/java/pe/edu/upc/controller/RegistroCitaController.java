package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.RegistroCita;
import pe.edu.upc.service.IRegistroCitaService;


@Named
@RequestScoped
public class RegistroCitaController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	@Inject
	private IRegistroCitaService uService;
	private RegistroCita registroCita;
	List<RegistroCita> listaRegistroCita;
	
	
	@PostConstruct
	public void init() {
		this.listaRegistroCita = new ArrayList<RegistroCita>();
		this.registroCita = new RegistroCita();
		this.listar();
	}
	
	
	
	public String nuevoRegistroCita() {
		this.setRegistroCita(new RegistroCita());
		return "RegistroCita.xhtml";
		
	}
	
	public void insertar() {
		uService.insertar(registroCita);
		limpiarRegistroCita();
	}
	
	public void listar() {
		listaRegistroCita = uService.listar();
	}
	public void limpiarRegistroCita() {
		this.init();
	}
	public void eliminar(RegistroCita registroCita) {
		uService.eliminar(registroCita.getIdRegistroCita());
	}


	public RegistroCita getRegistroCita() {
		return registroCita;
	}



	public void setRegistroCita(RegistroCita registroCita) {
		this.registroCita = registroCita;
	}



	public List<RegistroCita> getListaRegistroCita() {
		return listaRegistroCita;
	}



	public void setListaRegistroCita(List<RegistroCita> listaRegistroCita) {
		this.listaRegistroCita = listaRegistroCita;
	}
	
	
	
	
}
