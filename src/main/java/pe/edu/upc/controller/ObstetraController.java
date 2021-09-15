package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Obstetra;
import pe.edu.upc.service.IObstetraService;


@Named
@RequestScoped
public class ObstetraController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IObstetraService uService;
	private Obstetra obstetra;
	List<Obstetra> listaObstetra;
	
	@PostConstruct
	public void init() {
		this.listaObstetra = new ArrayList<Obstetra>();
		this.obstetra = new Obstetra();
		this.listar();
	}

	public String nuevoObstetra() {
		this.setObstetra(new Obstetra());
		return "Obstetra.xhtml"; //NO IMPLEMENTADO
	}
	
	public void insertar() {
		uService.insertar(obstetra);
		limpiarObstetra();
	}
	
	public void listar() {
		listaObstetra = uService.listar();
	}
	
	public void limpiarObstetra() {
		this.init();
	}
	
	public void eliminar(Obstetra obstetra) {
		uService.eliminar(obstetra.getUsuarioID());
	}

	public Obstetra getObstetra() {
		return obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		this.obstetra = obstetra;
	}

	public List<Obstetra> getListaObstetra() {
		return listaObstetra;
	}

	public void setListaObstetra(List<Obstetra> listaObstetra) {
		this.listaObstetra = listaObstetra;
	}
	
	
}
