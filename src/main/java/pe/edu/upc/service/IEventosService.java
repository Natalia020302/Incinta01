package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Eventos;

public interface IEventosService {
	public void insertar(Eventos eventos);
	public List<Eventos> listar();
	public void eliminar(int idEventos);
	
	//update
	public int update(Eventos eventos);
}