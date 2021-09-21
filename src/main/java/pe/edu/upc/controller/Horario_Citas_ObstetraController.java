package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Horario_Citas_Obstetra;
import pe.edu.upc.entity.Obstetra;

import pe.edu.upc.service.IHorario_Citas_ObstetraService;
import pe.edu.upc.service.IObstetraService;

@Named
@RequestScoped
public class Horario_Citas_ObstetraController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IHorario_Citas_ObstetraService uService;
	@Inject
	private IObstetraService hService;
	
	private Horario_Citas_Obstetra hco;
	private Obstetra obs;
	
	List<Horario_Citas_Obstetra> listaHorario_Citas_Obstetra;
	List<Obstetra> listaObstetra;
	
	@PostConstruct
	public void init() {
		this.listaHorario_Citas_Obstetra = new ArrayList<Horario_Citas_Obstetra>();
		this.listaObstetra = new ArrayList<Obstetra>();
		
		this.hco = new Horario_Citas_Obstetra();
		this.obs = new Obstetra();
		
		this.listar();
		this.listarObstetra();
		
	}

	public String nuevoUsuario() {
		this.setHco(new Horario_Citas_Obstetra());
		return "Horario_Citas_Obstetra.xhtml";
	}
	
	public void insertar() {
		uService.insertar(hco);
		limpiarHorario_Citas_Obstetra();
	}
	
	public void listar() {
		listaHorario_Citas_Obstetra = uService.listar();
	}
	
	public void listarObstetra() {
		listaObstetra = hService.listar();
	}
	
	public void limpiarHorario_Citas_Obstetra() {
		this.init();
	}
	
	public void eliminar(Horario_Citas_Obstetra hco) {
		uService.eliminar(hco.getID_HorarioCita());
	}

	public IObstetraService gethService() {
		return hService;
	}

	public void sethService(IObstetraService hService) {
		this.hService = hService;
	}

	public Horario_Citas_Obstetra getHco() {
		return hco;
	}

	public void setHco(Horario_Citas_Obstetra hco) {
		this.hco = hco;
	}

	public Obstetra getObs() {
		return obs;
	}

	public void setObs(Obstetra obs) {
		this.obs = obs;
	}

	public List<Horario_Citas_Obstetra> getListaHorario_Citas_Obstetra() {
		return listaHorario_Citas_Obstetra;
	}

	public void setListaHorario_Citas_Obstetra(List<Horario_Citas_Obstetra> listaHorario_Citas_Obstetra) {
		this.listaHorario_Citas_Obstetra = listaHorario_Citas_Obstetra;
	}

	public List<Obstetra> getListaObstetra() {
		return listaObstetra;
	}

	public void setListaObstetra(List<Obstetra> listaObstetra) {
		this.listaObstetra = listaObstetra;
	}

	public IHorario_Citas_ObstetraService getuService() {
		return uService;
	}

	public void setuService(IHorario_Citas_ObstetraService uService) {
		this.uService = uService;
	}
	
	
	
}