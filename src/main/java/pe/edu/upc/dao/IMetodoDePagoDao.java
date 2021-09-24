package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.MetodoDePago;

public interface IMetodoDePagoDao {
	public void insertar(MetodoDePago metododePago);
	
	public List<MetodoDePago> listar();
	
	public void eliminar(int idMetodoDePago);

}