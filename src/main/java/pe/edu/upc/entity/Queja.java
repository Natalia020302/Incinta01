package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Queja")
public class Queja implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idQueja;
	
	@ManyToOne
	@JoinColumn(name="idCita", nullable=false)
	private Cita cita;
	
	private String tQueja;

	public Queja() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Queja(int idQueja, Cita cita, String tQueja) {
		super();
		this.idQueja = idQueja;
		this.cita = cita;
		this.tQueja = tQueja;
	}

	public int getIdQueja() {
		return idQueja;
	}

	public void setIdQueja(int idQueja) {
		this.idQueja = idQueja;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public String gettQueja() {
		return tQueja;
	}

	public void settQueja(String tQueja) {
		this.tQueja = tQueja;
	}

}
