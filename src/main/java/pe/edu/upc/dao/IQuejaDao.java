package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Queja;

public interface IQuejaDao {
	public void insertar(Queja queja);
	
	public List<Queja> listar();
	
	public void eliminar(int idQueja);

}