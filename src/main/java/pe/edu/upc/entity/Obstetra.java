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
@Table(name="obstetra")
public class Obstetra implements Serializable{

	/* SERIALVERSIONUID */
	
	private static final long serialVersionUID = 1L;
	
	/* ATTRIBUTES */
	/* CONSIDERATIONS: Lower case names and no "_" */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idobstetra;
	
	@Column(name="nombreobstetra", nullable=false, length=30)
	private String nobstetra;
	
	@Column(name="apellidoobstetra", nullable=false, length=30)
	private String napellidoobstetra;
	

	@ManyToOne
	@JoinColumn(name="paisid", nullable=false)
	private Pais pais;

	@Column(name="correo", nullable=false, length=40)
	private String correo;
	
	@Column(name="password", nullable=false, length=15)
	private String password;
	

	@ManyToOne
	@JoinColumn(name="tipoidentificacion", nullable=false)
	private TipoIdentificacion tipoidentificacion;
	
	private String numoidentificacion;
	
	private Date donacimiento;
	
	@Column(name="ngenero", nullable=false, length=10)
	private String ngenero;
	
	private Date fechaegreso;
	

	@ManyToOne
	@JoinColumn(name="metododepago", nullable=false)
	private MetodoDePago metododepago;

	
	private int numometodopago;

	
	
	/* SUPER CLASS */

	public Obstetra() {
		super();
		// TODO Auto-generated constructor stub
	}/* CONSTRUCTOR */
	
	public Obstetra(int idobstetra, String nobstetra, String napellidoobstetra, Pais pais, String correo,
			String password, TipoIdentificacion tipoidentificacion, String numoidentificacion, Date donacimiento,
			String ngenero, Date fechaegreso, MetodoDePago metododepago, int numometodopago) {
		super();
		this.idobstetra = idobstetra;
		this.nobstetra = nobstetra;
		this.napellidoobstetra = napellidoobstetra;
		this.pais = pais;
		this.correo = correo;
		this.password = password;
		this.tipoidentificacion = tipoidentificacion;
		this.numoidentificacion = numoidentificacion;
		this.donacimiento = donacimiento;
		this.ngenero = ngenero;
		this.fechaegreso = fechaegreso;
		this.metododepago = metododepago;
		this.numometodopago = numometodopago;

	}/* GETTERS AND SETTERS */

	public int getIdobstetra() {
		return idobstetra;
	}


	public void setIdobstetra(int idobstetra) {
		this.idobstetra = idobstetra;
	}


	public String getNobstetra() {
		return nobstetra;
	}


	public void setNobstetra(String nobstetra) {
		this.nobstetra = nobstetra;
	}


	public String getNapellidoobstetra() {
		return napellidoobstetra;
	}


	public void setNapellidoobstetra(String napellidoobstetra) {
		this.napellidoobstetra = napellidoobstetra;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNumoidentificacion() {
		return numoidentificacion;
	}


	public void setNumoidentificacion(String numoidentificacion) {
		this.numoidentificacion = numoidentificacion;
	}


	public Date getDonacimiento() {
		return donacimiento;
	}


	public void setDonacimiento(Date donacimiento) {
		this.donacimiento = donacimiento;
	}


	public String getNgenero() {
		return ngenero;
	}


	public void setNgenero(String ngenero) {
		this.ngenero = ngenero;
	}


	public Date getFechaegreso() {
		return fechaegreso;
	}


	public void setFechaegreso(Date fechaegreso) {
		this.fechaegreso = fechaegreso;
	}


	public int getNumometodopago() {
		return numometodopago;
	}


	public void setNumometodopago(int numometodopago) {
		this.numometodopago = numometodopago;
	}


	

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public TipoIdentificacion getTipoidentificacion() {
		return tipoidentificacion;
	}

	public void setTipoidentificacion(TipoIdentificacion tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}

	public MetodoDePago getMetododepago() {
		return metododepago;
	}

	public void setMetododepago(MetodoDePago metododepago) {
		this.metododepago = metododepago;
	}

	
	
}