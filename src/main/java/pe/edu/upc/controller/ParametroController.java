package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Parametro;
import pe.edu.upc.service.IParametroService;


@Named
@RequestScoped
public class ParametroController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IParametroService paraService;
	private Parametro parametro;
	List<Parametro> listaParametros;
	
	@PostConstruct
	public void init() {
		this.listaParametros = new ArrayList<Parametro>();
		this.parametro = new Parametro();
		this.listar();
	}

	public String nuevoParametro() {
		this.setParametro(new Parametro());
		return "usuario.xhtml";
	} 
	
	public void insertar() {
		paraService.insertar(parametro);
		limpiarParametro();
	}
	
	public void listar() {
		listaParametros = paraService.listar();
	}
	
	public void limpiarParametro() {
		this.init();
	}
	
	public void eliminar(Parametro parametro) {
		paraService.eliminar(parametro.getIDParametro());
	}
	
	

	public Parametro getParametro() {
		return parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}

	public List<Parametro> getListaParametros() {
		return listaParametros;
	}

	public void setListaParametros(List<Parametro> listaParametros) {
		this.listaParametros = listaParametros;
	}
	
	
	
	
}