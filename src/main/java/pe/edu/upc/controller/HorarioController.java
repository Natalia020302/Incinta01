package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Horario;
import pe.edu.upc.service.IHorarioService;


@Named
@RequestScoped
public class HorarioController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private IHorarioService uService;
	private Horario horario;
	List<Horario> listaHorario;
	
	@PostConstruct
	public void init() {
		this.listaHorario = new ArrayList<Horario>();
		this.horario = new Horario();
		this.listar();
	}

	public String nuevoHorario() {
		this.setHorario(new Horario());
		return "Horario.xhtml"; //NO IMPLEMENTADO
	}
	
	public void insertar() {
		uService.insertar(horario);
		limpiarHorario();
	}
	
	public void listar() {
		listaHorario = uService.listar();
	}
	
	public void limpiarHorario() {
		this.init();
	}
	
	public void eliminar(Horario horario) {
		uService.eliminar(horario.getID_Horario());
	}
	
	

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario usuario) {
		this.horario = usuario;
	}

	public List<Horario> getListaHorario() {
		return listaHorario;
	}

	public void setListaHorario(List<Horario> listaHorario) {
		this.listaHorario = listaHorario;
	}
	
	//wuenas noches
	
	
}
