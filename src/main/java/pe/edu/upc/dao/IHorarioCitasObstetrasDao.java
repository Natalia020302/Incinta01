package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.HorarioCitasObstetras;

public interface IHorarioCitasObstetrasDao {
	public void insertar(HorarioCitasObstetras horariocitasobstetras);
	
	public List<HorarioCitasObstetras> listar();
	
	public void eliminar(int idHorarioCitasObstetras);

}