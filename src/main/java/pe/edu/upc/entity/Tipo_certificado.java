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
@Table(name="Tipo_certificado")
public class Tipo_certificado implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int IDCertificado;
		
		@Column(name="NCertificado", nullable=false, length=30)
		private String NCertificado;

		public Tipo_certificado() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Tipo_certificado(int iDCertificado, String nCertificado) {
			super();
			IDCertificado = iDCertificado;
			NCertificado = nCertificado;
		}

		public int getIDCertificado() {
			return IDCertificado;
		}

		public void setIDCertificado(int iDCertificado) {
			IDCertificado = iDCertificado;
		}

		public String getNCertificado() {
			return NCertificado;
		}

		public void setNCertificado(String nCertificado) {
			NCertificado = nCertificado;
		}
	
}
