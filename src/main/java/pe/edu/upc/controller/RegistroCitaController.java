package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.RegistroCita;
import pe.edu.upc.entity.Cita;

import pe.edu.upc.service.IRegistroCitaService;
import pe.edu.upc.service.ICitaService;


@Named
@RequestScoped
public class RegistroCitaController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRegistroCitaService rService;
	@Inject
	private ICitaService cService;
	
	
	private RegistroCita registroCita;
	private Cita cita;
	
	
	List<RegistroCita> listaRegistroCita;
	List<Cita> listaCita;
	
	
	@PostConstruct
	public void init() {
		this.listaRegistroCita = new ArrayList<RegistroCita>();
		this.listaCita = new ArrayList<Cita>();
		
		this.registroCita = new RegistroCita();
		this.cita = new Cita();
		
		this.listarRegistro();
		this.listarCita();
	}
	
	public String nuevoRegistroCita() {
		this.setRegistroCita(new RegistroCita());
		return "RegistroCita.xhtml";
		
	}
	
	public void insertar() {
		rService.insertar(registroCita);
		listarRegistro();
	}
	
	public void listarRegistro() {
		listaRegistroCita = rService.listar();
	}	
	public void listarCita() {
		listaCita = cService.listar();
	}

	public void eliminar(RegistroCita registroCita) {
		rService.eliminar(registroCita.getIdRegistroCita());
	}
	
	public RegistroCita getRegistroCita() {
		return registroCita;
	}

	public void setRegistroCita(RegistroCita registroCita) {
		this.registroCita = registroCita;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public List<RegistroCita> getListaRegistroCita() {
		return listaRegistroCita;
	}

	public void setListaRegistroCita(List<RegistroCita> listaRegistroCita) {
		this.listaRegistroCita = listaRegistroCita;
	}

	public List<Cita> getListaCita() {
		return listaCita;
	}

	public void setListaCita(List<Cita> listaCita) {
		this.listaCita = listaCita;
	}

	
}
