package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Horario_Citas_Obstetra;

public interface IHorario_Citas_ObstetraDao {
	public void insertar(Horario_Citas_Obstetra HCO);
	
	public List<Horario_Citas_Obstetra> listar();
	
	public void eliminar(int idHCO);

}