package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.PeriodoGestacion;

public interface IPeriodoGestacionDao {
	public void insertar(PeriodoGestacion periodoGestacion);
	
	public List<PeriodoGestacion> listar();
	
	public void eliminar(int idPeriodoGestacion);

}