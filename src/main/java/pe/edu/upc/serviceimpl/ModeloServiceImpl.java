package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IModeloDao;
import pe.edu.upc.entity.Modelo;
import pe.edu.upc.service.IModeloService;

@Named
@RequestScoped
public class ModeloServiceImpl implements IModeloService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IModeloDao mD;
	
	
	@Override
	public void insertar(Modelo mdl) {
		mD.insertar(mdl);
		
	}

	@Override
	public List<Modelo> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idmdl) {
		mD.eliminar(idmdl);
	}
	
	

}