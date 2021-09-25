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
@Table(name="tipocertificado")
public class TipoCertificado implements Serializable{

	/* SERIALVERSIONUID */
	
	private static final long serialVersionUID = 1L;
	
	/* ATTRIBUTES */
	/* CONSIDERATIONS: Lower case names and no "_" */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcertificado;
	
	@Column(name="nombrecertificado", nullable=false, length=30)
	private String ncertificado;

	/* SUPER CLASS */

	public TipoCertificado() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* CONSTRUCTOR */
	
	public TipoCertificado(int idcertificado, String ncertificado) {
		super();
		this.idcertificado = idcertificado;
		this.ncertificado = ncertificado;
	}

	/* GETTERS AND SETTERS */
	
	public int getIdcertificado() {
		return idcertificado;
	}

	public void setIdcertificado(int idcertificado) {
		this.idcertificado = idcertificado;
	}

	public String getNcertificado() {
		return ncertificado;
	}

	public void setNcertificado(String ncertificado) {
		this.ncertificado = ncertificado;
	}

}