package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Eventos;



public interface IEventosDao {
	public void insertar(Eventos eventos);
	
	public List<Eventos> listar();
	
	public void eliminar(int idEventos);
	
	public int update(Eventos evento) throws Exception;

}