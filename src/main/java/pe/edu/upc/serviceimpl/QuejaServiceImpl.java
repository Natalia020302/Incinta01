package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IQuejaDao;
import pe.edu.upc.entity.Queja;
import pe.edu.upc.service.IQuejaService;

@Named
@RequestScoped
public class QuejaServiceImpl implements IQuejaService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IQuejaDao mD;
	
	
	@Override
	public void insertar(Queja queja) {
		mD.insertar(queja);
		
	}

	@Override
	public List<Queja> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idQueja) {
		mD.eliminar(idQueja);
	}
	
	

}