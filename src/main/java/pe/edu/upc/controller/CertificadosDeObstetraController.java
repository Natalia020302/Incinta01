package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CertificadosDeObstetra;
import pe.edu.upc.entity.TipoCertificado;
import pe.edu.upc.entity.Obstetra;

import pe.edu.upc.service.ICertificadosDeObstetraService;
import pe.edu.upc.service.ITipoCertificadoService;
import pe.edu.upc.service.IObstetraService;

@Named
@RequestScoped
public class CertificadosDeObstetraController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICertificadosDeObstetraService uService;
	@Inject
	private ITipoCertificadoService aService;
	@Inject
	private IObstetraService bService;

	private CertificadosDeObstetra certificadosdeobstetra;
	private TipoCertificado tipocertificado;
	private Obstetra obstetra;
	
	List<CertificadosDeObstetra> listacertificadosdeobstetra;
	List<TipoCertificado> listacertificados;
	List<Obstetra> listaobstetra;
	
	@PostConstruct
	public void init() {
		this.listacertificadosdeobstetra = new ArrayList<CertificadosDeObstetra>();
		this.listacertificados = new ArrayList<TipoCertificado>();
		this.listaobstetra = new ArrayList<Obstetra>();
		
		this.certificadosdeobstetra = new CertificadosDeObstetra();
		this.tipocertificado = new TipoCertificado();
		this.obstetra = new Obstetra();
		
		this.listar();
		this.listarTipoCertificado();
		this.listarObstetra();
	}

	public String nuevoObstetra() {
		this.setCertificadosdeobstetra(new CertificadosDeObstetra());
		return "CertificadosDeObstetra.xhtml";
	}
	
	public void insertar() {
		uService.insertar(certificadosdeobstetra);
		limpiarCertificadosDeObstetra();
	}
	
	public void listar() {
		listacertificadosdeobstetra = uService.listar();
	}
	
	public void listarTipoCertificado() {
		listacertificados = aService.listar();
	}
	
	public void listarObstetra() {
		listaobstetra = bService.listar();
	}
	
	public void limpiarCertificadosDeObstetra() {
		this.init();
	}
	
	public void eliminar(CertificadosDeObstetra certificadosdeobstetra) {
		uService.eliminar(certificadosdeobstetra.getIdcertificadoobstetra());
	}	/* GETTERS AND SETTERS */

	public ICertificadosDeObstetraService getuService() {
		return uService;
	}

	public void setuService(ICertificadosDeObstetraService uService) {
		this.uService = uService;
	}

	public ITipoCertificadoService getaService() {
		return aService;
	}

	public void setaService(ITipoCertificadoService aService) {
		this.aService = aService;
	}

	public IObstetraService getbService() {
		return bService;
	}

	public void setbService(IObstetraService bService) {
		this.bService = bService;
	}

	public CertificadosDeObstetra getCertificadosdeobstetra() {
		return certificadosdeobstetra;
	}

	public void setCertificadosdeobstetra(CertificadosDeObstetra certificadosdeobstetra) {
		this.certificadosdeobstetra = certificadosdeobstetra;
	}

	public TipoCertificado getTipocertificado() {
		return tipocertificado;
	}

	public void setTipocertificado(TipoCertificado tipocertificado) {
		this.tipocertificado = tipocertificado;
	}

	public Obstetra getObstetra() {
		return obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		this.obstetra = obstetra;
	}

	public List<CertificadosDeObstetra> getListacertificadosdeobstetra() {
		return listacertificadosdeobstetra;
	}

	public void setListacertificadosdeobstetra(List<CertificadosDeObstetra> listacertificadosdeobstetra) {
		this.listacertificadosdeobstetra = listacertificadosdeobstetra;
	}

	public List<TipoCertificado> getListacertificados() {
		return listacertificados;
	}

	public void setListacertificados(List<TipoCertificado> listacertificados) {
		this.listacertificados = listacertificados;
	}

	public List<Obstetra> getListaobstetra() {
		return listaobstetra;
	}

	public void setListaobstetra(List<Obstetra> listaobstetra) {
		this.listaobstetra = listaobstetra;
	}
	
}