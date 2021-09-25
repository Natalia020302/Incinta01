package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Comentarios")
public class Comentarios implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idComentario;
	
	@ManyToOne
	@JoinColumn(name="usuarioID", nullable=false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="idObstetra", nullable=false)
	private Obstetra obstetra;

	private String tComentario;

	public Comentarios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comentarios(int idComentario, Usuario usuario, Obstetra obstetra, String tComentario) {
		super();
		this.idComentario = idComentario;
		this.usuario = usuario;
		this.obstetra = obstetra;
		this.tComentario = tComentario;
	}

	public int getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Obstetra getObstetra() {
		return obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		this.obstetra = obstetra;
	}

	public String gettComentario() {
		return tComentario;
	}

	public void settComentario(String tComentario) {
		this.tComentario = tComentario;
	}

}
