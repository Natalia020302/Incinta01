package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMetodoDePagoDao;
import pe.edu.upc.entity.MetodoDePago;
import pe.edu.upc.service.IMetodoDePagoService;

@Named
@RequestScoped
public class MetodoDePagoServiceImpl implements IMetodoDePagoService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IMetodoDePagoDao mD;
	
	
	@Override
	public void insertar(MetodoDePago metododePago) {
		mD.insertar(metododePago);
		
	}

	@Override
	public List<MetodoDePago> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idMetodoDePago) {
		mD.eliminar(idMetodoDePago);
	}
	
	

}