package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Unidad;

public interface IUnidadDao {
	public void insertar(Unidad Unidad);
	
	public List<Unidad> listar();
	
	public void eliminar(int idUnidad);

}