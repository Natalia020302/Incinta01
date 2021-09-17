package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Metodo_de_pago;

public interface IMetodo_de_pagoService {
	public void insertar(Metodo_de_pago metodo_de_pago);
	public List<Metodo_de_pago> listar();
	public void eliminar(int idMetodo_de_pago);
}



