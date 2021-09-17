package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipo_identificacionDao;
import pe.edu.upc.entity.Tipo_identificacion;
import pe.edu.upc.service.ITipo_identificacionService;

@Named
@RequestScoped
public class Tipo_identificacionServiceImpl implements ITipo_identificacionService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private ITipo_identificacionDao mD;
	
	
	@Override
	public void insertar(Tipo_identificacion tipo_identificacion) {
		mD.insertar(tipo_identificacion);
		
	}

	@Override
	public List<Tipo_identificacion> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idTipo_identificacion) {
		mD.eliminar(idTipo_identificacion);
	}
	
	

}