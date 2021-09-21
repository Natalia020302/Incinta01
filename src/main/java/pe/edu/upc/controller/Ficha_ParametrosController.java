package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Ficha_Parametros;
import pe.edu.upc.entity.Parametro;
import pe.edu.upc.entity.Registro_Cita;


import pe.edu.upc.service.IFicha_ParametrosService;
import pe.edu.upc.service.IParametroService;
import pe.edu.upc.service.IRegistro_CitaService;


@Named
@RequestScoped
public class Ficha_ParametrosController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IFicha_ParametrosService uService;
	@Inject
	private IRegistro_CitaService rcService;
	@Inject
	private IParametroService pService;
	
	private Ficha_Parametros ficha_Parametros;
	private Registro_Cita registro_Cita;
	private Parametro parametro;
	
	List<Ficha_Parametros> listaFicha_Parametros;
	List<Registro_Cita> listaRegistro_Cita;
	List<Parametro> listaParametro;
	
	
	
	@PostConstruct
	public void init() {
		this.listaFicha_Parametros = new ArrayList<Ficha_Parametros>();
		this.listaRegistro_Cita = new ArrayList<Registro_Cita>();
		this.listaParametro = new ArrayList<Parametro>();
		
		
		this.ficha_Parametros = new Ficha_Parametros();
		this.registro_Cita = new Registro_Cita();
		this.parametro = new Parametro();
		
		
		this.listar();
		this.listarRegistro_Cita();
		this.listarParametro();
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
	public void listarRegistro_Cita() {
		listaRegistro_Cita = rcService.listar();
	}
	public void listarParametro() {
		listaParametro = pService.listar();
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

	public IRegistro_CitaService getRcService() {
		return rcService;
	}

	public void setRcService(IRegistro_CitaService rcService) {
		this.rcService = rcService;
	}

	public IParametroService getpService() {
		return pService;
	}

	public void setpService(IParametroService pService) {
		this.pService = pService;
	}

	public Ficha_Parametros getFicha_Parametros() {
		return ficha_Parametros;
	}

	public void setFicha_Parametros(Ficha_Parametros ficha_Parametros) {
		this.ficha_Parametros = ficha_Parametros;
	}

	public Registro_Cita getRegistro_Cita() {
		return registro_Cita;
	}

	public void setRegistro_Cita(Registro_Cita registro_Cita) {
		this.registro_Cita = registro_Cita;
	}

	public Parametro getParametro() {
		return parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}

	public List<Ficha_Parametros> getListaFicha_Parametros() {
		return listaFicha_Parametros;
	}

	public void setListaFicha_Parametros(List<Ficha_Parametros> listaFicha_Parametros) {
		this.listaFicha_Parametros = listaFicha_Parametros;
	}

	public List<Registro_Cita> getListaRegistro_Cita() {
		return listaRegistro_Cita;
	}

	public void setListaRegistro_Cita(List<Registro_Cita> listaRegistro_Cita) {
		this.listaRegistro_Cita = listaRegistro_Cita;
	}

	public List<Parametro> getListaParametro() {
		return listaParametro;
	}

	public void setListaParametro(List<Parametro> listaParametro) {
		this.listaParametro = listaParametro;
	}

	
	
}