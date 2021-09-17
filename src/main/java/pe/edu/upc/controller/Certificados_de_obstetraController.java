package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Certificados_de_obstetra;
import pe.edu.upc.entity.Tipo_certificado;
import pe.edu.upc.entity.Obstetra;

import pe.edu.upc.service.ICertificados_de_obstetraService;
import pe.edu.upc.service.ITipo_certificadoService;
import pe.edu.upc.service.IObstetraService;


@Named
@RequestScoped
public class Certificados_de_obstetraController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private ICertificados_de_obstetraService uService;
	@Inject
	private ITipo_certificadoService tcService;
	@Inject
	private IObstetraService oService;
	
	private Certificados_de_obstetra Certificados_de_obstetra;
	private Tipo_certificado Tipo_certificado;
	private Obstetra Obstetra;
	
	List<Certificados_de_obstetra> listaCertificados_de_obstetra;
	List<Tipo_certificado> listaTipo_certificado;
	List<Obstetra> listaObstetra;
	
	@PostConstruct
	public void init() {
		this.listaCertificados_de_obstetra = new ArrayList<Certificados_de_obstetra>();
		this.listaTipo_certificado = new ArrayList<Tipo_certificado>();
		this.listaObstetra = new ArrayList<Obstetra>();
		
		this.Certificados_de_obstetra = new Certificados_de_obstetra();
		this.Tipo_certificado = new Tipo_certificado();
		this.Obstetra = new Obstetra();
		
		this.listar();
		this.listarTipo_certificado();
		this.listarObstetra();
	}

	public String nuevoUsuario() {
		this.setCertificados_de_obstetra(new Certificados_de_obstetra());
		return "Certificados_de_obstetra.xhtml";
	}
	
	public void insertar() {
		uService.insertar(Certificados_de_obstetra);
		limpiarCertificados_de_obstetra();
	}
	
	public void listar() {
		listaCertificados_de_obstetra = uService.listar();
	}
	
	public void listarTipo_certificado() {
		listaTipo_certificado = tcService.listar();
	}
	
	public void listarObstetra() {
		listaObstetra = oService.listar();
	}
	
	public void limpiarCertificados_de_obstetra() {
		this.init();
	}
	
	public void eliminar(Certificados_de_obstetra co) {
		uService.eliminar(co.getIDCertificado(),co.getIDObstetra());
	}

	public ITipo_certificadoService getTcService() {
		return tcService;
	}

	public void setTcService(ITipo_certificadoService tcService) {
		this.tcService = tcService;
	}

	public IObstetraService getoService() {
		return oService;
	}

	public void setoService(IObstetraService oService) {
		this.oService = oService;
	}

	public Certificados_de_obstetra getCertificados_de_obstetra() {
		return Certificados_de_obstetra;
	}

	public void setCertificados_de_obstetra(Certificados_de_obstetra certificados_de_obstetra) {
		Certificados_de_obstetra = certificados_de_obstetra;
	}

	public Tipo_certificado getTipo_certificado() {
		return Tipo_certificado;
	}

	public void setTipo_certificado(Tipo_certificado tipo_certificado) {
		Tipo_certificado = tipo_certificado;
	}

	public Obstetra getObstetra() {
		return Obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		Obstetra = obstetra;
	}

	public List<Certificados_de_obstetra> getListaCertificados_de_obstetra() {
		return listaCertificados_de_obstetra;
	}

	public void setListaCertificados_de_obstetra(List<Certificados_de_obstetra> listaCertificados_de_obstetra) {
		this.listaCertificados_de_obstetra = listaCertificados_de_obstetra;
	}

	public List<Tipo_certificado> getListaTipo_certificado() {
		return listaTipo_certificado;
	}

	public void setListaTipo_certificado(List<Tipo_certificado> listaTipo_certificado) {
		this.listaTipo_certificado = listaTipo_certificado;
	}

	public List<Obstetra> getListaObstetra() {
		return listaObstetra;
	}

	public void setListaObstetra(List<Obstetra> listaObstetra) {
		this.listaObstetra = listaObstetra;
	}

	
}