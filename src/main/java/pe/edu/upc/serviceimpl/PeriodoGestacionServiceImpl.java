package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPeriodoGestacionDao;
import pe.edu.upc.entity.PeriodoGestacion;
import pe.edu.upc.service.IPeriodoGestacionService;

@Named
@RequestScoped
public class PeriodoGestacionServiceImpl implements IPeriodoGestacionService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IPeriodoGestacionDao mD;
	
	
	@Override
	public void insertar(PeriodoGestacion periodogestacion) {
		mD.insertar(periodogestacion);
		
	}

	@Override
	public List<PeriodoGestacion> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idPeriodoGestacion) {
		mD.eliminar(idPeriodoGestacion);
	}
	
	

}