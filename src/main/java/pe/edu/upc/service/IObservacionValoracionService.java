package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.ObservacionValoracion;

public interface IObservacionValoracionService {
	public void insertar(ObservacionValoracion observacionValoracion);
	public List<ObservacionValoracion> listar();
	public void eliminar(int idObservacionValoracion);
}
