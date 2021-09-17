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
	private int IDUnidad;
	
	@Column(name="NombreUnidad", nullable=false, length=30)
	private String NUnidad;
	

	public Unidad() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Unidad(int iDUnidad, String nUnidad) {
		super();
		IDUnidad = iDUnidad;
		NUnidad = nUnidad;
	}


	public int getIDUnidad() {
		return IDUnidad;
	}


	public void setIDUnidad(int iDUnidad) {
		IDUnidad = iDUnidad;
	}


	public String getNUnidad() {
		return NUnidad;
	}


	public void setNUnidad(String nUnidad) {
		NUnidad = nUnidad;
	}


	






	

}
