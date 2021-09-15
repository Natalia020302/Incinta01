package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IFicha_citaDao;
import pe.edu.upc.entity.Ficha_cita;
import pe.edu.upc.service.IFicha_citaService;

@Named
@RequestScoped
public class Ficha_citaServiceImpl implements IFicha_citaService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IFicha_citaDao mD;
	
	
	@Override
	public void insertar(Ficha_cita fc) {
		mD.insertar(fc);
		
	}

	@Override
	public List<Ficha_cita> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idfc) {
		mD.eliminar(idfc);
	}
	
	

}
