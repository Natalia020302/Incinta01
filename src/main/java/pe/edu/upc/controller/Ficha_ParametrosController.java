package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Ficha_Parametros;
import pe.edu.upc.service.IFicha_ParametrosService;


@Named
@RequestScoped
public class Ficha_ParametrosController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IFicha_ParametrosService uService;
	private Ficha_Parametros ficha_Parametros;
	List<Ficha_Parametros> listaFicha_Parametros;
	
	@PostConstruct
	public void init() {
		this.listaFicha_Parametros = new ArrayList<Ficha_Parametros>();
		this.ficha_Parametros = new Ficha_Parametros();
		this.listar();
	}

	public String nuevoFicha_Parametros() {
		this.setFicha_Parametros(new Ficha_Parametros());
		return "Ficha_Parametros.xhtml";
	}
	
	public void insertar() {
		uService.insertar(ficha_Parametros);
		limpiarFicha_Parametros();
	}
	
	public void listar() {
		listaFicha_Parametros = uService.listar();
	}
	
	public void limpiarFicha_Parametros() {
		this.init();
	}
	
	public void eliminar(Ficha_Parametros ficha_Parametros) {
		uService.eliminar(ficha_Parametros.getID_RegistroCita());
	}

	public IFicha_ParametrosService getuService() {
		return uService;
	}

	public void setuService(IFicha_ParametrosService uService) {
		this.uService = uService;
	}

	public Ficha_Parametros getFicha_Parametros() {
		return ficha_Parametros;
	}

	public void setFicha_Parametros(Ficha_Parametros ficha_Parametros) {
		this.ficha_Parametros = ficha_Parametros;
	}

	public List<Ficha_Parametros> getListaFicha_Parametros() {
		return listaFicha_Parametros;
	}

	public void setListaFicha_Parametros(List<Ficha_Parametros> listaFicha_Parametros) {
		this.listaFicha_Parametros = listaFicha_Parametros;
	}
	
	
	
	
	
	
}