package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.HorarioCitasObstetras;

public interface IHorarioCitasObstetrasService {
	public void insertar(HorarioCitasObstetras hco);
	public List<HorarioCitasObstetras> listar();
	public void eliminar(int idhco);
}