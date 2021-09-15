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
@Table(name="FichaRegistroMedico")

public class FichaRegistroMedico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFicha;
	
	private Date Dsemana_de_gestacion;
	private int NPresion;
	private int NTemperatura;
	private int NPeso;
	private Date Fecha_fecha;
	private String T_Anotaciones;
	
	@ManyToOne
	@JoinColumn(name="UsuarioID", nullable=false)
	private int UsuarioID;

	public FichaRegistroMedico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FichaRegistroMedico(int idFicha, Date dsemana_de_gestacion, int nPresion, int nTemperatura, int nPeso,
			Date fecha_fecha, String t_Anotaciones, int usuarioID) {
		super();
		this.idFicha = idFicha;
		Dsemana_de_gestacion = dsemana_de_gestacion;
		NPresion = nPresion;
		NTemperatura = nTemperatura;
		NPeso = nPeso;
		Fecha_fecha = fecha_fecha;
		T_Anotaciones = t_Anotaciones;
		UsuarioID = usuarioID;
	}

	public int getIdFicha() {
		return idFicha;
	}

	public void setIdFicha(int idFicha) {
		this.idFicha = idFicha;
	}

	public Date getDsemana_de_gestacion() {
		return Dsemana_de_gestacion;
	}

	public void setDsemana_de_gestacion(Date dsemana_de_gestacion) {
		Dsemana_de_gestacion = dsemana_de_gestacion;
	}

	public int getNPresion() {
		return NPresion;
	}

	public void setNPresion(int nPresion) {
		NPresion = nPresion;
	}

	public int getNTemperatura() {
		return NTemperatura;
	}

	public void setNTemperatura(int nTemperatura) {
		NTemperatura = nTemperatura;
	}

	public int getNPeso() {
		return NPeso;
	}

	public void setNPeso(int nPeso) {
		NPeso = nPeso;
	}

	public Date getFecha_fecha() {
		return Fecha_fecha;
	}

	public void setFecha_fecha(Date fecha_fecha) {
		Fecha_fecha = fecha_fecha;
	}

	public String getT_Anotaciones() {
		return T_Anotaciones;
	}

	public void setT_Anotaciones(String t_Anotaciones) {
		T_Anotaciones = t_Anotaciones;
	}

	public int getUsuarioID() {
		return UsuarioID;
	}

	public void setUsuarioID(int usuarioID) {
		UsuarioID = usuarioID;
	}
}

//21:41