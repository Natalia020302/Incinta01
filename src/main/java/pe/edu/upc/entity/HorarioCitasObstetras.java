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
@Table(name="horariocitasobstetras")
public class HorarioCitasObstetras implements Serializable{

	/* SERIALVERSIONUID */
	
	private static final long serialVersionUID = 1L;
	
	/* ATTRIBUTES */
	/* CONSIDERATIONS: Lower case names and no "_" */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idhorariocita;

	@ManyToOne
	@JoinColumn(name="idobstetra", nullable=false)
	private Obstetra obstetra;
	
	private int numprecio;
	
	private Date fechacita;
	
	@Column(name="nlocal", nullable=false, length=30)
	private String nlocal;
	
	private String ndireccion;
	
	@Column(name="nreferencia", nullable=true)
	private String nreferencia;
	
	private int hcinicio;
	
	private int hcfin;
	
	private int boolatendida;
	
	/* SUPER CLASS */

	public HorarioCitasObstetras() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* CONSTRUCTOR */

	public HorarioCitasObstetras(int idhorariocita, Obstetra obstetra, int numprecio, Date fechacita, String nlocal,
			String ndireccion, String nreferencia, int hcinicio, int hcfin, int boolatendida) {
		super();
		this.idhorariocita = idhorariocita;
		this.obstetra = obstetra;
		this.numprecio = numprecio;
		this.fechacita = fechacita;
		this.nlocal = nlocal;
		this.ndireccion = ndireccion;
		this.nreferencia = nreferencia;
		this.hcinicio = hcinicio;
		this.hcfin = hcfin;
		this.boolatendida = boolatendida;
	}
	
	/* GETTERS AND SETTERS */

	public int getIdhorariocita() {
		return idhorariocita;
	}

	public void setIdhorariocita(int idhorariocita) {
		this.idhorariocita = idhorariocita;
	}

	public Obstetra getObstetra() {
		return obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		this.obstetra = obstetra;
	}

	public int getNumprecio() {
		return numprecio;
	}

	public void setNumprecio(int numprecio) {
		this.numprecio = numprecio;
	}

	public Date getFechacita() {
		return fechacita;
	}

	public void setFechacita(Date fechacita) {
		this.fechacita = fechacita;
	}

	public String getNlocal() {
		return nlocal;
	}

	public void setNlocal(String nlocal) {
		this.nlocal = nlocal;
	}

	public String getNdireccion() {
		return ndireccion;
	}

	public void setNdireccion(String ndireccion) {
		this.ndireccion = ndireccion;
	}

	public String getNreferencia() {
		return nreferencia;
	}

	public void setNreferencia(String nreferencia) {
		this.nreferencia = nreferencia;
	}

	public int getHcinicio() {
		return hcinicio;
	}

	public void setHcinicio(int hcinicio) {
		this.hcinicio = hcinicio;
	}

	public int getHcfin() {
		return hcfin;
	}

	public void setHcfin(int hcfin) {
		this.hcfin = hcfin;
	}

	public int getBoolatendida() {
		return boolatendida;
	}

	public void setBoolatendida(int boolatendida) {
		this.boolatendida = boolatendida;
	}

}