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
//holiiiiiii
@Entity
@Table(name="Certificados_de_obstetra")
public class Certificados_de_obstetra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name="IDCertificado", nullable=false)
	private int IDCertificado;
	
	@ManyToOne
	@JoinColumn(name="ID_TipoIdentificacion", nullable=false)
	private int ID_Obstetra;
	
	
	private String TDescripcion;


	public Certificados_de_obstetra() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Certificados_de_obstetra(int iDCertificado, int iD_Obstetra, String tDescripcion) {
		super();
		IDCertificado = iDCertificado;
		ID_Obstetra = iD_Obstetra;
		TDescripcion = tDescripcion;
	}


	public int getIDCertificado() {
		return IDCertificado;
	}


	public void setIDCertificado(int iDCertificado) {
		IDCertificado = iDCertificado;
	}


	public int getID_Obstetra() {
		return ID_Obstetra;
	}


	public void setID_Obstetra(int iD_Obstetra) {
		ID_Obstetra = iD_Obstetra;
	}


	public String getTDescripcion() {
		return TDescripcion;
	}


	public void setTDescripcion(String tDescripcion) {
		TDescripcion = tDescripcion;
	}
	
	

	

}
