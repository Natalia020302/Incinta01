package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IObstetraSuscripcionDao;
import pe.edu.upc.entity.ObstetraSuscripcion;
import pe.edu.upc.service.IObstetraSuscripcionService;

@Named
@RequestScoped
public class ObstetraSuscripcionServiceImpl implements IObstetraSuscripcionService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IObstetraSuscripcionDao mD;
	
	
	@Override
	public void insertar(ObstetraSuscripcion obstetraSuscripcion) {
		mD.insertar(obstetraSuscripcion);
		
	}

	@Override
	public List<ObstetraSuscripcion> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idObstetraSuscripcion) {
		mD.eliminar(idObstetraSuscripcion);
	}
	
	

}
