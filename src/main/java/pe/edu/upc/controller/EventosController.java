package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import pe.edu.upc.entity.Eventos;
import pe.edu.upc.entity.Usuario;


import pe.edu.upc.service.IEventosService;
import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.util.Message;

@Named
@RequestScoped
public class EventosController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEventosService rService;
	
	@Inject
	private IUsuarioService uService;

	private Eventos eventos;
	private Usuario usuario;
	
	
	private Eventos eventoSelect;

	
	
	List<Eventos> listaEventos;
	List<Usuario> listaUsuarios;

	
	@PostConstruct
	public void init() {
		this.listaEventos = new ArrayList<Eventos>();
		this.listaUsuarios = new ArrayList<Usuario>();

		
		this.eventos = new Eventos();
		this.usuario = new Usuario();

		this.listareventos();
		this.listarusuario();

	}

	public String nuevoEventos() {
		this.setEventos(new Eventos());
		return "insertEvento.xhtml";
	}
	
	public void insertar() {
		rService.insertar(eventos);
		limpiarEventos();
		this.listareventos();
	}
	
	public void listareventos() {
		listaEventos = rService.listar();
	}
	
	
	public void listarusuario() {
		listaUsuarios = uService.listar();
	}
	
	public void limpiarEventos() {
		this.init();
	}
	
	public void eliminar(Eventos eventos) {
		rService.eliminar(eventos.getiDEvento());
		this.listareventos();
	}
	
	//agregando select product y edit evento
	
	
	public void eventoSelect(SelectEvent e) {
		this.eventoSelect = (Eventos)e.getObject();
		
	}
	
	
	
	public String editEvento() {
		String view =" ";
		try {
			if(this.eventoSelect !=null)
			{
				this.eventos = this.eventoSelect;
				view ="updateEvento";
			}
			else {
				Message.messageError("Debe seleccionar un evento");
			}
		}
		catch (Exception e) {
			Message.messageError("Error en evento: " + e.getMessage());
		}
		return view;
		
	}
	
	/*	//<--!nuevo!-->
	
	public void eventoSelect(SelectEvent e) {
		this.eventoSelect = (Eventos)e.getObject();
	}
	

	
	public String editEvento() {
		String view = "";
		try 
		{
			if (this.eventoSelect != null) 
			{
				this.eventos = eventoSelect;
				view = "/updateEvento";
			}
			else 
			{
				Message.messageError("Debe Seleccionar un producto");
			}
		} 
		catch (Exception e) {
			Message.messageError("Error  en producto: " + e.getMessage());
		}
		return view;
	}
	
	public String deleteEvento() {
		String view = "";
		try {
			this.eventos = eventoSelect;
			productService.delete(this.eventos);
			Message.messageInfo("Registro Eliminado Correctamente");
			this.getAllEventos();
			view = "/product/list";
		} catch (Exception e) {
			Message.messageError("Error en producto " + e.getMessage());
		}
		return view;
	}
	
	public void searchEventoByName() {
		try {
			products = productService.findByName(this.filterName.trim());
			resetForm();
			if (products.isEmpty()) {
				Message.messageInfo("No se encontraron productos");
			}
		} catch (Exception e) {
			Message.messageError("Error en producto " + e.getMessage());
		}
	}
	
	public void productSelect(SelectEvent e) {
		this.productSelect = (Evento)e.getObject();
	}
	
	//nuevo*/
	
	
	

	public IEventosService getrService() {
		return rService;
	}

	public void setrService(IEventosService rService) {
		this.rService = rService;
	}

	public IUsuarioService getuService() {
		return uService;
	}

	public void setuService(IUsuarioService uService) {
		this.uService = uService;
	}

	public Eventos getEventos() {
		return eventos;
	}

	public void setEventos(Eventos eventos) {
		this.eventos = eventos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Eventos> getListaEventos() {
		return listaEventos;
	}

	public void setListaEventos(List<Eventos> listaEventos) {
		this.listaEventos = listaEventos;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	
}