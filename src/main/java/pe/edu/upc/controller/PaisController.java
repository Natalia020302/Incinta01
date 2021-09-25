package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Pais;
import pe.edu.upc.service.IPaisService;


@Named
@RequestScoped
public class PaisController implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IPaisService uService;
	private Pais pais;
	List<Pais> listaPais;
	
	@PostConstruct
	public void init() {
		this.listaPais = new ArrayList<Pais>();
		this.pais = new Pais();
		this.listar();
	}
	
	
	
	
	

	public String nuevoPais() {
		this.setPais(new Pais());
		return "pais.xhtml";
	}
	
	public void insertar() {
		uService.insertar(pais);
		limpiarPais();
	}
	
	public void listar() {
		listaPais = uService.listar();
	}
	
	public void limpiarPais() {
		this.init();
	}
	
	public void eliminar(Pais pais) {
		uService.eliminar(pais.getIdPais());
	}

	
	
	
	
	
	
	
	
	

	
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Pais> getListaPais() {
		return listaPais;
	}

	public void setListaPais(List<Pais> listaPais) {
		this.listaPais = listaPais;
	}
	
	
	
	
	
}