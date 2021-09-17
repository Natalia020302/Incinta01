package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PeriodoGestacion")
public class PeriodoGestacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	

	@Id
	@ManyToOne
	@JoinColumn(name="UsuarioID", nullable=false)
	private int UsuarioID;
	
	@Id
	@Column(name="Fecha_Actualizacion", nullable=false)
	private Date Fecha_Actualizacion; 

	@Column(name="Semana_Gestacion", nullable=false)
	private int NumSemanaGestacion;


	public PeriodoGestacion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PeriodoGestacion(int usuarioID, Date fecha_Actualizacion, int numSemanaGestacion) {
		super();
		UsuarioID = usuarioID;
		Fecha_Actualizacion = fecha_Actualizacion;
		NumSemanaGestacion = numSemanaGestacion;
	}


	public int getUsuarioID() {
		return UsuarioID;
	}


	public void setUsuarioID(int usuarioID) {
		UsuarioID = usuarioID;
	}


	public Date getFecha_Actualizacion() {
		return Fecha_Actualizacion;
	}


	public void setFecha_Actualizacion(Date fecha_Actualizacion) {
		Fecha_Actualizacion = fecha_Actualizacion;
	}


	public int getNumSemanaGestacion() {
		return NumSemanaGestacion;
	}


	public void setNumSemanaGestacion(int numSemanaGestacion) {
		NumSemanaGestacion = numSemanaGestacion;
	}



	

}
