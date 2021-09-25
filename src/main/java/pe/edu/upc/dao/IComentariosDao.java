package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Comentarios;

public interface IComentariosDao {
	public void insertar(Comentarios comentarios);
	
	public List<Comentarios> listar();
	
	public void eliminar(int idComentario);

}