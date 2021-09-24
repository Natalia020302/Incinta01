package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CertificadosDeObstetra;

public interface ICertificadosDeObstetraDao {
	public void insertar(CertificadosDeObstetra certificadosdeobstetra);
	
	public List<CertificadosDeObstetra> listar();
	
	public void eliminar(int idCertificadosDeObstetra);

}