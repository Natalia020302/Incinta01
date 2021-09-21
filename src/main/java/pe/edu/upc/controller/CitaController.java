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
import pe.edu.upc.entity.Horario_Citas_Obstetra;

import pe.edu.upc.service.ICitaService;
import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IHorario_Citas_ObstetraService;


@Named
@RequestScoped
public class CitaController implements Serializable {

	private static final long serialVersionUID = -94864798955465036L;

	@Inject
	private ICitaService uService;
	@Inject
	private IUsuarioService usService;
	@Inject
	private IHorario_Citas_ObstetraService hcoService;
	
	
	private Cita cita;
	private Usuario usuario;
	private Horario_Citas_Obstetra horario_Citas_Obstetra;
	
	
	List<Cita> listaCita;
	List<Usuario> listaUsuario;
	List<Horario_Citas_Obstetra> listaHorario_Citas_Obstetra;
	
	@PostConstruct
	public void init() {
		this.listaCita = new ArrayList<Cita>();
		this.listaUsuario = new ArrayList<Usuario>();
		this.listaHorario_Citas_Obstetra = new ArrayList<Horario_Citas_Obstetra>();
		
		this.cita = new Cita();
		this.usuario = new Usuario();
		this.horario_Citas_Obstetra = new Horario_Citas_Obstetra();
		
		
		this.listar();
		this.listarUsuario();
		this.listarHorario_Citas_Obstetra();
		
		
	}

	public String nuevoCita() {
		this.setCita(new Cita());
		return "Cita.xhtml";
	}
	
	public void insertar() {
		uService.insertar(cita);
		limpiarCita();
	}
	
	public void listar() {
		listaCita = uService.listar();
	}
	public void listarUsuario() {
		listaUsuario = usService.listar();
	}
	public void listarHorario_Citas_Obstetra() {
		listaHorario_Citas_Obstetra = hcoService.listar();
	}
	
	public void limpiarCita() {
		this.init();
	}
	
	public void eliminar(Cita cita) {
		uService.eliminar(cita.getID_HorarioCita());
	}

	public ICitaService getuService() {
		return uService;
	}

	public void setuService(ICitaService uService) {
		this.uService = uService;
	}

	public IUsuarioService getUsService() {
		return usService;
	}

	public void setUsService(IUsuarioService usService) {
		this.usService = usService;
	}

	public IHorario_Citas_ObstetraService getHcoService() {
		return hcoService;
	}

	public void setHcoService(IHorario_Citas_ObstetraService hcoService) {
		this.hcoService = hcoService;
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

	public Horario_Citas_Obstetra getHorario_Citas_Obstetra() {
		return horario_Citas_Obstetra;
	}

	public void setHorario_Citas_Obstetra(Horario_Citas_Obstetra horario_Citas_Obstetra) {
		this.horario_Citas_Obstetra = horario_Citas_Obstetra;
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

	public List<Horario_Citas_Obstetra> getListaHorario_Citas_Obstetra() {
		return listaHorario_Citas_Obstetra;
	}

	public void setListaHorario_Citas_Obstetra(List<Horario_Citas_Obstetra> listaHorario_Citas_Obstetra) {
		this.listaHorario_Citas_Obstetra = listaHorario_Citas_Obstetra;
	}

	
	
	
}