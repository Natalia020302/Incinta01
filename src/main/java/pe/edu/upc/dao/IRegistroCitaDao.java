package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.RegistroCita;

public interface IRegistroCitaDao {
	public void insertar(RegistroCita registroCita);
	
	public List<RegistroCita> listar();
	
	public void eliminar(int idRegistroCita);

}