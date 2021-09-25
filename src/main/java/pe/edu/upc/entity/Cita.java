package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cita")
public class Cita implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCita;
	
	@ManyToOne
	@JoinColumn(name="idHorarioCita", nullable=false)
	private HorarioCitasObstetra horarioCitasObstetra;
	
	@ManyToOne
	@JoinColumn(name="usuarioID", nullable=false)
	private Usuario usuario;

	private int numValoracion;

	public Cita() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cita(int idCita, HorarioCitasObstetra horarioCitasObstetra, Usuario usuario, int numValoracion) {
		super();
		this.idCita = idCita;
		this.horarioCitasObstetra = horarioCitasObstetra;
		this.usuario = usuario;
		this.numValoracion = numValoracion;
	}

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public HorarioCitasObstetra getHorarioCitasObstetra() {
		return horarioCitasObstetra;
	}

	public void setHorarioCitasObstetra(HorarioCitasObstetra horarioCitasObstetra) {
		this.horarioCitasObstetra = horarioCitasObstetra;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getNumValoracion() {
		return numValoracion;
	}

	public void setNumValoracion(int numValoracion) {
		this.numValoracion = numValoracion;
	}



}
