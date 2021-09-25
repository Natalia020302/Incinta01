package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Obstetra;

 import pe.edu.upc.entity.Pais;
 import pe.edu.upc.entity.MetodoDePago;
 import pe.edu.upc.entity.TipoIdentificacion;

import pe.edu.upc.service.IObstetraService;


 import pe.edu.upc.service.IPaisService;
 import pe.edu.upc.service.IMetodoDePagoService;
 import pe.edu.upc.service.ITipoIdentificacionService;

@Named
@RequestScoped
public class ObstetraController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IObstetraService uService;
	
	@Inject
	private IPaisService aService;
	@Inject
	private IMetodoDePagoService bService;
	@Inject
	private ITipoIdentificacionService cService;

	private Obstetra obstetra;
	

	private Pais pais;
	private MetodoDePago metododepago;
	private TipoIdentificacion tipoidentificacion;

	
	List<Obstetra> listaObstetra;
	

	List<Pais> listapais;
	List<MetodoDePago> listapaismetododepago;
	List<TipoIdentificacion> listapaistipoidentificacion;

	
	@PostConstruct
	public void init() {
		this.listaObstetra = new ArrayList<Obstetra>();
		

		this.listapais = new ArrayList<Pais>();
		this.listapaismetododepago = new ArrayList<MetodoDePago>();
		this.listapaistipoidentificacion = new ArrayList<TipoIdentificacion>();

		
		this.obstetra = new Obstetra();
		

		this.pais = new Pais();
		this.metododepago = new MetodoDePago();
		this.tipoidentificacion = new TipoIdentificacion();

		
		this.listar();
		

		this.listarPais();
		this.listarMetodoDePago();
		this.listarTipoIdentificacion();

		
	}

	public String nuevoObstetra() {
		this.setObstetra(new Obstetra());
		return "Obstetra.xhtml";
	}
	
	public void insertar() {
		uService.insertar(obstetra);
		limpiarObstetra();
	}
	
	public void listar() {
		listaObstetra = uService.listar();
	}
	

	
	public void listarPais() {
		listapais = aService.listar();
	}
	
	public void listarMetodoDePago() {
		listapaismetododepago = bService.listar();
	}
	
	public void listarTipoIdentificacion() {
		listapaistipoidentificacion = cService.listar();
	}
	

	
	public void limpiarObstetra() {
		this.init();
	}
	
	public void eliminar(Obstetra obstetra) {
		uService.eliminar(obstetra.getIdobstetra());
	}	/* GETTERS AND SETTERS */

	public IObstetraService getuService() {
		return uService;
	}

	public void setuService(IObstetraService uService) {
		this.uService = uService;
	}

	public IPaisService getaService() {
		return aService;
	}

	public void setaService(IPaisService aService) {
		this.aService = aService;
	}

	public IMetodoDePagoService getbService() {
		return bService;
	}

	public void setbService(IMetodoDePagoService bService) {
		this.bService = bService;
	}

	public ITipoIdentificacionService getcService() {
		return cService;
	}

	public void setcService(ITipoIdentificacionService cService) {
		this.cService = cService;
	}

	public Obstetra getObstetra() {
		return obstetra;
	}

	public void setObstetra(Obstetra obstetra) {
		this.obstetra = obstetra;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public MetodoDePago getMetododepago() {
		return metododepago;
	}

	public void setMetododepago(MetodoDePago metododepago) {
		this.metododepago = metododepago;
	}

	public TipoIdentificacion getTipoidentificacion() {
		return tipoidentificacion;
	}

	public void setTipoidentificacion(TipoIdentificacion tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}

	public List<Obstetra> getListaObstetra() {
		return listaObstetra;
	}

	public void setListaObstetra(List<Obstetra> listaObstetra) {
		this.listaObstetra = listaObstetra;
	}

	public List<Pais> getListapais() {
		return listapais;
	}

	public void setListapais(List<Pais> listapais) {
		this.listapais = listapais;
	}

	public List<MetodoDePago> getListapaismetododepago() {
		return listapaismetododepago;
	}

	public void setListapaismetododepago(List<MetodoDePago> listapaismetododepago) {
		this.listapaismetododepago = listapaismetododepago;
	}

	public List<TipoIdentificacion> getListapaistipoidentificacion() {
		return listapaistipoidentificacion;
	}

	public void setListapaistipoidentificacion(List<TipoIdentificacion> listapaistipoidentificacion) {
		this.listapaistipoidentificacion = listapaistipoidentificacion;
	}

}