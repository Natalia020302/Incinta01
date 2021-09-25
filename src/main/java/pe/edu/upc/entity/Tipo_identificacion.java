package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipoIdentificacion")
public class Tipo_identificacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoIdentificacion;
	
	@Column(name="NombreIdentificacion", nullable=false, length=30)
	private String NIdentificacion;
	

	public Tipo_identificacion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Tipo_identificacion(int iD_TipoIdentificacion, String nIdentificacion) {
		super();
		ID_TipoIdentificacion = iD_TipoIdentificacion;
		NIdentificacion = nIdentificacion;
	}


	public int getID_TipoIdentificacion() {
		return ID_TipoIdentificacion;
	}


	public void setID_TipoIdentificacion(int iD_TipoIdentificacion) {
		ID_TipoIdentificacion = iD_TipoIdentificacion;
	}


	public String getNIdentificacion() {
		return NIdentificacion;
	}


	public void setNIdentificacion(String nIdentificacion) {
		NIdentificacion = nIdentificacion;
	}


	

	

	

}
