package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IParametroDao;
import pe.edu.upc.entity.Parametro;
import pe.edu.upc.service.IParametroService;

@Named
@RequestScoped
public class ParametroServiceImpl implements IParametroService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IParametroDao mD;
	
	
	@Override
	public void insertar(Parametro parametro) {
		mD.insertar(parametro);
		
	}

	@Override
	public List<Parametro> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idParametro) {
		mD.eliminar(idParametro);
	}
	
	

}