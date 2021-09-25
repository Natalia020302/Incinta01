package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Registro;

public interface IRegistroService {
	public void insertar(Registro registro);
	public List<Registro> listar();
	public void eliminar(int idRegistro);
}