package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Obstetra_Suscripcion;
import pe.edu.upc.entity.Suscripcion;
import pe.edu.upc.entity.Obstetra;

import pe.edu.upc.service.IObstetra_SuscripcionService;
import pe.edu.upc.service.ISuscripcionService;
import pe.edu.upc.service.IObstetraService;

@Named
@RequestScoped
public class Obstetra_SuscripcionController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IObstetra_SuscripcionService uService;
	@Inject
	private ISuscripcionService sService;
	@Inject
	private IObstetraService oService;
	
	private Obstetra_Suscripcion os;
	private Suscripcion sus;
	private Obstetra ob;
	
	List<Obstetra_Suscripcion> listaObstetra_Suscripcion;
	List<Suscripcion> listaSuscripcion;
	List<Obstetra> listaObstetra;
	
	@PostConstruct
	public void init() {
		this.listaObstetra_Suscripcion = new ArrayList<Obstetra_Suscripcion>();
		this.listaSuscripcion = new ArrayList<Suscripcion>();
		this.listaObstetra = new ArrayList<Obstetra>();
		
		this.os = new Obstetra_Suscripcion();
		this.sus = new Suscripcion();
		this.ob = new Obstetra();
		
		this.listar();
		this.listarSuscripcion();
		this.listarObstetra();
	}

	public String nuevoObstetra_Suscripcion() {
		this.setOs(new Obstetra_Suscripcion());
		return "Obstetra_Suscripcion.xhtml";
	}
	
	public void insertar() {
		uService.insertar(os);
		limpiarObstetra_Suscripcion();
	}
	
	public void listar() {
		listaObstetra_Suscripcion = uService.listar();
	}
	
	public void listarSuscripcion() {
		listaSuscripcion = sService.listar();
	}
	
	public void listarObstetra() {
		listaObstetra = oService.listar();
	}
	
	public void limpiarObstetra_Suscripcion() {
		this.init();
	}
	
	public void eliminar(Obstetra_Suscripcion os) {
		uService.eliminar(os.getID_Suscripcion(),os.getFechaInicio(),os.getIDObstetra());
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

	public Obstetra_Suscripcion getOs() {
		return os;
	}

	public void setOs(Obstetra_Suscripcion os) {
		this.os = os;
	}

	public Suscripcion getSus() {
		return sus;
	}

	public void setSus(Suscripcion sus) {
		this.sus = sus;
	}

	public Obstetra getOb() {
		return ob;
	}

	public void setOb(Obstetra ob) {
		this.ob = ob;
	}

	public List<Obstetra_Suscripcion> getListaObstetra_Suscripcion() {
		return listaObstetra_Suscripcion;
	}

	public void setListaObstetra_Suscripcion(List<Obstetra_Suscripcion> listaObstetra_Suscripcion) {
		this.listaObstetra_Suscripcion = listaObstetra_Suscripcion;
	}

	public List<Suscripcion> getListaSuscripcion() {
		return listaSuscripcion;
	}

	public void setListaSuscripcion(List<Suscripcion> listaSuscripcion) {
		this.listaSuscripcion = listaSuscripcion;
	}

	public List<Obstetra> getListaObstetra() {
		return listaObstetra;
	}

	public void setListaObstetra(List<Obstetra> listaObstetra) {
		this.listaObstetra = listaObstetra;
	}

	public IObstetra_SuscripcionService getuService() {
		return uService;
	}

	public void setuService(IObstetra_SuscripcionService uService) {
		this.uService = uService;
	}
	
	
	
}