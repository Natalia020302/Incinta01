package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IObstetraDao;
import pe.edu.upc.entity.Obstetra;
import pe.edu.upc.service.IObstetraService;

@Named
@RequestScoped
public class ObstetraServiceImpl implements IObstetraService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IObstetraDao mD;
	
	
	@Override
	public void insertar(Obstetra mdl) {
		mD.insertar(mdl);
		
	}

	@Override
	public List<Obstetra> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int obs) {
		mD.eliminar(idobs);
	}
	
	

}