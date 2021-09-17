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
@Table(name="Queja")
public class Queja implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Queja;
	
	@ManyToOne
	@JoinColumn(name="ID_HorarioCita", nullable=false)
	private int ID_HorarioCita;
	
	private Text TQueja;

	public Queja() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Queja(int iD_Queja, int iD_HorarioCita, Text tQueja) {
		super();
		ID_Queja = iD_Queja;
		ID_HorarioCita = iD_HorarioCita;
		TQueja = tQueja;
	}

	public int getID_Queja() {
		return ID_Queja;
	}

	public void setID_Queja(int iD_Queja) {
		ID_Queja = iD_Queja;
	}

	public int getID_HorarioCita() {
		return ID_HorarioCita;
	}

	public void setID_HorarioCita(int iD_HorarioCita) {
		ID_HorarioCita = iD_HorarioCita;
	}

	public Text getTQueja() {
		return TQueja;
	}

	public void setTQueja(Text tQueja) {
		TQueja = tQueja;
	}
	
	




	

}
