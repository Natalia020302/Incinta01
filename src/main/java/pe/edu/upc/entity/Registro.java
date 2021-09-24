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
@Table(name="Registro")
public class Registro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iDRegistro;
	

	@ManyToOne
	@JoinColumn(name="usuarioID", nullable=false)
	private Usuario usuarioID;


	@Column(name="fecha", nullable=false)
	private Date fechaFicha;
	
	@Column(name="anotaciones", nullable=true)
	private String tAnotaciones; 
	
	@ManyToOne
	@JoinColumn(name="iDParametro", nullable=false)
	private Parametro iDParametro;

	
	@Column(name="valor", nullable=false)
	private int numValor;


	public Registro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Registro(int iDRegistro, Usuario usuarioID, Date fechaFicha, String tAnotaciones, Parametro iDParametro,
			int numValor) {
		super();
		this.iDRegistro = iDRegistro;
		this.usuarioID = usuarioID;
		this.fechaFicha = fechaFicha;
		this.tAnotaciones = tAnotaciones;
		this.iDParametro = iDParametro;
		this.numValor = numValor;
	}


	public int getiDRegistro() {
		return iDRegistro;
	}


	public void setiDRegistro(int iDRegistro) {
		this.iDRegistro = iDRegistro;
	}


	public Usuario getUsuarioID() {
		return usuarioID;
	}


	public void setUsuarioID(Usuario usuarioID) {
		this.usuarioID = usuarioID;
	}


	public Date getFechaFicha() {
		return fechaFicha;
	}


	public void setFechaFicha(Date fechaFicha) {
		this.fechaFicha = fechaFicha;
	}


	public String gettAnotaciones() {
		return tAnotaciones;
	}


	public void settAnotaciones(String tAnotaciones) {
		this.tAnotaciones = tAnotaciones;
	}


	public Parametro getiDParametro() {
		return iDParametro;
	}


	public void setiDParametro(Parametro iDParametro) {
		this.iDParametro = iDParametro;
	}


	public int getNumValor() {
		return numValor;
	}


	public void setNumValor(int numValor) {
		this.numValor = numValor;
	}


	


	


	



	

}
