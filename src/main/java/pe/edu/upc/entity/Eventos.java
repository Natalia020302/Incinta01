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
	private int iDEvento;
	
	@ManyToOne
	@JoinColumn(name="gestanteID", nullable=false)
	private Usuario iDGestante;
	

	@Column(name="titulo", nullable=false, length=30)
	private String titulo;
	
	@Column(name="descripcion", nullable=true)
	private String descripcion;
	
	@Column(name="fechaEvento", nullable=false)
	private Date fechaEvento;
	
	@Column(nullable=false)
	private Date hInicio;
	
	@Column(nullable=false)
	private Date hFin;
	
	@Column(name="todoElDia", nullable=true) //cambie por true
	private Boolean boolTodoDia;
	
	private int qRepeticion;

	public Eventos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Eventos(int iDEvento, Usuario iDGestante, String titulo, String descripcion, Date fechaEvento, Date hInicio,
			Date hFin, Boolean boolTodoDia, int qRepeticion) {
		super();
		this.iDEvento = iDEvento;
		this.iDGestante = iDGestante;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaEvento = fechaEvento;
		this.hInicio = hInicio;
		this.hFin = hFin;
		this.boolTodoDia = boolTodoDia;
		this.qRepeticion = qRepeticion;
	}

	public int getiDEvento() {
		return iDEvento;
	}

	public void setiDEvento(int iDEvento) {
		this.iDEvento = iDEvento;
	}

	public Usuario getiDGestante() {
		return iDGestante;
	}

	public void setiDGestante(Usuario iDGestante) {
		this.iDGestante = iDGestante;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public Date gethInicio() {
		return hInicio;
	}

	public void sethInicio(Date hInicio) {
		this.hInicio = hInicio;
	}

	public Date gethFin() {
		return hFin;
	}

	public void sethFin(Date hFin) {
		this.hFin = hFin;
	}

	public Boolean getBoolTodoDia() {
		return boolTodoDia;
	}

	public void setBoolTodoDia(Boolean boolTodoDia) {
		this.boolTodoDia = boolTodoDia;
	}

	public int getqRepeticion() {
		return qRepeticion;
	}

	public void setqRepeticion(int qRepeticion) {
		this.qRepeticion = qRepeticion;
	}

	
	
}
