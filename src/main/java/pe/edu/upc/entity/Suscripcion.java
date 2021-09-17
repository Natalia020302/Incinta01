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
@Table(name="Suscripcion")
public class Suscripcion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDSuscripcion;
	
	@Column(name="NombreSuscripcion", nullable=false, length=40)
	private String NSuscripcion;
	
	private int NumComision;
	
	private int NumDuracion;
	
	private String TCondiciones;

	public Suscripcion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Suscripcion(int iDSuscripcion, String nSuscripcion, int numComision, int numDuracion, String tCondiciones) {
		super();
		IDSuscripcion = iDSuscripcion;
		NSuscripcion = nSuscripcion;
		NumComision = numComision;
		NumDuracion = numDuracion;
		TCondiciones = tCondiciones;
	}

	public int getIDSuscripcion() {
		return IDSuscripcion;
	}

	public void setIDSuscripcion(int iDSuscripcion) {
		IDSuscripcion = iDSuscripcion;
	}

	public String getNSuscripcion() {
		return NSuscripcion;
	}

	public void setNSuscripcion(String nSuscripcion) {
		NSuscripcion = nSuscripcion;
	}

	public int getNumComision() {
		return NumComision;
	}

	public void setNumComision(int numComision) {
		NumComision = numComision;
	}

	public int getNumDuracion() {
		return NumDuracion;
	}

	public void setNumDuracion(int numDuracion) {
		NumDuracion = numDuracion;
	}

	public String getTCondiciones() {
		return TCondiciones;
	}

	public void setTCondiciones(String tCondiciones) {
		TCondiciones = tCondiciones;
	}
	

}