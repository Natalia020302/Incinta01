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
	private int usuarioID;
	
	@Column(name="nombreUsuario", nullable=false, length=30)
	private String nUsuario;
	
	private String uApellido;
	
	private String uCorreo;
	
	private String uPassword;
	
	private int numIdentificacion;
	
	private Date dNacimiento;
	
	
	@ManyToOne
	@JoinColumn(name="iDTipoIdentificacion", nullable=false)
	private TipoIdentificacion iDTipoIdentificacion;
	
	
	@ManyToOne
	@JoinColumn(name="iDPais", nullable=false)
	private Pais iDPais;
	
	
	@ManyToOne
	@JoinColumn(name="idMetodoPago", nullable=false)
	private MetodoDePago iDMetodoPago;
	
	@Column(name="numeroTargeta", nullable=false)
	private int numMetodoPago;
	
	@Column(name="imagenPerfil", nullable=true)
	private Image imgPerfilUsuario;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int usuarioID, String nUsuario, String uApellido, String uCorreo, String uPassword,
			int numIdentificacion, Date dNacimiento, TipoIdentificacion iDTipoIdentificacion, Pais iDPais,
			MetodoDePago iDMetodoPago, int numMetodoPago, Image imgPerfilUsuario) {
		super();
		this.usuarioID = usuarioID;
		this.nUsuario = nUsuario;
		this.uApellido = uApellido;
		this.uCorreo = uCorreo;
		this.uPassword = uPassword;
		this.numIdentificacion = numIdentificacion;
		this.dNacimiento = dNacimiento;
		this.iDTipoIdentificacion = iDTipoIdentificacion;
		this.iDPais = iDPais;
		this.iDMetodoPago = iDMetodoPago;
		this.numMetodoPago = numMetodoPago;
		this.imgPerfilUsuario = imgPerfilUsuario;
	}

	public int getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(int usuarioID) {
		this.usuarioID = usuarioID;
	}

	public String getnUsuario() {
		return nUsuario;
	}

	public void setnUsuario(String nUsuario) {
		this.nUsuario = nUsuario;
	}

	public String getuApellido() {
		return uApellido;
	}

	public void setuApellido(String uApellido) {
		this.uApellido = uApellido;
	}

	public String getuCorreo() {
		return uCorreo;
	}

	public void setuCorreo(String uCorreo) {
		this.uCorreo = uCorreo;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public int getNumIdentificacion() {
		return numIdentificacion;
	}

	public void setNumIdentificacion(int numIdentificacion) {
		this.numIdentificacion = numIdentificacion;
	}

	public Date getdNacimiento() {
		return dNacimiento;
	}

	public void setdNacimiento(Date dNacimiento) {
		this.dNacimiento = dNacimiento;
	}

	public TipoIdentificacion getiDTipoIdentificacion() {
		return iDTipoIdentificacion;
	}

	public void setiDTipoIdentificacion(TipoIdentificacion iDTipoIdentificacion) {
		this.iDTipoIdentificacion = iDTipoIdentificacion;
	}

	public Pais getiDPais() {
		return iDPais;
	}

	public void setiDPais(Pais iDPais) {
		this.iDPais = iDPais;
	}

	public MetodoDePago getiDMetodoPago() {
		return iDMetodoPago;
	}

	public void setiDMetodoPago(MetodoDePago iDMetodoPago) {
		this.iDMetodoPago = iDMetodoPago;
	}

	public int getNumMetodoPago() {
		return numMetodoPago;
	}

	public void setNumMetodoPago(int numMetodoPago) {
		this.numMetodoPago = numMetodoPago;
	}

	public Image getImgPerfilUsuario() {
		return imgPerfilUsuario;
	}

	public void setImgPerfilUsuario(Image imgPerfilUsuario) {
		this.imgPerfilUsuario = imgPerfilUsuario;
	}
	

	
	



	
	
	

}