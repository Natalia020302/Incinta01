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
import javax.websocket.Decoder.Text;

@Entity
@Table(name="Preguntas_Gestante")
public class Preguntas_Gestante implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDPregunta;
	
	@Id
	@ManyToOne
	@JoinColumn(name="IDGestante", nullable=false)
	private int IDGestante;
	
	private int NTitulo;

	private Text TPregunta;
	
	private Date Fecha;

	public Preguntas_Gestante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Preguntas_Gestante(int iDPregunta, int iDGestante, int nTitulo, Text tPregunta, Date fecha) {
		super();
		IDPregunta = iDPregunta;
		IDGestante = iDGestante;
		NTitulo = nTitulo;
		TPregunta = tPregunta;
		Fecha = fecha;
	}

	public int getIDPregunta() {
		return IDPregunta;
	}

	public void setIDPregunta(int iDPregunta) {
		IDPregunta = iDPregunta;
	}

	public int getIDGestante() {
		return IDGestante;
	}

	public void setIDGestante(int iDGestante) {
		IDGestante = iDGestante;
	}

	public int getNTitulo() {
		return NTitulo;
	}

	public void setNTitulo(int nTitulo) {
		NTitulo = nTitulo;
	}

	public Text getTPregunta() {
		return TPregunta;
	}

	public void setTPregunta(Text tPregunta) {
		TPregunta = tPregunta;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	






	

}
