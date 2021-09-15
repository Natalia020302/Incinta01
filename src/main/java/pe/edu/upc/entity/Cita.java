
package pe.edu.upc.entity;


import java.io.Serializable;
import java.util.Date;


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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDCita;
	
	@ManyToOne
	@JoinColumn(name="ID_Gestante", nullable=false)
	private int ID_Gestante;
	
	@ManyToOne
	@JoinColumn(name="ID_Obstetra", nullable=false)
	private int ID_Obstetra;

	private Date FCita;

	public Cita() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIDCita() {
		return IDCita;
	}

	public void setIDCita(int iDCita) {
		IDCita = iDCita;
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

	public Date getFCita() {
		return FCita;
	}

	public void setFCita(Date fCita) {
		FCita = fCita;
	}

	public Cita(int iDCita, int iD_Gestante, int iD_Obstetra, Date fCita) {
		super();
		IDCita = iDCita;
		ID_Gestante = iD_Gestante;
		ID_Obstetra = iD_Obstetra;
		FCita = fCita;
	}

	
}
