package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.FichaParametros;

public interface IFichaParametrosService {
	public void insertar(FichaParametros fichaParametros);
	public List<FichaParametros> listar();
	public void eliminar(int idFichaParametro);
}