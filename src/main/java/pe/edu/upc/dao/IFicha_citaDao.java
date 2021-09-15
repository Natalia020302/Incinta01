package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Ficha_cita;

public interface IFicha_citaDao {
	public void insertar(Ficha_cita fc);
	
	public List<Ficha_cita> listar();
	
	public void eliminar(int idFicha_cita);

}
