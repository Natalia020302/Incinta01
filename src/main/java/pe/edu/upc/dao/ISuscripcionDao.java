package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Suscripcion;

public interface ISuscripcionDao {
	public void insertar(Suscripcion susc);
	
	public List<Suscripcion> listar();
	
	public void eliminar(int idSuscripcion);

}