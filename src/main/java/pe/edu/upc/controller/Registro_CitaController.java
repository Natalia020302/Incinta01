package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Registro_Cita;
import pe.edu.upc.service.IRegistro_CitaService;


@Named
@RequestScoped
public class Registro_CitaController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IRegistro_CitaService uService;
	private Registro_Cita registro_Cita;
	List<Registro_Cita> listaRegistro_Cita;
	
	@PostConstruct
	public void init() {
		this.listaRegistro_Cita = new ArrayList<Registro_Cita>();
		this.registro_Cita = new Registro_Cita();
		this.listar();
	}

	public String nuevoRegistro_Cita() {
		this.setRegistro_Cita(new Registro_Cita());
		return "usuario.xhtml";
	}
	
	public void insertar() {
		uService.insertar(registro_Cita);
		limpiarRegistro_Cita();
	}
	
	public void listar() {
		listaRegistro_Cita = uService.listar();
	}
	
	public void limpiarRegistro_Cita() {
		this.init();
	}
	
	public void eliminar(Registro_Cita registro_Cita) {
		uService.eliminar(registro_Cita.getID_RegistroCita());
	}

	public IRegistro_CitaService getuService() {
		return uService;
	}

	public void setuService(IRegistro_CitaService uService) {
		this.uService = uService;
	}

	public Registro_Cita getRegistro_Cita() {
		return registro_Cita;
	}

	public void setRegistro_Cita(Registro_Cita registro_Cita) {
		this.registro_Cita = registro_Cita;
	}

	public List<Registro_Cita> getListaRegistro_Cita() {
		return listaRegistro_Cita;
	}

	public void setListaRegistro_Cita(List<Registro_Cita> listaRegistro_Cita) {
		this.listaRegistro_Cita = listaRegistro_Cita;
	}
	
	
	
	
}