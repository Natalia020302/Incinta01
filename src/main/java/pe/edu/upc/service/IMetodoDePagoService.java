package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.MetodoDePago;

public interface IMetodoDePagoService {
	public void insertar(MetodoDePago metododePago);
	public List<MetodoDePago> listar();
	public void eliminar(int idMetodoDePago);
}