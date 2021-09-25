package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Unidad")
public class Unidad implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iDUnidad;
	
	@Column(name="nombreUnidad", nullable=false, length=30)
	private String nUnidad;
	

	public Unidad() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Unidad(int iDUnidad, String nUnidad) {
		super();
		this.iDUnidad = iDUnidad;
		this.nUnidad = nUnidad;
	}


	public int getiDUnidad() {
		return iDUnidad;
	}


	public void setiDUnidad(int iDUnidad) {
		this.iDUnidad = iDUnidad;
	}


	public String getnUnidad() {
		return nUnidad;
	}


	public void setnUnidad(String nUnidad) {
		this.nUnidad = nUnidad;
	}


	


	
}
