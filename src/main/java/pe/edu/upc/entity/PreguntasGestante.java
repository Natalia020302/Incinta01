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
@Table(name="PreguntasGestante")
public class PreguntasGestante implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDPregunta; 
	
	
	
	
	private String TPregunta;
	
	private Date Fecha;
	
	
	@Id
	@ManyToOne
	@JoinColumn(name="IDGestante", nullable=false)
	private int IDGestante;


	public PreguntasGestante() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PreguntasGestante(int iDPregunta, String tPregunta, Date fecha, int iDGestante) {
		super();
		IDPregunta = iDPregunta;
		TPregunta = tPregunta;
		Fecha = fecha;
		IDGestante = iDGestante;
	}


	public int getIDPregunta() {
		return IDPregunta;
	}


	public void setIDPregunta(int iDPregunta) {
		IDPregunta = iDPregunta;
	}


	public String getTPregunta() {
		return TPregunta;
	}


	public void setTPregunta(String tPregunta) {
		TPregunta = tPregunta;
	}


	public Date getFecha() {
		return Fecha;
	}


	public void setFecha(Date fecha) {
		Fecha = fecha;
	}


	public int getIDGestante() {
		return IDGestante;
	}


	public void setIDGestante(int iDGestante) {
		IDGestante = iDGestante;
	}




	
}
