package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRegistro_CitaDao;
import pe.edu.upc.entity.Registro_Cita;
import pe.edu.upc.service.IRegistro_CitaService;

@Named
@RequestScoped
public class Registro_CitaServiceImpl implements IRegistro_CitaService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IRegistro_CitaDao mD;
	
	
	@Override
	public void insertar(Registro_Cita registro_Cita) {
		mD.insertar(registro_Cita);
		
	}

	@Override
	public List<Registro_Cita> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idRegistro_Cita) {
		mD.eliminar(idRegistro_Cita);
	}
	
	

}