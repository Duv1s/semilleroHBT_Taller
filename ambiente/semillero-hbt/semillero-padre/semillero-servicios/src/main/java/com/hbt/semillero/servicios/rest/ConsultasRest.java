package com.hbt.semillero.servicios.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.servicios.interfaces.IConsultasEjbLocal;

/**
 * Componente que expone servicios rest.
 * @author Duvis Alejandro Gómez Neira
 *
 */
@Path("/ConsultasRest")
public class ConsultasRest {
	
	@EJB
	private IConsultasEjbLocal consultaEJB;
	
	/**
	 * Consulta las bebidas existentes en el sistema
	 * @return
	 */
	@GET
	@Path("/consultarBebidas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BebidaDTO> consultarBebidas(){
		return consultaEJB.consultarBebidas();
	}
	
	/**
	 * Consulta los platos existentes en el sistema
	 * @return
	 */
	@GET
	@Path("/consultarPlatos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PlatoDTO> consultarPlatos(){
		return consultaEJB.consultarPlatos();
	}
	
	/**
	 * Consulta los clientes existentes en el sistema
	 * @return
	 */
	@GET
	@Path("/consultarClientes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ClienteDTO> consultarClientes(){
		return consultaEJB.consultarClientes();
	}
	
	/**
	 * Consulta las facturas existentes en el sistema
	 * @return
	 */
	@GET
	@Path("/consultarFacturas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FacturaDTO> consultarFacturas(){
		return consultaEJB.consultarFacturas();
	}
	
	/**
	 * Consulta los detalles de una factura existentes en el sistema
	 * @return
	 */
	@GET
	@Path("/consultarFacturaDetalles")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FacturaDetalleDTO> consultarFacturaDetalles(){
		return consultaEJB.consultarFacturaDetalles();
	}
	
	/**
	 * Crea una factura detalles en el sistema
	 * @param facturaDetalleDTO
	 * @return
	 */
	@POST
	@Path("/crearFacturaDetalles")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearFacturaDetalles(FacturaDetalleDTO facturaDetalleDTO) {
		return consultaEJB.crearFacturaDetalles(facturaDetalleDTO);
	}
	
	
}
