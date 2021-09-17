package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Registro;

public interface IRegistroDao {
	public void insertar(Registro registro);
	
	public List<Registro> listar();
	
	public void eliminar(int idRegistro);

}