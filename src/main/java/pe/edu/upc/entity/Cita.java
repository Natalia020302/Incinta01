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

@Entity
@Table(name="Cita")
public class Cita implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name="ID_HorarioCita", nullable=false)
	private int ID_HorarioCita;
	
	@ManyToOne
	@JoinColumn(name="UsuarioID", nullable=false)
	private int UsuarioID;

	private int NumValoracion;

	public Cita() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cita(int iD_HorarioCita, int usuarioID, int numValoracion) {
		super();
		ID_HorarioCita = iD_HorarioCita;
		UsuarioID = usuarioID;
		NumValoracion = numValoracion;
	}

	public int getID_HorarioCita() {
		return ID_HorarioCita;
	}

	public void setID_HorarioCita(int iD_HorarioCita) {
		ID_HorarioCita = iD_HorarioCita;
	}

	public int getUsuarioID() {
		return UsuarioID;
	}

	public void setUsuarioID(int usuarioID) {
		UsuarioID = usuarioID;
	}

	public int getNumValoracion() {
		return NumValoracion;
	}

	public void setNumValoracion(int numValoracion) {
		NumValoracion = numValoracion;
	}
	





	

}
