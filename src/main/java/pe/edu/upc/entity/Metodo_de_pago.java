package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Metodo_de_pago")
public class Metodo_de_pago implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDMetodo_Pago;
	
	@Column(name="MetodoPago", nullable=false, length=30)
	private String NMetodo_Pago;

	public Metodo_de_pago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Metodo_de_pago(int iDMetodo_Pago, String nMetodo_Pago) {
		super();
		IDMetodo_Pago = iDMetodo_Pago;
		NMetodo_Pago = nMetodo_Pago;
	}

	public int getIDMetodo_Pago() {
		return IDMetodo_Pago;
	}

	public void setIDMetodo_Pago(int iDMetodo_Pago) {
		IDMetodo_Pago = iDMetodo_Pago;
	}

	public String getNMetodo_Pago() {
		return NMetodo_Pago;
	}

	public void setNMetodo_Pago(String nMetodo_Pago) {
		NMetodo_Pago = nMetodo_Pago;
	}
	

	
	
	
	






	

}
