package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.entity.ObstetraSuscripcion;
import pe.edu.upc.entity.Suscripcion;
import pe.edu.upc.entity.Obstetra;

import pe.edu.upc.service.IObstetraSuscripcionService;
import pe.edu.upc.service.ISuscripcionService;
import pe.edu.upc.service.IObstetraService;


@Named
@RequestScoped
public class ObstetraSuscripcionController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IObstetraSuscripcionService uService;
	@Inject
	private ISuscripcionService sService;
	@Inject
	private IObstetraService oService;
	
	private ObstetraSuscripcion obstetrasuscripcion;
	private Suscripcion suscripcion;
	private Obstetra obstetra;
	
	List<ObstetraSuscripcion> listaobstetrasuscripcion;
	List<Suscripcion> listasuscripcion;
	List<Obstetra> listaobstetra;
	
	@PostConstruct
	public void init() {
		this.listaobstetrasuscripcion = new ArrayList<ObstetraSuscripcion>();
		this.listasuscripcion = new ArrayList<Suscripcion>();
		this.listaobstetra = new ArrayList<Obstetra>();
		
		this.obstetrasuscripcion = new ObstetraSuscripcion();
		this.suscripcion = new Suscripcion();
		this.obstetra = new Obstetra();
		
		this.listar();
		this.listarSuscripcion();
		this.listarObstetra();
	}

	public String nuevoObstetraSuscripcion() {
		this.setObstetrasuscripcion(new ObstetraSuscripcion());
		return "ObstetraSuscripcion.xhtml";
	}
	
	public void insertar() {
		uService.insertar(obstetrasuscripcion);
		limpiarObstetraSuscripcion();
	}
	
	public void listar() {
		listaobstetrasuscripcion = uService.listar();
	}
	
	public void listarSuscripcion() {
		listasuscripcion = sService.listar();
	}
	
	public void listarObstetra() {
		listaobstetra = oService.listar();
	}
	
	public void limpiarObstetraSuscripcion() {
		this.init();
	}
	
	public void eliminar(ObstetraSuscripcion obstetrasuscripcion) {
		uService.eliminar(obstetrasuscripcion.getIdobstetrasuscripcion());
	} /* GETTERS AND SETTERS */

	public IObstetraSuscripcionService getuService() {
		return uService;
	}

	public void setuService(IObstetraSuscripcionService uService) {
		this.uService = uService;
	}

	public ISuscripcionService getsService() {
		return sService;
	}

	public void setsService(ISuscripcionService sService) {
		this.sService = sService;
	}

	public IObstetraService getoService() {
		return oService;
	}

	public void setoService(IObstetraService oService) {
		this.oService = oService;
	}

	public ObstetraSuscripcion getObstetrasuscripcion() {
		return obstetrasuscripcion;
	}

	public void setObstetrasuscripcion(ObstetraSuscripcion obstetrasuscripcion) {
		this.obstetrasuscripcion = obstetrasuscripcion;
	}

	public Suscripcion getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}

	public Obstetra getObstetra() {
		return obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		this.obstetra = obstetra;
	}

	public List<ObstetraSuscripcion> getListaobstetrasuscripcion() {
		return listaobstetrasuscripcion;
	}

	public void setListaobstetrasuscripcion(List<ObstetraSuscripcion> listaobstetrasuscripcion) {
		this.listaobstetrasuscripcion = listaobstetrasuscripcion;
	}

	public List<Suscripcion> getListasuscripcion() {
		return listasuscripcion;
	}

	public void setListasuscripcion(List<Suscripcion> listasuscripcion) {
		this.listasuscripcion = listasuscripcion;
	}

	public List<Obstetra> getListaobstetra() {
		return listaobstetra;
	}

	public void setListaobstetra(List<Obstetra> listaobstetra) {
		this.listaobstetra = listaobstetra;
	}

}