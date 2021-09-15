package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Identificacion")
public class Dia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Dia;
	
	@Column(name="NombreDia", nullable=false, length=30)
	private String NDia;
	

	public Dia() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dia(int iD_Dia, String nDia) {
		super();
		ID_Dia = iD_Dia;
		NDia = nDia;
	}


	public int getID_Dia() {
		return ID_Dia;
	}


	public void setID_Dia(int iD_Dia) {
		ID_Dia = iD_Dia;
	}


	public String getNDia() {
		return NDia;
	}


	public void setNDia(String nDia) {
		NDia = nDia;
	}


	

	


	





	

}
