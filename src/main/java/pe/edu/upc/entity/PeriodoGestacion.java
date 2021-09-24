package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PeriodoGestacion")
public class PeriodoGestacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPeriodo;
	
	@ManyToOne
	@JoinColumn(name="usuarioID", nullable=false)
	private Usuario usuarioID;
	
	
	@Column(name="fechaActualizacion", nullable=false)
	private Date fechaActualizacion; 

	@Column(name="semanaGestacion", nullable=false)
	private int numSemanaGestacion;


	public PeriodoGestacion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PeriodoGestacion(int idPeriodo, Usuario usuarioID, Date fechaActualizacion, int numSemanaGestacion) {
		super();
		this.idPeriodo = idPeriodo;
		this.usuarioID = usuarioID;
		this.fechaActualizacion = fechaActualizacion;
		this.numSemanaGestacion = numSemanaGestacion;
	}


	public int getIdPeriodo() {
		return idPeriodo;
	}


	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}


	public Usuario getUsuarioID() {
		return usuarioID;
	}


	public void setUsuarioID(Usuario usuarioID) {
		this.usuarioID = usuarioID;
	}


	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}


	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}


	public int getNumSemanaGestacion() {
		return numSemanaGestacion;
	}


	public void setNumSemanaGestacion(int numSemanaGestacion) {
		this.numSemanaGestacion = numSemanaGestacion;
	}


	


	
	

}
