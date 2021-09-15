package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Cita;

public interface ICitaService {
	public void insertar(Cita cita);
	public List<Cita> listar();
	public void eliminar(int idCita);
}
