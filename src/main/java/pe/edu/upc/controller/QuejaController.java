package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cita;
import pe.edu.upc.entity.Queja;

import pe.edu.upc.service.ICitaService;
import pe.edu.upc.service.IQuejaService;


@Named
@RequestScoped
public class QuejaController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IQuejaService uService;
	@Inject
	private ICitaService cService;
	
	private Queja queja;
	private Cita cita;
	
	List<Queja> listaQueja;
	List<Cita> listaCita;
	
	@PostConstruct
	public void init() {
		this.listaQueja = new ArrayList<Queja>();
		this.listaCita = new ArrayList<Cita>();
		
		this.queja = new Queja();
		this.cita = new Cita();
		
		this.listar();
		this.listarCita();
	}

	public String nuevoQueja() {
		this.setQueja(new Queja());
		return "Queja.xhtml";
	}
	
	public void insertar() {
		uService.insertar(queja);
		limpiarQueja();
	}
	public void listarCita() {
		listaCita = cService.listar();
	}
	public void listar() {
		listaQueja = uService.listar();
	}
	
	public void limpiarQueja() {
		this.init();
	}
	
	public void eliminar(Queja queja) {
		uService.eliminar(queja.getID_HorarioCita());
	}

	public IQuejaService getuService() {
		return uService;
	}

	public void setuService(IQuejaService uService) {
		this.uService = uService;
	}

	public ICitaService getcService() {
		return cService;
	}

	public void setcService(ICitaService cService) {
		this.cService = cService;
	}

	public Queja getQueja() {
		return queja;
	}

	public void setQueja(Queja queja) {
		this.queja = queja;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public List<Queja> getListaQueja() {
		return listaQueja;
	}

	public void setListaQueja(List<Queja> listaQueja) {
		this.listaQueja = listaQueja;
	}

	public List<Cita> getListaCita() {
		return listaCita;
	}

	public void setListaCita(List<Cita> listaCita) {
		this.listaCita = listaCita;
	}

	
	
}