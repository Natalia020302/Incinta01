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
@Table(name="Eventos")
public class Eventos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Evento;
	
	
	@ManyToOne
	@JoinColumn(name="UsuarioID", nullable=false)
	private int UsuarioID;

	
	
	@Column(name="Titulo", nullable=false, length=30)
	private String T_Titulo;
	
	
	@Column(name="Descripcion", nullable=true)
	private String T_Descripcion;
	
	
	@Column(name="Fecha", nullable=false)
	private Date Fecha_evento;
	
	
	@Column(name="Hora_Inicio", nullable=false)
	private String HInicio;
	
	
	@Column(name="Hora_Fin", nullable=false)
	private String HFin;

	@Column(name="Todo_el_dia")
	private Boolean Bool_Todo_dia;
	

	@Column(name="Repeticion", nullable=false)
	private int QRepeticion;
	
	
	public Eventos() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Eventos(int iD_Evento, int usuarioID, String t_Titulo, String t_Descripcion, Date fecha_evento,
			String hInicio, String hFin, Boolean bool_Todo_dia, int qRepeticion) {
		super();
		ID_Evento = iD_Evento;
		UsuarioID = usuarioID;
		T_Titulo = t_Titulo;
		T_Descripcion = t_Descripcion;
		Fecha_evento = fecha_evento;
		HInicio = hInicio;
		HFin = hFin;
		Bool_Todo_dia = bool_Todo_dia;
		QRepeticion = qRepeticion;
	}


	public int getID_Evento() {
		return ID_Evento;
	}


	public void setID_Evento(int iD_Evento) {
		ID_Evento = iD_Evento;
	}


	public int getUsuarioID() {
		return UsuarioID;
	}


	public void setUsuarioID(int usuarioID) {
		UsuarioID = usuarioID;
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


	public Date getFecha_evento() {
		return Fecha_evento;
	}


	public void setFecha_evento(Date fecha_evento) {
		Fecha_evento = fecha_evento;
	}


	public String getHInicio() {
		return HInicio;
	}


	public void setHInicio(String hInicio) {
		HInicio = hInicio;
	}


	public String getHFin() {
		return HFin;
	}


	public void setHFin(String hFin) {
		HFin = hFin;
	}


	public Boolean getBool_Todo_dia() {
		return Bool_Todo_dia;
	}


	public void setBool_Todo_dia(Boolean bool_Todo_dia) {
		Bool_Todo_dia = bool_Todo_dia;
	}


	public int getQRepeticion() {
		return QRepeticion;
	}


	public void setQRepeticion(int qRepeticion) {
		QRepeticion = qRepeticion;
	}


	






	

}
