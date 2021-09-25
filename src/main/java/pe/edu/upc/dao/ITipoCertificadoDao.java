package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.TipoCertificado;

public interface ITipoCertificadoDao {
	public void insertar(TipoCertificado tipocertificado);
	
	public List<TipoCertificado> listar();
	
	public void eliminar(int idTipoCertificado);

}