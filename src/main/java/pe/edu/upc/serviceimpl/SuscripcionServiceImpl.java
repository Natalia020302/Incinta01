package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISuscripcionDao;
import pe.edu.upc.entity.Suscripcion;
import pe.edu.upc.service.ISuscripcionService;

@Named
@RequestScoped
public class SuscripcionServiceImpl implements ISuscripcionService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private ISuscripcionDao mD;
	
	
	@Override
	public void insertar(Suscripcion idsus) {
		mD.insertar(idsus);
		
	}

	@Override
	public List<Suscripcion> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idsus) {
		mD.eliminar(idsus);
	}
	
	

}