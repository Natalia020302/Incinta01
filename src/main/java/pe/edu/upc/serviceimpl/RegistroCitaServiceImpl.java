package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRegistroCitaDao;
import pe.edu.upc.entity.RegistroCita;
import pe.edu.upc.service.IRegistroCitaService;

@Named
@RequestScoped
public class RegistroCitaServiceImpl implements IRegistroCitaService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IRegistroCitaDao mD;
	
	
	@Override
	public void insertar(RegistroCita registroCita) {
		mD.insertar(registroCita);
		
	}

	@Override
	public List<RegistroCita> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idRegistroCita) {
		mD.eliminar(idRegistroCita);
	}
	
	

}