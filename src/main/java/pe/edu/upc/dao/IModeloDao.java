package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Modelo;

public interface IModeloDao {
	public void insertar(Modelo modelo);
	
	public List<Modelo> listar();
	
	public void eliminar(int idModelo);

}