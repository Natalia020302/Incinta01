package pe.edu.upc.service;

import java.util.Date;
import java.util.List;

import pe.edu.upc.entity.PeriodoGestacion;

public interface IPeriodoGestacionService {
	public void insertar(PeriodoGestacion periodoGestacion);
	public List<PeriodoGestacion> listar();
	public void eliminar(int idPeriodoGestacion, Date fecha_actualizacion);
}