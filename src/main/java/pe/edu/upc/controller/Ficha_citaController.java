package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Ficha_cita;
import pe.edu.upc.service.IFicha_citaService;


@Named
@RequestScoped
public class Ficha_citaController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IFicha_citaService uService;
	private Ficha_cita fc;
	List<Ficha_cita> listafc;
	
	@PostConstruct
	public void init() {
		this.listafc = new ArrayList<Ficha_cita>();
		this.fc = new Ficha_cita();
		this.listar();
	}

	public String nuevoFicha_cita() {
		this.setFc(new Ficha_cita());
		return "Ficha_cita.xhtml"; //NO IMPLEMENTADO
	}
	
	public void insertar() {
		uService.insertar(fc);
		limpiarFicha_cita();
	}
	
	public void listar() {
		listafc = uService.listar();
	}
	
	public void limpiarFicha_cita() {
		this.init();
	}
	
	public void eliminar(Ficha_cita fc) {
		uService.eliminar(fc.getIdFicha());
	}

	public Ficha_cita getFc() {
		return fc;
	}

	public void setFc(Ficha_cita fc) {
		this.fc = fc;
	}

	public List<Ficha_cita> getListafc() {
		return listafc;
	}

	public void setListafc(List<Ficha_cita> listafc) {
		this.listafc = listafc;
	}

	
}
