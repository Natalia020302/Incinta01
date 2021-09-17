package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Tipo_identificacion;

public interface ITipo_identificacionService {
	public void insertar(Tipo_identificacion tipo_identificacion);
	public List<Tipo_identificacion> listar();
	public void eliminar(int idTipo_identificacion);
}