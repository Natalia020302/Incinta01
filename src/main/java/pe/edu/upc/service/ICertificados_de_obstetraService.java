package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Certificados_de_obstetra;

public interface ICertificados_de_obstetraService {
	public void insertar(Certificados_de_obstetra cdo);
	public List<Certificados_de_obstetra> listar();
	public void eliminar(int idCertificado, int IDObstetra);
}