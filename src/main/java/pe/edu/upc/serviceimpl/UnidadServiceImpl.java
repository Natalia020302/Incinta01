package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUnidadDao;
import pe.edu.upc.entity.Unidad;
import pe.edu.upc.service.IUnidadService;

@Named
@RequestScoped
public class UnidadServiceImpl implements IUnidadService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IUnidadDao mD;
	
	
	@Override
	public void insertar(Unidad unidad) {
		mD.insertar(unidad);
		
	}

	@Override
	public List<Unidad> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idUnidad) {
		mD.eliminar(idUnidad);
	}

}