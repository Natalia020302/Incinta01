package pe.edu.upc.dao;

import java.util.Date;
import java.util.List;

import pe.edu.upc.entity.Obstetra_Suscripcion;

public interface IObstetra_SuscripcionDao {
	public void insertar(Obstetra_Suscripcion os);
	
	public List<Obstetra_Suscripcion> listar();
	
	public void eliminar(int id_suscripcion, Date fechainicio, int idobstetra);

}