package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICitaDao;
import pe.edu.upc.entity.Cita;
import pe.edu.upc.service.ICitaService;

@Named
@RequestScoped
public class CitaServiceImpl implements ICitaService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private ICitaDao mD;
	
	
	@Override
	public void insertar(Cita cita) {
		mD.insertar(cita);
		
	}

	@Override
	public List<Cita> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idCita) {
		mD.eliminar(idCita);
	}
	
	

}