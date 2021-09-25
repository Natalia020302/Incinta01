package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.RegistroCita;

public interface IRegistroCitaService {
	public void insertar(RegistroCita registroCita);
	public List<RegistroCita> listar();
	public void eliminar(int idRegistroCita);
}