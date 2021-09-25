package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Unidad;

public interface IUnidadService {
	public void insertar(Unidad unidad);
	public List<Unidad> listar();
	public void eliminar(int idUnidad);
}