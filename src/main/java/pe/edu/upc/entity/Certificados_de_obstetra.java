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
@Table(name="Certificados_de_obstetra")
public class Certificados_de_obstetra implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@Id
		@ManyToOne
		@JoinColumn(name="IDCertificado", nullable=false)
		private int IDCertificado;
		
		@Id
		@ManyToOne
		@JoinColumn(name="IDObstetra", nullable=false)
		private int IDObstetra;
		
		@Column(name="NCertificado", nullable=true)
		private String TDescripcion;
		
		private Image imgCertificado;

		public Certificados_de_obstetra() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Certificados_de_obstetra(int iDCertificado, int iDObstetra, String tDescripcion, Image imgCertificado) {
			super();
			IDCertificado = iDCertificado;
			IDObstetra = iDObstetra;
			TDescripcion = tDescripcion;
			this.imgCertificado = imgCertificado;
		}

		public int getIDCertificado() {
			return IDCertificado;
		}

		public void setIDCertificado(int iDCertificado) {
			IDCertificado = iDCertificado;
		}

		public int getIDObstetra() {
			return IDObstetra;
		}

		public void setIDObstetra(int iDObstetra) {
			IDObstetra = iDObstetra;
		}

		public String getTDescripcion() {
			return TDescripcion;
		}

		public void setTDescripcion(String tDescripcion) {
			TDescripcion = tDescripcion;
		}

		public Image getImgCertificado() {
			return imgCertificado;
		}

		public void setImgCertificado(Image imgCertificado) {
			this.imgCertificado = imgCertificado;
		}
	
		
}
