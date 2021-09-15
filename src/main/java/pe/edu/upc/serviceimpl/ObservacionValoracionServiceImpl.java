package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IObservacionValoracionDao;
import pe.edu.upc.entity.ObservacionValoracion;
import pe.edu.upc.service.IObservacionValoracionService;

@Named
@RequestScoped
public class ObservacionValoracionServiceImpl implements IObservacionValoracionService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IObservacionValoracionDao mD;
	
	
	@Override
	public void insertar(ObservacionValoracion observacionValoracion) {
		mD.insertar(observacionValoracion);
		
	}

	@Override
	public List<ObservacionValoracion> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idObservacionValoracion) {
		mD.eliminar(idObservacionValoracion);
	}
	
	

}
