package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ficha_cita")
public class Ficha_cita extends FichaRegistroMedico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="ID_Cita", nullable=false)
	private int ID_Cita;
	
	private int NAltura_Uterina;
	private int NHemoglobina;
	private int Altura_materna;
	private int Ausculacion_BCF;
	public int getID_Cita() {
		return ID_Cita;
	}
	public void setID_Cita(int iD_Cita) {
		ID_Cita = iD_Cita;
	}
	public int getNAltura_Uterina() {
		return NAltura_Uterina;
	}
	public void setNAltura_Uterina(int nAltura_Uterina) {
		NAltura_Uterina = nAltura_Uterina;
	}
	public int getNHemoglobina() {
		return NHemoglobina;
	}
	public void setNHemoglobina(int nHemoglobina) {
		NHemoglobina = nHemoglobina;
	}
	public int getAltura_materna() {
		return Altura_materna;
	}
	public void setAltura_materna(int altura_materna) {
		Altura_materna = altura_materna;
	}
	public int getAusculacion_BCF() {
		return Ausculacion_BCF;
	}
	public void setAusculacion_BCF(int ausculacion_BCF) {
		Ausculacion_BCF = ausculacion_BCF;
	}
	
	public Ficha_cita(int iD_Cita, int nAltura_Uterina, int nHemoglobina, int altura_materna, int ausculacion_BCF) {
		super();
		ID_Cita = iD_Cita;
		NAltura_Uterina = nAltura_Uterina;
		NHemoglobina = nHemoglobina;
		Altura_materna = altura_materna;
		Ausculacion_BCF = ausculacion_BCF;
	}
	
	public Ficha_cita() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ficha_cita(int idFicha, Date dsemana_de_gestacion, int nPresion, int nTemperatura, int nPeso,
			Date fecha_fecha, String t_Anotaciones, int usuarioID) {
		super(idFicha, dsemana_de_gestacion, nPresion, nTemperatura, nPeso, fecha_fecha, t_Anotaciones, usuarioID);
		// TODO Auto-generated constructor stub
	}
	
	
}
