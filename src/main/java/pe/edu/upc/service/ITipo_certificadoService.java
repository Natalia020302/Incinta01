package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Tipo_certificado;

public interface ITipo_certificadoService {
	public void insertar(Tipo_certificado ti);
	public List<Tipo_certificado> listar();
	public void eliminar(int idti);
}