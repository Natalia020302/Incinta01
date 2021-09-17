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
	
	
	@ManyToOne
	@JoinColumn(name="ID_Metodo_Pago", nullable=false)
	private int IDMetodo_Pago;
	
	@Column(name="Numero_Targeta", nullable=false)
	private int NumMetodo_Pago;
	
	@Column(name="Imagen_Perfil", nullable=true)
	private Image imgPerfilUsuario;

	public Usuario(int usuarioID, String nUsuario, String uApellido, String correo, String uPassword,
			int numIdentificacion, Date d_Nacimiento, int iD_TipoIdentificacion, int iD_Pais, int iDMetodo_Pago,
			int numMetodo_Pago, Image imgPerfilUsuario) {
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
		IDMetodo_Pago = iDMetodo_Pago;
		NumMetodo_Pago = numMetodo_Pago;
		this.imgPerfilUsuario = imgPerfilUsuario;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getIDMetodo_Pago() {
		return IDMetodo_Pago;
	}

	public void setIDMetodo_Pago(int iDMetodo_Pago) {
		IDMetodo_Pago = iDMetodo_Pago;
	}

	public int getNumMetodo_Pago() {
		return NumMetodo_Pago;
	}

	public void setNumMetodo_Pago(int numMetodo_Pago) {
		NumMetodo_Pago = numMetodo_Pago;
	}

	public Image getImgPerfilUsuario() {
		return imgPerfilUsuario;
	}

	public void setImgPerfilUsuario(Image imgPerfilUsuario) {
		this.imgPerfilUsuario = imgPerfilUsuario;
	}
	
	



	
	
	

}