package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.TipoCertificado;

public interface ITipoCertificadoService {
	public void insertar(TipoCertificado tc);
	public List<TipoCertificado> listar();
	public void eliminar(int idtc);
}