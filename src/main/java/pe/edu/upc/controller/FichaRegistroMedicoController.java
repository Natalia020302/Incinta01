package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.FichaRegistroMedico;
import pe.edu.upc.service.IFichaRegistroMedicoService;


@Named
@RequestScoped
public class FichaRegistroMedicoController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IFichaRegistroMedicoService uService;
	private FichaRegistroMedico frm;
	List<FichaRegistroMedico> listaFichaRegistroMedico;
	
	@PostConstruct
	public void init() {
		this.listaFichaRegistroMedico = new ArrayList<FichaRegistroMedico>();
		this.frm = new FichaRegistroMedico();
		this.listar();
	}

	public String nuevoFichaRegistroMedico() {
		this.setFichaRegistroMedico(new FichaRegistroMedico());
		return "FRM.xhtml"; //NO IMPLEMENTADO
	}
	
	public void insertar() {
		uService.insertar(frm);
		limpiarFichaRegistroMedico();
	}
	
	public void listar() {
		listaFichaRegistroMedico = uService.listar();
	}
	
	public void limpiarFichaRegistroMedico() {
		this.init();
	}
	
	public void eliminar(FichaRegistroMedico frm) {
		uService.eliminar(frm.getIdFicha());
	}

	public FichaRegistroMedico getFichaRegistroMedico() {
		return frm;
	}

	public void setFichaRegistroMedico(FichaRegistroMedico frm) {
		this.frm = frm;
	}

	public List<FichaRegistroMedico> getListaFichaRegistroMedico() {
		return listaFichaRegistroMedico;
	}

	public void setListaFichaRegistroMedico(List<FichaRegistroMedico> listaFichaRegistroMedico) {
		this.listaFichaRegistroMedico = listaFichaRegistroMedico;
	}
	
	
	
}
