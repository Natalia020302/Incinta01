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
@Table(name="Parametro")
public class Parametro implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iDParametro;
	
	
	@Column(name="parametro", nullable=false, length=30)
	private String nParametro;


	@ManyToOne
	@JoinColumn(name="iDUnidad", nullable=false)
	private Unidad iDUnidad;


	public Parametro() {
		super();
	}


	public Parametro(int iDParametro, String nParametro, Unidad iDUnidad) {
		super();
		this.iDParametro = iDParametro;
		this.nParametro = nParametro;
		this.iDUnidad = iDUnidad;
	}


	public int getiDParametro() {
		return iDParametro;
	}


	public void setiDParametro(int iDParametro) {
		this.iDParametro = iDParametro;
	}


	public String getnParametro() {
		return nParametro;
	}


	public void setnParametro(String nParametro) {
		this.nParametro = nParametro;
	}


	public Unidad getiDUnidad() {
		return iDUnidad;
	}


	public void setiDUnidad(Unidad iDUnidad) {
		this.iDUnidad = iDUnidad;
	}


	


	

}
