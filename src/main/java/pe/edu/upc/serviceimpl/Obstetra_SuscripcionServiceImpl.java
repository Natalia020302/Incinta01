package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IObstetra_SuscripcionDao;
import pe.edu.upc.entity.Obstetra_Suscripcion;
import pe.edu.upc.service.IObstetra_SuscripcionService;

@Named
@RequestScoped
public class Obstetra_SuscripcionServiceImpl implements IObstetra_SuscripcionService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IObstetra_SuscripcionDao mD;
	
	
	@Override
	public void insertar(Obstetra_Suscripcion os) {
		mD.insertar(os);
		
	}

	@Override
	public List<Obstetra_Suscripcion> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int id_suscripcion, Date fechainicio, int idobstetra) {
		mD.eliminar(id_suscripcion,fechainicio,idobstetra);
	}
	
	

}