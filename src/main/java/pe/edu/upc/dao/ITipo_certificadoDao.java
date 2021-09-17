package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Tipo_certificado;

public interface ITipo_certificadoDao {
	public void insertar(Tipo_certificado TC);
	
	public List<Tipo_certificado> listar();
	
	public void eliminar(int idTipo_Certificado);

}