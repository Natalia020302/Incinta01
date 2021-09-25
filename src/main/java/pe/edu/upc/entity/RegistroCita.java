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
@Table(name="RegistroCita")
public class RegistroCita implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRegistroCita;
	
	@ManyToOne
	@JoinColumn(name="idCita", nullable=false)
	private Cita cita;
	
	@Column(name="tAnotaciones", nullable=true)
	private String tAnotaciones;

	public RegistroCita() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistroCita(int idRegistroCita, Cita cita, String tAnotaciones) {
		super();
		this.idRegistroCita = idRegistroCita;
		this.cita = cita;
		this.tAnotaciones = tAnotaciones;
	}

	public int getIdRegistroCita() {
		return idRegistroCita;
	}

	public void setIdRegistroCita(int idRegistroCita) {
		this.idRegistroCita = idRegistroCita;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public String gettAnotaciones() {
		return tAnotaciones;
	}

	public void settAnotaciones(String tAnotaciones) {
		this.tAnotaciones = tAnotaciones;
	}


}
