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
	private int IDParametro;
	
	
	@Column(name="Parametro", nullable=false, length=30)
	private String NParametro;


	@ManyToOne
	@JoinColumn(name="IDUnidad", nullable=false)
	private int IDUnidad;


	public Parametro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Parametro(int iDParametro, String nParametro, int iDUnidad) {
		super();
		IDParametro = iDParametro;
		NParametro = nParametro;
		IDUnidad = iDUnidad;
	}


	public int getIDParametro() {
		return IDParametro;
	}


	public void setIDParametro(int iDParametro) {
		IDParametro = iDParametro;
	}


	public String getNParametro() {
		return NParametro;
	}


	public void setNParametro(String nParametro) {
		NParametro = nParametro;
	}


	public int getIDUnidad() {
		return IDUnidad;
	}


	public void setIDUnidad(int iDUnidad) {
		IDUnidad = iDUnidad;
	}


	

	

}
