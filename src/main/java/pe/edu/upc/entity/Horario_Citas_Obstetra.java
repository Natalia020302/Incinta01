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
@Table(name="Horario_Citas_Obstetra")
public class Horario_Citas_Obstetra implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int ID_HorarioCita;
		
		@ManyToOne
		@JoinColumn(name="IDObstetra", nullable=false)
		private int IDObstetra;
		
		private int NumPrecio;
		
		private String NLocal;
		
		private String NDireccion;
		
		@Column(name="NReferencia", nullable=false, length=40)
		private String NReferencia;
		
		private String HCInicio;
		
		private String HCFin;
		
		private boolean BoolAtendida;

		public Horario_Citas_Obstetra() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Horario_Citas_Obstetra(int iD_HorarioCita, int iDObstetra, int numPrecio, String nLocal,
				String nDireccion, String nReferencia, String hCInicio, String hCFin, boolean boolAtendida) {
			super();
			ID_HorarioCita = iD_HorarioCita;
			IDObstetra = iDObstetra;
			NumPrecio = numPrecio;
			NLocal = nLocal;
			NDireccion = nDireccion;
			NReferencia = nReferencia;
			HCInicio = hCInicio;
			HCFin = hCFin;
			BoolAtendida = boolAtendida;
		}

		public int getID_HorarioCita() {
			return ID_HorarioCita;
		}

		public void setID_HorarioCita(int iD_HorarioCita) {
			ID_HorarioCita = iD_HorarioCita;
		}

		public int getIDObstetra() {
			return IDObstetra;
		}

		public void setIDObstetra(int iDObstetra) {
			IDObstetra = iDObstetra;
		}

		public int getNumPrecio() {
			return NumPrecio;
		}

		public void setNumPrecio(int numPrecio) {
			NumPrecio = numPrecio;
		}

		public String getNLocal() {
			return NLocal;
		}

		public void setNLocal(String nLocal) {
			NLocal = nLocal;
		}

		public String getNDireccion() {
			return NDireccion;
		}

		public void setNDireccion(String nDireccion) {
			NDireccion = nDireccion;
		}

		public String getNReferencia() {
			return NReferencia;
		}

		public void setNReferencia(String nReferencia) {
			NReferencia = nReferencia;
		}

		public String getHCInicio() {
			return HCInicio;
		}

		public void setHCInicio(String hCInicio) {
			HCInicio = hCInicio;
		}

		public String getHCFin() {
			return HCFin;
		}

		public void setHCFin(String hCFin) {
			HCFin = hCFin;
		}

		public boolean isBoolAtendida() {
			return BoolAtendida;
		}

		public void setBoolAtendida(boolean boolAtendida) {
			BoolAtendida = boolAtendida;
		}
		
	
}
