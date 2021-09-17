package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Comentarios;

public interface IComentariosService {
	public void insertar(Comentarios comentarios);
	public List<Comentarios> listar();
	public void eliminar(int idComentarios);
}