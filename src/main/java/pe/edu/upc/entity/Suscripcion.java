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

import com.lowagie.text.Image;

@Entity
@Table(name="suscripcion")
public class Suscripcion implements Serializable{

	/* SERIALVERSIONUID */
	
	private static final long serialVersionUID = 1L;
	
	/* ATTRIBUTES */
	/* CONSIDERATIONS: Lower case names and no "_" */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idsuscripcion;
	
	@Column(name="nombresuscripcion", nullable=false, length=40)
	private String nsuscripcion;
	
	private int numcomision;
	
	private int numduracion;
	
	private String tcondiciones;

	/* SUPER CLASS */
	
	public Suscripcion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* CONSTRUCTOR */
	
	public Suscripcion(int idsuscripcion, String nsuscripcion, int numcomision, int numduracion, String tcondiciones) {
		super();
		this.idsuscripcion = idsuscripcion;
		this.nsuscripcion = nsuscripcion;
		this.numcomision = numcomision;
		this.numduracion = numduracion;
		this.tcondiciones = tcondiciones;
	}
	
	/* GETTERS AND SETTERS */

	public int getIdsuscripcion() {
		return idsuscripcion;
	}

	public void setIdsuscripcion(int idsuscripcion) {
		this.idsuscripcion = idsuscripcion;
	}

	public String getNsuscripcion() {
		return nsuscripcion;
	}

	public void setNsuscripcion(String nsuscripcion) {
		this.nsuscripcion = nsuscripcion;
	}

	public int getNumcomision() {
		return numcomision;
	}

	public void setNumcomision(int numcomision) {
		this.numcomision = numcomision;
	}

	public int getNumduracion() {
		return numduracion;
	}

	public void setNumduracion(int numduracion) {
		this.numduracion = numduracion;
	}

	public String getTcondiciones() {
		return tcondiciones;
	}

	public void setTcondiciones(String tcondiciones) {
		this.tcondiciones = tcondiciones;
	}

}