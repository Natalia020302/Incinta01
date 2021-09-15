package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.PreguntasGestante;

public interface IPreguntasGestanteDao {
	public void insertar(PreguntasGestante preguntasGestante);
	
	public List<PreguntasGestante> listar();
	
	public void eliminar(int idPreguntasGestante);

}
