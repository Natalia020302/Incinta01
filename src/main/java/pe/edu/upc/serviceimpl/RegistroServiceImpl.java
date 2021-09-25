package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRegistroDao;
import pe.edu.upc.entity.Registro;
import pe.edu.upc.service.IRegistroService;

@Named
@RequestScoped
public class RegistroServiceImpl implements IRegistroService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IRegistroDao mD;
	
	
	@Override
	public void insertar(Registro registro) {
		mD.insertar(registro);
		
	}

	@Override
	public List<Registro> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idRegistro) {
		mD.eliminar(idRegistro);
	}
	
	

}