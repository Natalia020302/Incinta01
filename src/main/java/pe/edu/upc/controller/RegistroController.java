package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Registro;
import pe.edu.upc.service.IRegistroService;


@Named
@RequestScoped
public class RegistroController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IRegistroService uService;
	private Registro registro;
	List<Registro> listaRegistros;
	
	@PostConstruct
	public void init() {
		this.listaRegistros = new ArrayList<Registro>();
		this.registro = new Registro();
		this.listar();
	}

	public String nuevoRegistro() {
		this.setRegistro(new Registro());
		return "usuario.xhtml";
	}
	
	public void insertar() {
		uService.insertar(registro);
		limpiarRegistro();
	}
	
	public void listar() {
		listaRegistros = uService.listar();
	}
	
	public void limpiarRegistro() {
		this.init();
	}
	
	public void eliminar(Registro registro) {
		uService.eliminar(registro.getID_Registro());
	}
	
	
	
	

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public List<Registro> getListaRegistros() {
		return listaRegistros;
	}

	public void setListaRegistros(List<Registro> listaRegistros) {
		this.listaRegistros = listaRegistros;
	}

	public IRegistroService getuService() {
		return uService;
	}

	public void setuService(IRegistroService uService) {
		this.uService = uService;
	}
	

	
	
}