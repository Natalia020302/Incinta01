package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cita;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.HorarioCitasObstetras;

import pe.edu.upc.service.ICitaService;
import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IHorarioCitasObstetrasService;


@Named
@RequestScoped
public class CitaController implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ICitaService cService;
	@Inject
	private IUsuarioService uService;
	@Inject
	private IHorarioCitasObstetrasService hService;
	
	
	private Cita cita;
	private Usuario usuario;
	private HorarioCitasObstetras horarioCitasObstetras;
	
	List<Cita> listaCita;
	List<Usuario> listaUsuario;
	List<HorarioCitasObstetras> listaHorarioCitasObstetras;
	
	@PostConstruct
	public void init() {
		this.listaCita = new ArrayList<Cita>();
		this.listaUsuario = new ArrayList<Usuario>();
		this.listaHorarioCitasObstetras = new ArrayList<HorarioCitasObstetras>();
		
		this.cita = new Cita();
		this.usuario = new Usuario();
		this.horarioCitasObstetras = new HorarioCitasObstetras();
		
		this.listarCitas();
		this.listarUsuarios();
		this.listarHorarios();
		
		
	}

	public String nuevoCita() {
		this.setCita(new Cita());
		return "Cita.xhtml";
	}
	
	public void insertar() {
		cService.insertar(cita);
		limpiarCita();
		this.listarCitas();
	}
	
	public void listarCitas() {
		listaCita = cService.listar();
	}
	public void listarUsuarios() {
		listaUsuario = uService.listar();
	}

	public void listarHorarios() {
		listaHorarioCitasObstetras = hService.listar();
	}


	public void limpiarCita() {
		this.init();
	}
	
	public void eliminar(Cita cita) {
		cService.eliminar(cita.getIdCita());
	}





	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public HorarioCitasObstetras getHorarioCitasObstetras() {
		return horarioCitasObstetras;
	}

	public void setHorarioCitasObstetras(HorarioCitasObstetras horarioCitasObstetras) {
		this.horarioCitasObstetras = horarioCitasObstetras;
	}

	public List<Cita> getListaCita() {
		return listaCita;
	}

	public void setListaCita(List<Cita> listaCita) {
		this.listaCita = listaCita;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public List<HorarioCitasObstetras> getListaHorarioCitasObstetras() {
		return listaHorarioCitasObstetras;
	}

	public void setListaHorarioCitasObstetras(List<HorarioCitasObstetras> listaHorarioCitasObstetras) {
		this.listaHorarioCitasObstetras = listaHorarioCitasObstetras;
	}

	




	
	
}