package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Registro_Cita;

public interface IRegistro_CitaDao {
	public void insertar(Registro_Cita registro_Cita);
	
	public List<Registro_Cita> listar();
	
	public void eliminar(int idRegistro_Cita);

}