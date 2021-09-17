package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cita;
import pe.edu.upc.service.ICitaService;


@Named
@RequestScoped
public class CitaController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private ICitaService uService;
	private Cita cita;
	List<Cita> listaCita;
	
	@PostConstruct
	public void init() {
		this.listaCita = new ArrayList<Cita>();
		this.cita = new Cita();
		this.listar();
	}

	public String nuevoCita() {
		this.setCita(new Cita());
		return "Cita.xhtml";
	}
	
	public void insertar() {
		uService.insertar(cita);
		limpiarCita();
	}
	
	public void listar() {
		listaCita = uService.listar();
	}
	
	public void limpiarCita() {
		this.init();
	}
	
	public void eliminar(Cita cita) {
		uService.eliminar(cita.getID_HorarioCita());
	}

	public ICitaService getuService() {
		return uService;
	}

	public void setuService(ICitaService uService) {
		this.uService = uService;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public List<Cita> getListaCita() {
		return listaCita;
	}

	public void setListaCita(List<Cita> listaCita) {
		this.listaCita = listaCita;
	}
	
	
	
	


	//wuenas noches
	
	
}