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
@Table(name="Obstetra")
public class Obstetra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDObstetra;
	
	@Column(name="NombreObstetra", nullable=false, length=30)
	private String NObstetra;
	
	private String UApellidoObstetra;
	
	private String OCorreo;
	
	private String OPassword;
	
	private int NumOIdentificacion;
	
	private Date D_ONacimiento;
	
	private String NGenero;
	
	private Date Fecha_egreso;
	
	@ManyToOne
	@JoinColumn(name="ID_OTipoIdentificacion", nullable=false)
	private int ID_OTipoIdentificacion;
	
	@ManyToOne
	@JoinColumn(name="ID_OPais", nullable=false)
	private int ID_OPais;
	
	@ManyToOne
	@JoinColumn(name="IDOMetodo_pago", nullable=false)
	private int IDOMetodo_pago;
	
	private int NumOMetodo_Pago;
	
	private Image imgPerfilObstetra;

	public Obstetra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Obstetra(int iDObstetra, String nObstetra, String uApellidoObstetra, String oCorreo, String oPassword,
			int numOIdentificacion, Date d_ONacimiento, String nGenero, Date fecha_egreso, int iD_OTipoIdentificacion,
			int iD_OPais, int iDOMetodo_pago, int numOMetodo_Pago, Image imgPerfilObstetra) {
		super();
		IDObstetra = iDObstetra;
		NObstetra = nObstetra;
		UApellidoObstetra = uApellidoObstetra;
		OCorreo = oCorreo;
		OPassword = oPassword;
		NumOIdentificacion = numOIdentificacion;
		D_ONacimiento = d_ONacimiento;
		NGenero = nGenero;
		Fecha_egreso = fecha_egreso;
		ID_OTipoIdentificacion = iD_OTipoIdentificacion;
		ID_OPais = iD_OPais;
		IDOMetodo_pago = iDOMetodo_pago;
		NumOMetodo_Pago = numOMetodo_Pago;
		this.imgPerfilObstetra = imgPerfilObstetra;
	}

	public int getIDObstetra() {
		return IDObstetra;
	}

	public void setIDObstetra(int iDObstetra) {
		IDObstetra = iDObstetra;
	}

	public String getNObstetra() {
		return NObstetra;
	}

	public void setNObstetra(String nObstetra) {
		NObstetra = nObstetra;
	}

	public String getUApellidoObstetra() {
		return UApellidoObstetra;
	}

	public void setUApellidoObstetra(String uApellidoObstetra) {
		UApellidoObstetra = uApellidoObstetra;
	}

	public String getOCorreo() {
		return OCorreo;
	}

	public void setOCorreo(String oCorreo) {
		OCorreo = oCorreo;
	}

	public String getOPassword() {
		return OPassword;
	}

	public void setOPassword(String oPassword) {
		OPassword = oPassword;
	}

	public int getNumOIdentificacion() {
		return NumOIdentificacion;
	}

	public void setNumOIdentificacion(int numOIdentificacion) {
		NumOIdentificacion = numOIdentificacion;
	}

	public Date getD_ONacimiento() {
		return D_ONacimiento;
	}

	public void setD_ONacimiento(Date d_ONacimiento) {
		D_ONacimiento = d_ONacimiento;
	}

	public String getNGenero() {
		return NGenero;
	}

	public void setNGenero(String nGenero) {
		NGenero = nGenero;
	}

	public Date getFecha_egreso() {
		return Fecha_egreso;
	}

	public void setFecha_egreso(Date fecha_egreso) {
		Fecha_egreso = fecha_egreso;
	}

	public int getID_OTipoIdentificacion() {
		return ID_OTipoIdentificacion;
	}

	public void setID_OTipoIdentificacion(int iD_OTipoIdentificacion) {
		ID_OTipoIdentificacion = iD_OTipoIdentificacion;
	}

	public int getID_OPais() {
		return ID_OPais;
	}

	public void setID_OPais(int iD_OPais) {
		ID_OPais = iD_OPais;
	}

	public int getIDOMetodo_pago() {
		return IDOMetodo_pago;
	}

	public void setIDOMetodo_pago(int iDOMetodo_pago) {
		IDOMetodo_pago = iDOMetodo_pago;
	}

	public int getNumOMetodo_Pago() {
		return NumOMetodo_Pago;
	}

	public void setNumOMetodo_Pago(int numOMetodo_Pago) {
		NumOMetodo_Pago = numOMetodo_Pago;
	}

	public Image getImgPerfilObstetra() {
		return imgPerfilObstetra;
	}

	public void setImgPerfilObstetra(Image imgPerfilObstetra) {
		this.imgPerfilObstetra = imgPerfilObstetra;
	}
	

}