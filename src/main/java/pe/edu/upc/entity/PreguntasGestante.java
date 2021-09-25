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
@Table(name="PreguntasGestante")
public class PreguntasGestante implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPregunta;
	
	//@Id
	@ManyToOne
	@JoinColumn(name="idUsuario", nullable=false)
	private Usuario usuario;
	
	private int nTitulo;

	private String tPregunta;
	
	private Date fecha;

	public PreguntasGestante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreguntasGestante(int idPregunta, Usuario usuario, int nTitulo, String tPregunta, Date fecha) {
		super();
		this.idPregunta = idPregunta;
		this.usuario = usuario;
		this.nTitulo = nTitulo;
		this.tPregunta = tPregunta;
		this.fecha = fecha;
	}

	public int getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getnTitulo() {
		return nTitulo;
	}

	public void setnTitulo(int nTitulo) {
		this.nTitulo = nTitulo;
	}

	public String gettPregunta() {
		return tPregunta;
	}

	public void settPregunta(String tPregunta) {
		this.tPregunta = tPregunta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}

