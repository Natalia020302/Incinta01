package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEventosDao;
import pe.edu.upc.entity.Eventos;
import pe.edu.upc.service.IEventosService;

@Named
@RequestScoped
public class EventosServiceImpl implements IEventosService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IEventosDao mD;
	
	
	@Override
	public void insertar(Eventos eventos) {
		mD.insertar(eventos);
		
	}

	@Override
	public List<Eventos> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idEventos) {
		mD.eliminar(idEventos);
	}
	
	public int update(Eventos eventos) throws Exception {
		return mD.update(eventos);
	}
	

}