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
@Table(name="Usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UsuarioID;
	
	@Column(name="NombreUsuario", nullable=false, length=30)
	private String NUsuario;
	
	private String UApellido;
	
	private String Correo;
	
	private String UPassword;
	
	private int NumIdentificacion;
	
	private Date D_Nacimiento;
	
	
	@ManyToOne
	@JoinColumn(name="ID_TipoIdentificacion", nullable=false)
	private int ID_TipoIdentificacion;
	
	
	@ManyToOne
	@JoinColumn(name="ID_Pais", nullable=false)
	private int ID_Pais;
	

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Usuario(int usuarioID, String nUsuario, String uApellido, String correo, String uPassword,
			int numIdentificacion, Date d_Nacimiento, int iD_TipoIdentificacion, int iD_Pais) {
		super();
		UsuarioID = usuarioID;
		NUsuario = nUsuario;
		UApellido = uApellido;
		Correo = correo;
		UPassword = uPassword;
		NumIdentificacion = numIdentificacion;
		D_Nacimiento = d_Nacimiento;
		ID_TipoIdentificacion = iD_TipoIdentificacion;
		ID_Pais = iD_Pais;
	}


	public int getUsuarioID() {
		return UsuarioID;
	}


	public void setUsuarioID(int usuarioID) {
		UsuarioID = usuarioID;
	}


	public String getNUsuario() {
		return NUsuario;
	}


	public void setNUsuario(String nUsuario) {
		NUsuario = nUsuario;
	}


	public String getUApellido() {
		return UApellido;
	}


	public void setUApellido(String uApellido) {
		UApellido = uApellido;
	}


	public String getCorreo() {
		return Correo;
	}


	public void setCorreo(String correo) {
		Correo = correo;
	}


	public String getUPassword() {
		return UPassword;
	}


	public void setUPassword(String uPassword) {
		UPassword = uPassword;
	}


	public int getNumIdentificacion() {
		return NumIdentificacion;
	}


	public void setNumIdentificacion(int numIdentificacion) {
		NumIdentificacion = numIdentificacion;
	}


	public Date getD_Nacimiento() {
		return D_Nacimiento;
	}


	public void setD_Nacimiento(Date d_Nacimiento) {
		D_Nacimiento = d_Nacimiento;
	}


	public int getID_TipoIdentificacion() {
		return ID_TipoIdentificacion;
	}


	public void setID_TipoIdentificacion(int iD_TipoIdentificacion) {
		ID_TipoIdentificacion = iD_TipoIdentificacion;
	}


	public int getID_Pais() {
		return ID_Pais;
	}


	public void setID_Pais(int iD_Pais) {
		ID_Pais = iD_Pais;
	}

	
	
	

}