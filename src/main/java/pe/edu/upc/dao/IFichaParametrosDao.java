package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.FichaParametros;

public interface IFichaParametrosDao {
	public void insertar(FichaParametros fichaParametros);
	
	public List<FichaParametros> listar();
	
	public void eliminar(int idFichaParametro);

}