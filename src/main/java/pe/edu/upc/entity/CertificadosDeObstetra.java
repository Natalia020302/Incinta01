package pe.edu.upc.entity;

import java.io.Serializable;

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
@Table(name="modelo")
public class CertificadosDeObstetra implements Serializable{

	/* SERIALVERSIONUID */
	
	private static final long serialVersionUID = 1L;
	
	/* ATTRIBUTES */
	/* CONSIDERATIONS: Lower case names and no "_" */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcertificadoobstetra;
	
	@ManyToOne
	@JoinColumn(name="tipocertificado", nullable=false)
	private TipoCertificado tipocertificado;
	
	@ManyToOne
	@JoinColumn(name="idobstetra", nullable=false)
	private Obstetra obstetra;
	
	@Column(name="tdescripcion", nullable=true)
	private String tdescripcion;
	
	private Image imgcertificado;
	
	/* SUPER CLASS */

	public CertificadosDeObstetra() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* CONSTRUCTOR */

	public CertificadosDeObstetra(int idcertificadoobstetra, TipoCertificado tipocertificado, Obstetra obstetra,
			String tdescripcion, Image imgcertificado) {
		super();
		this.idcertificadoobstetra = idcertificadoobstetra;
		this.tipocertificado = tipocertificado;
		this.obstetra = obstetra;
		this.tdescripcion = tdescripcion;
		this.imgcertificado = imgcertificado;
	}
	
	/* GETTERS AND SETTERS */

	public int getIdcertificadoobstetra() {
		return idcertificadoobstetra;
	}

	public void setIdcertificadoobstetra(int idcertificadoobstetra) {
		this.idcertificadoobstetra = idcertificadoobstetra;
	}

	public TipoCertificado getTipocertificado() {
		return tipocertificado;
	}

	public void setTipocertificado(TipoCertificado tipocertificado) {
		this.tipocertificado = tipocertificado;
	}

	public Obstetra getObstetra() {
		return obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		this.obstetra = obstetra;
	}

	public String getTdescripcion() {
		return tdescripcion;
	}

	public void setTdescripcion(String tdescripcion) {
		this.tdescripcion = tdescripcion;
	}

	public Image getImgcertificado() {
		return imgcertificado;
	}

	public void setImgcertificado(Image imgcertificado) {
		this.imgcertificado = imgcertificado;
	}

}