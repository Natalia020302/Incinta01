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
@Table(name="FichaParametros")
public class FichaParametros implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFichaParametro;
	
	@ManyToOne
	@JoinColumn(name="idRegistroCita", nullable=false)
	private RegistroCita registroCita;
	
	@ManyToOne
	@JoinColumn(name="idQueja", nullable=false)
	private Queja queja;
	
	
	
	private int numValor;
	public FichaParametros() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FichaParametros(int idFichaParametro, RegistroCita registroCita, Queja queja, int numValor) {
		super();
		this.idFichaParametro = idFichaParametro;
		this.registroCita = registroCita;
		this.queja = queja;
		this.numValor = numValor;
	}
	public int getIdFichaParametro() {
		return idFichaParametro;
	}
	public void setIdFichaParametro(int idFichaParametro) {
		this.idFichaParametro = idFichaParametro;
	}
	public RegistroCita getRegistroCita() {
		return registroCita;
	}
	public void setRegistroCita(RegistroCita registroCita) {
		this.registroCita = registroCita;
	}
	public Queja getQueja() {
		return queja;
	}
	public void setQueja(Queja queja) {
		this.queja = queja;
	}
	public int getNumValor() {
		return numValor;
	}
	public void setNumValor(int numValor) {
		this.numValor = numValor;
	}


}
