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

@Entity
@Table(name="Horario")
public class Horario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Horario;
	
	@ManyToOne
	@JoinColumn(name="diaID", nullable=false)
	private int ID_Dia;
	
	@ManyToOne
	@JoinColumn(name="GestanteID", nullable=false)
	private int ID_Gestante;
	
	@Column(name="Titulo", nullable=false, length=40)
	private String T_Titulo;
	
	private String T_Descripcion;
	
	@Column(name="Centro", nullable=false, length=30)
	private String Nombre_Centro;
	
	private String Ubicacion_Centro;
	
	@Column(name="Telefono-Centro", nullable=false, length=9)
	private String Telef_Centro;
	
	private String Referencia_Centro;
	
	private int Hora_disponible;
	
	public Horario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getID_Dia() {
		return ID_Dia;
	}

	public void setID_Dia(int iD_Dia) {
		ID_Dia = iD_Dia;
	}

	public int getID_Gestante() {
		return ID_Gestante;
	}

	public void setID_Gestante(int iD_Gestante) {
		ID_Gestante = iD_Gestante;
	}

	public String getT_Titulo() {
		return T_Titulo;
	}

	public void setT_Titulo(String t_Titulo) {
		T_Titulo = t_Titulo;
	}

	public String getT_Descripcion() {
		return T_Descripcion;
	}

	public void setT_Descripcion(String t_Descripcion) {
		T_Descripcion = t_Descripcion;
	}

	public String getNombre_Centro() {
		return Nombre_Centro;
	}

	public void setNombre_Centro(String nombre_Centro) {
		Nombre_Centro = nombre_Centro;
	}

	public String getUbicacion_Centro() {
		return Ubicacion_Centro;
	}

	public void setUbicacion_Centro(String ubicacion_Centro) {
		Ubicacion_Centro = ubicacion_Centro;
	}

	public String getTelef_Centro() {
		return Telef_Centro;
	}

	public void setTelef_Centro(String telef_Centro) {
		Telef_Centro = telef_Centro;
	}

	public String getReferencia_Centro() {
		return Referencia_Centro;
	}

	public void setReferencia_Centro(String referencia_Centro) {
		Referencia_Centro = referencia_Centro;
	}

	public int getHora_disponible() {
		return Hora_disponible;
	}

	public void setHora_disponible(int hora_disponible) {
		Hora_disponible = hora_disponible;
	}

	public Horario(int iD_Dia, int iD_Gestante, String t_Titulo, String t_Descripcion, String nombre_Centro,
			String ubicacion_Centro, String telef_Centro, String referencia_Centro, int hora_disponible) {
		super();
		ID_Dia = iD_Dia;
		ID_Gestante = iD_Gestante;
		T_Titulo = t_Titulo;
		T_Descripcion = t_Descripcion;
		Nombre_Centro = nombre_Centro;
		Ubicacion_Centro = ubicacion_Centro;
		Telef_Centro = telef_Centro;
		Referencia_Centro = referencia_Centro;
		Hora_disponible = hora_disponible;
	}

}
