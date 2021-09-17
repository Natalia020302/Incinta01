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
@Table(name="Registro")
public class Registro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Registro;
	

	@ManyToOne
	@JoinColumn(name="UsuarioID", nullable=false)
	private int UsuarioID;


	@Column(name="Fecha", nullable=false)
	private Date Fecha_ficha;
	
	@Column(name="Anotaciones", nullable=true)
	private String T_Anotaciones; 
	
	@ManyToOne
	@JoinColumn(name="IDParametro", nullable=false)
	private int IDParametro;

	
	@Column(name="Valor", nullable=false)
	private int NumValor;


	public Registro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Registro(int iD_Registro, int usuarioID, Date fecha_ficha, String t_Anotaciones, int iDParametro,
			int numValor) {
		super();
		ID_Registro = iD_Registro;
		UsuarioID = usuarioID;
		Fecha_ficha = fecha_ficha;
		T_Anotaciones = t_Anotaciones;
		IDParametro = iDParametro;
		NumValor = numValor;
	}


	public int getID_Registro() {
		return ID_Registro;
	}


	public void setID_Registro(int iD_Registro) {
		ID_Registro = iD_Registro;
	}


	public int getUsuarioID() {
		return UsuarioID;
	}


	public void setUsuarioID(int usuarioID) {
		UsuarioID = usuarioID;
	}


	public Date getFecha_ficha() {
		return Fecha_ficha;
	}


	public void setFecha_ficha(Date fecha_ficha) {
		Fecha_ficha = fecha_ficha;
	}


	public String getT_Anotaciones() {
		return T_Anotaciones;
	}


	public void setT_Anotaciones(String t_Anotaciones) {
		T_Anotaciones = t_Anotaciones;
	}


	public int getIDParametro() {
		return IDParametro;
	}


	public void setIDParametro(int iDParametro) {
		IDParametro = iDParametro;
	}


	public int getNumValor() {
		return NumValor;
	}


	public void setNumValor(int numValor) {
		NumValor = numValor;
	}


	


	



	

}
