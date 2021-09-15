package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.ObservacionValoracion;

public interface IObservacionValoracionDao {
	public void insertar(ObservacionValoracion observacionValoracion);
	
	public List<ObservacionValoracion> listar();
	
	public void eliminar(int idObservacionValoracion);

}
