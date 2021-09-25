package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.TipoIdentificacion;

public interface ITipoIdentificacionDao {
	public void insertar(TipoIdentificacion tipoIdentificacion);
	
	public List<TipoIdentificacion> listar();
	
	public void eliminar(int idTipoIdentificacion);

}