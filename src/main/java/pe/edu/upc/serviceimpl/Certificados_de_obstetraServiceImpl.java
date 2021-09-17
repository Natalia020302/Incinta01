package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICertificados_de_obstetraDao;
import pe.edu.upc.entity.Certificados_de_obstetra;
import pe.edu.upc.service.ICertificados_de_obstetraService;

@Named
@RequestScoped
public class Certificados_de_obstetraServiceImpl implements ICertificados_de_obstetraService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private ICertificados_de_obstetraDao mD;
	
	
	@Override
	public void insertar(Certificados_de_obstetra cdo) {
		mD.insertar(cdo);
		
	}

	@Override
	public List<Certificados_de_obstetra> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idCertificado, int IDObstetra) {
		mD.eliminar(idCertificado, IDObstetra);
	}
	
	

}