package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Obstetra;
import pe.edu.upc.entity.Pais;
import pe.edu.upc.entity.Tipo_identificacion;
import pe.edu.upc.entity.Metodo_de_pago;

import pe.edu.upc.service.IObstetraService;
import pe.edu.upc.service.IPaisService;
import pe.edu.upc.service.ITipo_identificacionService;
import pe.edu.upc.service.IMetodo_de_pagoService;


@Named
@RequestScoped
public class ObstetraController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IObstetraService uService;
	@Inject
	private IPaisService pService;
	@Inject
	private ITipo_identificacionService tiService;
	@Inject
	private IMetodo_de_pagoService mService;
	
	private Obstetra obstetra;
	private Pais pais;
	private Tipo_identificacion tip;
	private Metodo_de_pago met;
	
	List<Obstetra> listaObstetra;
	List<Pais> listaPais;
	List<Tipo_identificacion> listaTipo_identificacion;
	List<Metodo_de_pago> listaMetodo_de_pago;
	
	@PostConstruct
	public void init() {
		this.listaObstetra = new ArrayList<Obstetra>();
		this.listaPais = new ArrayList<Pais>();
		this.listaTipo_identificacion = new ArrayList<Tipo_identificacion>();
		this.listaMetodo_de_pago = new ArrayList<Metodo_de_pago>();
		
		this.obstetra = new Obstetra();
		this.pais = new Pais();
		this.tip = new Tipo_identificacion();
		this.met = new Metodo_de_pago();
		
		this.listar();
		this.listarPais();
		this.listarTipo_identificacion();
		this.listaMetodo_de_pago();
	}

	public String nuevoObstetra() {
		this.setObstetra(new Obstetra());
		return "Obstetra.xhtml";
	}
	
	public void insertar() {
		uService.insertar(obstetra);
		limpiarObstetra();
	}
	
	public void listar() {
		listaObstetra = uService.listar();
	}
	
	public void listarPais() {
		listaPais = pService.listar();
	}
	
	public void listarTipo_identificacion() {
		listaTipo_identificacion = tiService.listar();
	}
	
	public void listaMetodo_de_pago() {
		listaMetodo_de_pago = mService.listar();
	}
	
	public void limpiarObstetra() {
		this.init();
	}
	
	public void eliminar(Obstetra obstetra) {
		uService.eliminar(obstetra.getIDObstetra());
	}

	public IObstetraService getuService() {
		return uService;
	}

	public void setuService(IObstetraService uService) {
		this.uService = uService;
	}

	public IPaisService getpService() {
		return pService;
	}

	public void setpService(IPaisService pService) {
		this.pService = pService;
	}

	public ITipo_identificacionService getTiService() {
		return tiService;
	}

	public void setTiService(ITipo_identificacionService tiService) {
		this.tiService = tiService;
	}

	public IMetodo_de_pagoService getmService() {
		return mService;
	}

	public void setmService(IMetodo_de_pagoService mService) {
		this.mService = mService;
	}

	public Obstetra getObstetra() {
		return obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		this.obstetra = obstetra;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Tipo_identificacion getTip() {
		return tip;
	}

	public void setTip(Tipo_identificacion tip) {
		this.tip = tip;
	}

	public Metodo_de_pago getMet() {
		return met;
	}

	public void setMet(Metodo_de_pago met) {
		this.met = met;
	}

	public List<Obstetra> getListaObstetra() {
		return listaObstetra;
	}

	public void setListaObstetra(List<Obstetra> listaObstetra) {
		this.listaObstetra = listaObstetra;
	}

	public List<Pais> getListaPais() {
		return listaPais;
	}

	public void setListaPais(List<Pais> listaPais) {
		this.listaPais = listaPais;
	}

	public List<Tipo_identificacion> getListaTipo_identificacion() {
		return listaTipo_identificacion;
	}

	public void setListaTipo_identificacion(List<Tipo_identificacion> listaTipo_identificacion) {
		this.listaTipo_identificacion = listaTipo_identificacion;
	}

	public List<Metodo_de_pago> getListaMetodo_de_pago() {
		return listaMetodo_de_pago;
	}

	public void setListaMetodo_de_pago(List<Metodo_de_pago> listaMetodo_de_pago) {
		this.listaMetodo_de_pago = listaMetodo_de_pago;
	}
	
	
}