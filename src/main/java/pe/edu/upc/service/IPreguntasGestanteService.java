package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.PreguntasGestante;

public interface IPreguntasGestanteService {
	public void insertar(PreguntasGestante preguntasGestante);
	public List<PreguntasGestante> listar();
	public void eliminar(int idPreguntasGestante);
}
