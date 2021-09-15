package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.FichaRegistroMedico;

public interface IFichaRegistroMedicoService {
	public void insertar(FichaRegistroMedico ficharegistromedico);
	public List<FichaRegistroMedico> listar();
	public void eliminar(int idFicha);
}
