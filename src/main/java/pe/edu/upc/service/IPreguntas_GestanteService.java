package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Preguntas_Gestante;

public interface IPreguntas_GestanteService {
	public void insertar(Preguntas_Gestante preguntas_Gestante);
	public List<Preguntas_Gestante> listar();
	public void eliminar(int idPreguntas_Gestante);
}