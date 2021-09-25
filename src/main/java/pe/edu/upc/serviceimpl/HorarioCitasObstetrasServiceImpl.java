package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHorarioCitasObstetrasDao;
import pe.edu.upc.entity.HorarioCitasObstetras;
import pe.edu.upc.service.IHorarioCitasObstetrasService;

@Named
@RequestScoped
public class HorarioCitasObstetrasServiceImpl implements IHorarioCitasObstetrasService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IHorarioCitasObstetrasDao mD;
	
	
	@Override
	public void insertar(HorarioCitasObstetras hco) {
		mD.insertar(hco);
		
	}

	@Override
	public List<HorarioCitasObstetras> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idhco) {
		mD.eliminar(idhco);
	}
	
	

}