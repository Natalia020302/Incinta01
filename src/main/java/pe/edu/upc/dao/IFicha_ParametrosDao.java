package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Ficha_Parametros;

public interface IFicha_ParametrosDao {
	public void insertar(Ficha_Parametros ficha_Parametros);
	
	public List<Ficha_Parametros> listar();
	
	public void eliminar(int idFicha_Parametros, int ID_RegistroCita);

}