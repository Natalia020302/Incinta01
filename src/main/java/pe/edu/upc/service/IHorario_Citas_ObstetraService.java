package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Horario_Citas_Obstetra;

public interface IHorario_Citas_ObstetraService {
	public void insertar(Horario_Citas_Obstetra hco);
	public List<Horario_Citas_Obstetra> listar();
	public void eliminar(int idhco);
}