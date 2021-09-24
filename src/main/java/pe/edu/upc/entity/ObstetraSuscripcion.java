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
@Table(name="obstetrasuscripcion")
public class ObstetraSuscripcion implements Serializable{

	/* SERIALVERSIONUID */
	
	private static final long serialVersionUID = 1L;
	
	/* ATTRIBUTES */
	/* CONSIDERATIONS: Lower case names and no "_" */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idobstetrasuscripcion;
	
	@ManyToOne
	@JoinColumn(name="idobstetra", nullable=false)
	private Obstetra obstetra;
	
	@ManyToOne
	@JoinColumn(name="idosuscripcion", nullable=false)
	private Suscripcion suscripcion;
	
	private Date fechainicio;

	/* SUPER CLASS */

	public ObstetraSuscripcion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* CONSTRUCTOR */
	
	public ObstetraSuscripcion(int idobstetrasuscripcion, Obstetra obstetra, Date fechainicio) {
		super();
		this.idobstetrasuscripcion = idobstetrasuscripcion;
		this.obstetra = obstetra;
		this.fechainicio = fechainicio;
	}

	/* GETTERS AND SETTERS */
	
	public int getIdobstetrasuscripcion() {
		return idobstetrasuscripcion;
	}

	public void setIdobstetrasuscripcion(int idobstetrasuscripcion) {
		this.idobstetrasuscripcion = idobstetrasuscripcion;
	}

	public Obstetra getObstetra() {
		return obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		this.obstetra = obstetra;
	}

	public Date getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

}