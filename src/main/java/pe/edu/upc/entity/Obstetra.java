package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Obstetra")
public class Obstetra extends Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="Genero", nullable=false, length=10)
	private String Genero;
	
	private Date Fecha_egreso;

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public Date getFecha_egreso() {
		return Fecha_egreso;
	}

	public void setFecha_egreso(Date fecha_egreso) {
		Fecha_egreso = fecha_egreso;
	}

	public Obstetra(String genero, Date fecha_egreso) {
		super();
		Genero = genero;
		Fecha_egreso = fecha_egreso;
	}

	public Obstetra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Obstetra(int usuarioID, String nUsuario, String uApellido, String correo, String uPassword,
			int numIdentificacion, Date d_Nacimiento, int iD_TipoIdentificacion, int iD_Pais) {
		super(usuarioID, nUsuario, uApellido, correo, uPassword, numIdentificacion, d_Nacimiento, iD_TipoIdentificacion,
				iD_Pais);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
