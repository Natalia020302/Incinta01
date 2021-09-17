package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IFicha_ParametrosDao;
import pe.edu.upc.entity.Ficha_Parametros;
import pe.edu.upc.service.IFicha_ParametrosService;

@Named
@RequestScoped
public class Ficha_ParametrosServiceImpl implements IFicha_ParametrosService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IFicha_ParametrosDao mD;
	
	
	@Override
	public void insertar(Ficha_Parametros ficha_Parametros) {
		mD.insertar(ficha_Parametros);
		
	}

	@Override
	public List<Ficha_Parametros> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idFicha_Parametros) {
		mD.eliminar(idFicha_Parametros);
	}
	
	

}