package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Suscripcion")
public class Suscripcion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SuscripcionID;
	
	@Column(name="NombreSuscripcion", nullable=false, length=40)
	private String NombreSuscripcion;
	
	private int Duracion;	

	public Suscripcion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSuscripcionID() {
		return SuscripcionID;
	}

	public void setSuscripcionID(int suscripcionID) {
		SuscripcionID = suscripcionID;
	}

	public String getNombreSuscripcion() {
		return NombreSuscripcion;
	}

	public void setNombreSuscripcion(String nombreSuscripcion) {
		NombreSuscripcion = nombreSuscripcion;
	}

	public int getDuracion() {
		return Duracion;
	}

	public void setDuracion(int duracion) {
		Duracion = duracion;
	}

	public Suscripcion(int suscripcionID, String nombreSuscripcion, int duracion) {
		super();
		SuscripcionID = suscripcionID;
		NombreSuscripcion = nombreSuscripcion;
		Duracion = duracion;
	}
	

}
