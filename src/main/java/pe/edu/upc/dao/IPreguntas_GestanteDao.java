package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Preguntas_Gestante;

public interface IPreguntas_GestanteDao {
	public void insertar(Preguntas_Gestante preguntas_Gestante);
	
	public List<Preguntas_Gestante> listar();
	
	public void eliminar(int idPreguntas_Gestante);

}