package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="ObservacionValoracion")
public class ObservacionValoracion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Observacion; 
	
	
	
	private Date Fecha_Observacion;
	
	private String Observacion;
	
	private int Nivel_Valoracion;
	
	@ManyToOne
	@JoinColumn(name="ID_Gestante", nullable=false)
	private int ID_Gestante;
	
	@Id
	@ManyToOne
	@JoinColumn(name="ID_Obstetra", nullable=false)
	private int ID_Obstetra;

	public ObservacionValoracion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ObservacionValoracion(int iD_Observacion, Date fecha_Observacion, String observacion, int nivel_Valoracion,
			int iD_Gestante, int iD_Obstetra) {
		super();
		ID_Observacion = iD_Observacion;
		Fecha_Observacion = fecha_Observacion;
		Observacion = observacion;
		Nivel_Valoracion = nivel_Valoracion;
		ID_Gestante = iD_Gestante;
		ID_Obstetra = iD_Obstetra;
	}

	public int getID_Observacion() {
		return ID_Observacion;
	}

	public void setID_Observacion(int iD_Observacion) {
		ID_Observacion = iD_Observacion;
	}

	public Date getFecha_Observacion() {
		return Fecha_Observacion;
	}

	public void setFecha_Observacion(Date fecha_Observacion) {
		Fecha_Observacion = fecha_Observacion;
	}

	public String getObservacion() {
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	public int getNivel_Valoracion() {
		return Nivel_Valoracion;
	}

	public void setNivel_Valoracion(int nivel_Valoracion) {
		Nivel_Valoracion = nivel_Valoracion;
	}

	public int getID_Gestante() {
		return ID_Gestante;
	}

	public void setID_Gestante(int iD_Gestante) {
		ID_Gestante = iD_Gestante;
	}

	public int getID_Obstetra() {
		return ID_Obstetra;
	}

	public void setID_Obstetra(int iD_Obstetra) {
		ID_Obstetra = iD_Obstetra;
	}




	
}
