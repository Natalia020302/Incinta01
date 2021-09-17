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
@Table(name="Comentarios")
public class Comentarios implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDComentario;
	
	@ManyToOne
	@JoinColumn(name="UsuarioID", nullable=false)
	private int UsuarioID;
	
	@ManyToOne
	@JoinColumn(name="IDObstetra", nullable=false)
	private int IDObstetra;

	private Text TComentario;

	public Comentarios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comentarios(int iDComentario, int usuarioID, int iDObstetra, Text tComentario) {
		super();
		IDComentario = iDComentario;
		UsuarioID = usuarioID;
		IDObstetra = iDObstetra;
		TComentario = tComentario;
	}

	public int getIDComentario() {
		return IDComentario;
	}

	public void setIDComentario(int iDComentario) {
		IDComentario = iDComentario;
	}

	public int getUsuarioID() {
		return UsuarioID;
	}

	public void setUsuarioID(int usuarioID) {
		UsuarioID = usuarioID;
	}

	public int getIDObstetra() {
		return IDObstetra;
	}

	public void setIDObstetra(int iDObstetra) {
		IDObstetra = iDObstetra;
	}

	public Text getTComentario() {
		return TComentario;
	}

	public void setTComentario(Text tComentario) {
		TComentario = tComentario;
	}

	






	

}
