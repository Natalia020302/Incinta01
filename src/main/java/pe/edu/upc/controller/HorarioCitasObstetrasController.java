package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.HorarioCitasObstetras;
import pe.edu.upc.entity.Obstetra;

import pe.edu.upc.service.IHorarioCitasObstetrasService;
import pe.edu.upc.service.IObstetraService;

@Named
@RequestScoped
public class HorarioCitasObstetrasController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IHorarioCitasObstetrasService uService;
	@Inject
	private IObstetraService bService;

	private HorarioCitasObstetras horariocitasobstetras;
	private Obstetra obstetra;
	
	List<HorarioCitasObstetras> listahorariocitasobstetras;
	List<Obstetra> listaobstetra;
	
	@PostConstruct
	public void init() {
		this.listahorariocitasobstetras = new ArrayList<HorarioCitasObstetras>();
		this.listaobstetra = new ArrayList<Obstetra>();
		
		this.horariocitasobstetras = new HorarioCitasObstetras();
		this.obstetra = new Obstetra();
		
		this.listar();
		this.listarObstetra();
	}

	public String nuevoObstetra() {
		this.setHorariocitasobstetras(new HorarioCitasObstetras());
		return "HorarioCitasObstetras.xhtml";
	}
	
	public void insertar() {
		uService.insertar(horariocitasobstetras);
		limpiarHorarioCitasObstetras();
	}
	
	public void listar() {
		listahorariocitasobstetras = uService.listar();
	}
	
	public void listarObstetra() {
		listaobstetra = bService.listar();
	}
	
	public void limpiarHorarioCitasObstetras() {
		this.init();
	}
	
	public void eliminar(HorarioCitasObstetras horariocitasobstetras) {
		uService.eliminar(horariocitasobstetras.getIdhorariocita());
	}	/* GETTERS AND SETTERS */

	public IHorarioCitasObstetrasService getuService() {
		return uService;
	}

	public void setuService(IHorarioCitasObstetrasService uService) {
		this.uService = uService;
	}

	public IObstetraService getbService() {
		return bService;
	}

	public void setbService(IObstetraService bService) {
		this.bService = bService;
	}

	public HorarioCitasObstetras getHorariocitasobstetras() {
		return horariocitasobstetras;
	}

	public void setHorariocitasobstetras(HorarioCitasObstetras horariocitasobstetras) {
		this.horariocitasobstetras = horariocitasobstetras;
	}

	public Obstetra getObstetra() {
		return obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		this.obstetra = obstetra;
	}

	public List<HorarioCitasObstetras> getListahorariocitasobstetras() {
		return listahorariocitasobstetras;
	}

	public void setListahorariocitasobstetras(List<HorarioCitasObstetras> listahorariocitasobstetras) {
		this.listahorariocitasobstetras = listahorariocitasobstetras;
	}

	public List<Obstetra> getListaobstetra() {
		return listaobstetra;
	}

	public void setListaobstetra(List<Obstetra> listaobstetra) {
		this.listaobstetra = listaobstetra;
	}
	
}