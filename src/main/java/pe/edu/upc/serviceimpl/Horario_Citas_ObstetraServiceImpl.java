package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHorario_Citas_ObstetraDao;
import pe.edu.upc.entity.Horario_Citas_Obstetra;
import pe.edu.upc.service.IHorario_Citas_ObstetraService;

@Named
@RequestScoped
public class Horario_Citas_ObstetraServiceImpl implements IHorario_Citas_ObstetraService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IHorario_Citas_ObstetraDao mD;
	
	
	@Override
	public void insertar(Horario_Citas_Obstetra hco) {
		mD.insertar(hco);
		
	}

	@Override
	public List<Horario_Citas_Obstetra> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idhco) {
		mD.eliminar(idhco);
	}
	
	

}