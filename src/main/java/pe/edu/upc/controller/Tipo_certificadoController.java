package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Tipo_certificado;
import pe.edu.upc.service.ITipo_certificadoService;


@Named
@RequestScoped
public class Tipo_certificadoController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private ITipo_certificadoService uService;
	private Tipo_certificado tipo_certificado;
	List<Tipo_certificado> listaTipo_certificado;
	
	@PostConstruct
	public void init() {
		this.listaTipo_certificado = new ArrayList<Tipo_certificado>();
		this.tipo_certificado = new Tipo_certificado();
		this.listar();
	}

	public String nuevoUsuario() {
		this.setTipo_certificado(new Tipo_certificado());
		return "Tipo_certificado.xhtml";
	}
	
	public void insertar() {
		uService.insertar(tipo_certificado);
		limpiarTipo_certificado();
	}
	
	public void listar() {
		listaTipo_certificado = uService.listar();
	}
	
	public void limpiarTipo_certificado() {
		this.init();
	}
	
	public void eliminar(Tipo_certificado tipo_certificado) {
		uService.eliminar(tipo_certificado.getIDCertificado());
	}

	public Tipo_certificado getTipo_certificado() {
		return tipo_certificado;
	}

	public void setTipo_certificado(Tipo_certificado tipo_certificado) {
		this.tipo_certificado = tipo_certificado;
	}

	public List<Tipo_certificado> getListaTipo_certificado() {
		return listaTipo_certificado;
	}

	public void setListaTipo_certificado(List<Tipo_certificado> listaTipo_certificado) {
		this.listaTipo_certificado = listaTipo_certificado;
	}

	public ITipo_certificadoService getuService() {
		return uService;
	}

	public void setuService(ITipo_certificadoService uService) {
		this.uService = uService;
	}
	
	
	
}