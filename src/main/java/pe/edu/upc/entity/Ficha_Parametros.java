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
@Table(name="Ficha_Parametros")
public class Ficha_Parametros implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name="IDParametro", nullable=false)
	private int IDParametro;
	
	@Id
	@ManyToOne
	@JoinColumn(name="ID_RegistroCita", nullable=false)
	private int ID_RegistroCita;
	
	
	private int NumValor;


	public Ficha_Parametros() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ficha_Parametros(int iDParametro, int iD_RegistroCita, int numValor) {
		super();
		IDParametro = iDParametro;
		ID_RegistroCita = iD_RegistroCita;
		NumValor = numValor;
	}


	public int getIDParametro() {
		return IDParametro;
	}


	public void setIDParametro(int iDParametro) {
		IDParametro = iDParametro;
	}


	public int getID_RegistroCita() {
		return ID_RegistroCita;
	}


	public void setID_RegistroCita(int iD_RegistroCita) {
		ID_RegistroCita = iD_RegistroCita;
	}


	public int getNumValor() {
		return NumValor;
	}


	public void setNumValor(int numValor) {
		NumValor = numValor;
	}
	
	

}
