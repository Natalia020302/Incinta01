package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.ObstetraSuscripcion;

public interface IObstetraSuscripcionDao {
	public void insertar(ObstetraSuscripcion obstetraSuscripcion);
	
	public List<ObstetraSuscripcion> listar();
	
	public void eliminar(int idObstetraSuscripcion);

}
