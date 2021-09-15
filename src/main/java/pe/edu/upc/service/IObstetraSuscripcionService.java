package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.ObstetraSuscripcion;

public interface IObstetraSuscripcionService {
	public void insertar(ObstetraSuscripcion obstetraSuscripcion);
	public List<ObstetraSuscripcion> listar();
	public void eliminar(int idObstetraSuscripcion);
}
