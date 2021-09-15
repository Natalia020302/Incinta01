package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Cita;

public interface ICitaDao {
	public void insertar(Cita cita);
	
	public List<Cita> listar();
	
	public void eliminar(int idCita);

}
