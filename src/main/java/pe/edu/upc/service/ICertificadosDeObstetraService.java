package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CertificadosDeObstetra;

public interface ICertificadosDeObstetraService {
	public void insertar(CertificadosDeObstetra cdo);
	public List<CertificadosDeObstetra> listar();
	public void eliminar(int idcdo);
}