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
import javax.websocket.Decoder.Text;

@Entity
@Table(name="Registro_Cita")
public class Registro_Cita implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_RegistroCita;
	
	@ManyToOne
	@JoinColumn(name="ID_HorarioCita", nullable=false)
	private int ID_HorarioCita;
	
	private String T_Anotaciones;

	public Registro_Cita() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registro_Cita(int iD_RegistroCita, int iD_HorarioCita, String t_Anotaciones) {
		super();
		ID_RegistroCita = iD_RegistroCita;
		ID_HorarioCita = iD_HorarioCita;
		T_Anotaciones = t_Anotaciones;
	}

	public int getID_RegistroCita() {
		return ID_RegistroCita;
	}

	public void setID_RegistroCita(int iD_RegistroCita) {
		ID_RegistroCita = iD_RegistroCita;
	}

	public int getID_HorarioCita() {
		return ID_HorarioCita;
	}

	public void setID_HorarioCita(int iD_HorarioCita) {
		ID_HorarioCita = iD_HorarioCita;
	}

	public String getT_Anotaciones() {
		return T_Anotaciones;
	}

	public void setT_Anotaciones(String t_Anotaciones) {
		T_Anotaciones = t_Anotaciones;
	}




	

}
