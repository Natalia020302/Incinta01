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
@Table(name="Obstetra_Suscripcion")
public class Obstetra_Suscripcion implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@Id
		@ManyToOne
		@JoinColumn(name="ID_Suscripcion", nullable=false)
		private int ID_Suscripcion;
		
		@Id
		private Date FechaInicio;
		
		@Id
		@ManyToOne
		@JoinColumn(name="IDObstetra", nullable=false)
		private int IDObstetra;
		
		private Date FechaFin;

		public Obstetra_Suscripcion() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Obstetra_Suscripcion(int iD_Suscripcion, Date fechaInicio, int iDObstetra, Date fechaFin) {
			super();
			ID_Suscripcion = iD_Suscripcion;
			FechaInicio = fechaInicio;
			IDObstetra = iDObstetra;
			FechaFin = fechaFin;
		}

		public int getID_Suscripcion() {
			return ID_Suscripcion;
		}

		public void setID_Suscripcion(int iD_Suscripcion) {
			ID_Suscripcion = iD_Suscripcion;
		}

		public Date getFechaInicio() {
			return FechaInicio;
		}

		public void setFechaInicio(Date fechaInicio) {
			FechaInicio = fechaInicio;
		}

		public int getIDObstetra() {
			return IDObstetra;
		}

		public void setIDObstetra(int iDObstetra) {
			IDObstetra = iDObstetra;
		}

		public Date getFechaFin() {
			return FechaFin;
		}

		public void setFechaFin(Date fechaFin) {
			FechaFin = fechaFin;
		}
		
}
