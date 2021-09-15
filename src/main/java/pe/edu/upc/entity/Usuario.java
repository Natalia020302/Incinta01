package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NombreUsuario", nullable=false, length=30)
	private String NombreU;
	
	private String Apellido;
	
	private String correo;
	
	private String passwordu;
	
	private int idIdent;
	
	private Date fechaN;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int id, String nombreU, String apellido, String correo, String passwordu, int idIdent, Date fechaN) {
		super();
		this.id = id;
		NombreU = nombreU;
		Apellido = apellido;
		this.correo = correo;
		this.passwordu = passwordu;
		this.idIdent = idIdent;
		this.fechaN = fechaN;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreU() {
		return NombreU;
	}

	public void setNombreU(String nombreU) {
		NombreU = nombreU;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPasswordu() {
		return passwordu;
	}

	public void setPasswordu(String passwordu) {
		this.passwordu = passwordu;
	}

	public int getIdIdent() {
		return idIdent;
	}

	public void setIdIdent(int idIdent) {
		this.idIdent = idIdent;
	}

	public Date getFechaN() {
		return fechaN;
	}

	public void setFechaN(Date fechaN) {
		this.fechaN = fechaN;
	}
	
	

}
