package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Obstetra;

public interface IObstetraDao {
	public void insertar(Obstetra obstetra);
	
	public List<Obstetra> listar();
	
	public void eliminar(int idObstetra);

}