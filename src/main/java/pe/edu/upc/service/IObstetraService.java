package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Obstetra;

public interface IObstetraService {
	public void insertar(Obstetra obs);
	public List<Obstetra> listar();
	public void eliminar(int idobs);
}