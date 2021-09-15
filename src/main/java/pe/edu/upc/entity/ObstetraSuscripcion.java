package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="ObstetraSuscripcion")
public class ObstetraSuscripcion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int FechaInicio; 
	
	
	private Date FechaFin; 
	

	@Id
	@ManyToOne
	@JoinColumn(name="ID_Obstetra", nullable=false)
	private int ID_Obstetra;

	@Id
	@ManyToOne
	@JoinColumn(name="ID_Suscripcion", nullable=false)
	private int ID_Suscripcion;

	public ObstetraSuscripcion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ObstetraSuscripcion(int fechaInicio, Date fechaFin, int iD_Obstetra, int iD_Suscripcion) {
		super();
		FechaInicio = fechaInicio;
		FechaFin = fechaFin;
		ID_Obstetra = iD_Obstetra;
		ID_Suscripcion = iD_Suscripcion;
	}

	public int getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(int fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		FechaFin = fechaFin;
	}

	public int getID_Obstetra() {
		return ID_Obstetra;
	}

	public void setID_Obstetra(int iD_Obstetra) {
		ID_Obstetra = iD_Obstetra;
	}

	public int getID_Suscripcion() {
		return ID_Suscripcion;
	}

	public void setID_Suscripcion(int iD_Suscripcion) {
		ID_Suscripcion = iD_Suscripcion;
	}
	
}
