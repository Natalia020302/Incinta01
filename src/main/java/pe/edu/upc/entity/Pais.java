package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pais")
public class Pais implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Pais;
	
	@Column(name="NombrePais", nullable=false, length=30)
	private String NPais;
	

	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pais(int iD_Pais, String nPais) {
		super();
		ID_Pais = iD_Pais;
		NPais = nPais;
	}


	public int getID_Pais() {
		return ID_Pais;
	}


	public void setID_Pais(int iD_Pais) {
		ID_Pais = iD_Pais;
	}


	public String getNPais() {
		return NPais;
	}


	public void setNPais(String nPais) {
		NPais = nPais;
	}
	
	
	
	






	

}
