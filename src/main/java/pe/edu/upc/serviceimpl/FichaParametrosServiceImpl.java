package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IFichaParametrosDao;
import pe.edu.upc.entity.FichaParametros;
import pe.edu.upc.service.IFichaParametrosService;

@Named
@RequestScoped
public class FichaParametrosServiceImpl implements IFichaParametrosService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IFichaParametrosDao mD;
	
	
	@Override
	public void insertar(FichaParametros fichaParametros) {
		mD.insertar(fichaParametros);
		
	}

	@Override
	public List<FichaParametros> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idFichaParametro) {
		mD.eliminar(idFichaParametro);
	}
	
	

}