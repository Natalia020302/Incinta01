package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Parametro;

public interface IParametroService {
	public void insertar(Parametro parametro);
	public List<Parametro> listar();
	public int update(Parametro parametro);
	public void eliminar(int idParametro);
}