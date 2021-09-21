package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPreguntas_GestanteDao;
import pe.edu.upc.entity.Preguntas_Gestante;
import pe.edu.upc.service.IPreguntas_GestanteService;

@Named
@RequestScoped
public class Preguntas_GestanteServiceImpl implements IPreguntas_GestanteService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IPreguntas_GestanteDao mD;
	
	
	@Override
	public void insertar(Preguntas_Gestante preguntas_Gestante) {
		mD.insertar(preguntas_Gestante);
		
	}

	@Override
	public List<Preguntas_Gestante> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idPreguntas_Gestante, int IDGestante) {
		mD.eliminar(idPreguntas_Gestante, IDGestante);
	}
	
	

}