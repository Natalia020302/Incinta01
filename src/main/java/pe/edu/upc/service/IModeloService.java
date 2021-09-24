package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Modelo;

public interface IModeloService {
	public void insertar(Modelo A1);
	public List<Modelo> listar();
	public void eliminar(int idA1);
}