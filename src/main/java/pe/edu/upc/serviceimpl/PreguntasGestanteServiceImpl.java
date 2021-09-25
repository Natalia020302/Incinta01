package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPreguntasGestanteDao;
import pe.edu.upc.entity.PreguntasGestante;
import pe.edu.upc.service.IPreguntasGestanteService;

@Named
@RequestScoped
public class PreguntasGestanteServiceImpl implements IPreguntasGestanteService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IPreguntasGestanteDao mD;
	
	
	@Override
	public void insertar(PreguntasGestante preguntasGestante) {
		mD.insertar(preguntasGestante);
		
	}

	@Override
	public List<PreguntasGestante> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idPregunta) {
		mD.eliminar(idPregunta);
	}
	
	

}