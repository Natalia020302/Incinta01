package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MetodoDePago")
public class MetodoDePago implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iDMetodoPago;
	
	@Column(name="nombreMetodoPago", nullable=false, length=30)
	private String nMetodoPago;
	

	public MetodoDePago() {
		super();
		
	}


	public MetodoDePago(int iDMetodoPago, String nMetodoPago) {
		super();
		this.iDMetodoPago = iDMetodoPago;
		this.nMetodoPago = nMetodoPago;
	}


	public int getiDMetodoPago() {
		return iDMetodoPago;
	}


	public void setiDMetodoPago(int iDMetodoPago) {
		this.iDMetodoPago = iDMetodoPago;
	}


	public String getnMetodoPago() {
		return nMetodoPago;
	}


	public void setnMetodoPago(String nMetodoPago) {
		this.nMetodoPago = nMetodoPago;
	}


	
	


	
}
