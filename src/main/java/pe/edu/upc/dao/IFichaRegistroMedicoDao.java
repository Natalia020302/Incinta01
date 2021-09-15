package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.FichaRegistroMedico;

public interface IFichaRegistroMedicoDao {
	public void insertar(FichaRegistroMedico ficharegistromedico);
	
	public List<FichaRegistroMedico> listar();
	
	public void eliminar(int idFicha);

}
