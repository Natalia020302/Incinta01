package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Queja;

public interface IQuejaService {
	public void insertar(Queja queja);
	public List<Queja> listar();
	public void eliminar(int idQueja);
}