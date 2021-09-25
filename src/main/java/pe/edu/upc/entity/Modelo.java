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
@Table(name="modelo")
public class Modelo implements Serializable{

	/* SERIALVERSIONUID */
	
	private static final long serialVersionUID = 1L;
	
	/* ATTRIBUTES */
	/* CONSIDERATIONS: Lower case names and no "_" */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDObstetra;
	
	@Column(name="NombreObstetra", nullable=false, length=30)
	private String NObstetra;
	
	@ManyToOne
	@JoinColumn(name="ID_OTipoIdentificacion", nullable=false)
	private int ID_OTipoIdentificacion;
	
	
	
	/* SUPER CLASS */

	

	/* CONSTRUCTOR */
	
	

	/* GETTERS AND SETTERS */
	
	

}