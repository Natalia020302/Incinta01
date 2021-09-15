package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Certificados_de_obstetra;
import pe.edu.upc.service.ICertificados_de_obstetraService;


@Named
@RequestScoped
public class Certificados_de_obstetraController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private ICertificados_de_obstetraService uService;
	private Certificados_de_obstetra certificados_de_obstetra;
	List<Certificados_de_obstetra> listaCertificados_de_obstetra;
	
	@PostConstruct
	public void init() {
		this.listaCertificados_de_obstetra = new ArrayList<Certificados_de_obstetra>();
		this.certificados_de_obstetra = new Certificados_de_obstetra();
		//this.listar();
	}


	public String nuevoCertificados_de_obstetra() {
		this.setCertificados_de_obstetra(new Certificados_de_obstetra());
		return "Certificados_de_obstetra.xhtml";
	}
	
	public void insertar() {
		uService.insertar(certificados_de_obstetra);
		limpiarCertificados_de_obstetra();
	}
	
	public void listar() {
		listaCertificados_de_obstetra = uService.listar();
	}
	
	public void limpiarCertificados_de_obstetra() {
		this.init();
	}
	
	public void eliminar(Certificados_de_obstetra certificados_de_obstetra) {
		uService.eliminar(certificados_de_obstetra.getIDCertificado());
	}
	
	
	
	
	

	public Certificados_de_obstetra getCertificados_de_obstetra() {
		return certificados_de_obstetra;
	}

	public void setCertificados_de_obstetra(Certificados_de_obstetra certificados_de_obstetra) {
		this.certificados_de_obstetra = certificados_de_obstetra;
	}

	public List<Certificados_de_obstetra> getListaCertificados_de_obstetra() {
		return listaCertificados_de_obstetra;
	}

	public void setListaCertificados_de_obstetra(List<Certificados_de_obstetra> listaCertificados_de_obstetra) {
		this.listaCertificados_de_obstetra = listaCertificados_de_obstetra;
	}

	
	
	
}
