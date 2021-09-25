package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.FichaParametros;
import pe.edu.upc.entity.Queja;
import pe.edu.upc.entity.RegistroCita;

import pe.edu.upc.service.IFichaParametrosService;
import pe.edu.upc.service.IQuejaService;
import pe.edu.upc.service.IRegistroCitaService;

@Named
@RequestScoped
public class FichaParametrosController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IFichaParametrosService fService;
	@Inject
	private IQuejaService qService;
	@Inject
	private IRegistroCitaService rService;
	
	private FichaParametros fichaParametros;
	private Queja queja;
	private RegistroCita registroCita;
	
	List<FichaParametros> listaFichaParametros;
	List<Queja> listaQueja;
	List<RegistroCita> listaRegistroCita;
	
	
	
	@PostConstruct
	public void init() {
		this.listaFichaParametros = new ArrayList<FichaParametros>();
		this.listaQueja = new ArrayList<Queja>();
		this.listaRegistroCita = new ArrayList<RegistroCita>();
		
		
		this.fichaParametros = new FichaParametros();
		this.queja = new Queja();
		this.registroCita = new RegistroCita();
		
		
		this.listarFicha();	
		this.listarQueja();
		this.listarRegistroCita();
		
		
	}

	public String nuevoFichaParametros() {
		this.setFichaParametros(new FichaParametros());
		return "FichaParametros.xhtml";
	}
	
	public void insertar() {
		fService.insertar(fichaParametros);
		limpiarFichaParametros();
		this.listarFicha();
	}
	
	public void listarFicha() {
		listaFichaParametros = fService.listar();
	}
	public void listarQueja() {
		listaQueja = qService.listar();
	}
	public void listarRegistroCita() {
		listaRegistroCita = rService.listar();
	}
	
	
	public void limpiarFichaParametros() {
		this.init();
	}
	
	public void eliminar(FichaParametros fichaParametros) {
		fService.eliminar(fichaParametros.getIdFichaParametro());
	}

	
	public FichaParametros getFichaParametros() {
		return fichaParametros;
	}

	public void setFichaParametros(FichaParametros fichaParametros) {
		this.fichaParametros = fichaParametros;
	}

	public Queja getQueja() {
		return queja;
	}

	public void setQueja(Queja queja) {
		this.queja = queja;
	}

	public RegistroCita getRegistroCita() {
		return registroCita;
	}

	public void setRegistroCita(RegistroCita registroCita) {
		this.registroCita = registroCita;
	}

	public List<FichaParametros> getListaFichaParametros() {
		return listaFichaParametros;
	}

	public void setListaFichaParametros(List<FichaParametros> listaFichaParametros) {
		this.listaFichaParametros = listaFichaParametros;
	}

	public List<Queja> getListaQueja() {
		return listaQueja;
	}

	public void setListaQueja(List<Queja> listaQueja) {
		this.listaQueja = listaQueja;
	}

	public List<RegistroCita> getListaRegistroCita() {
		return listaRegistroCita;
	}

	public void setListaRegistroCita(List<RegistroCita> listaRegistroCita) {
		this.listaRegistroCita = listaRegistroCita;
	}


}