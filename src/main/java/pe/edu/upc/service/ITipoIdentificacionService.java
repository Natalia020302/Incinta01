
package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.TipoIdentificacion;

public interface ITipoIdentificacionService {

	public void insertar(TipoIdentificacion tipoidentificacion);
	public List<TipoIdentificacion> listar();
	public void eliminar(int idTipoIdentificacion);
}