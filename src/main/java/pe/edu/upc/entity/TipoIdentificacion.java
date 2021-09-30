package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoIdentificacion")
public class TipoIdentificacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iDTipoIdentificacion;
	
	@Column(name="nombreIdentificacion", nullable=false, length=30)
	private String nombreIdentificacion;

	public TipoIdentificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoIdentificacion(int iDTipoIdentificacion, String nombreIdentificacion) {
		super();
		this.iDTipoIdentificacion = iDTipoIdentificacion;
		this.nombreIdentificacion = nombreIdentificacion;
	}

	public int getiDTipoIdentificacion() {
		return iDTipoIdentificacion;
	}

	public void setiDTipoIdentificacion(int iDTipoIdentificacion) {
		this.iDTipoIdentificacion = iDTipoIdentificacion;
	}

	public String getNombreIdentificacion() {
		return nombreIdentificacion;
	}

	public void setNombreIdentificacion(String nombreIdentificacion) {
		this.nombreIdentificacion = nombreIdentificacion;
	}

	
	
}
