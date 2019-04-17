package com.hbt.semillero.servicios.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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
	
	@GET
	@Path("/eliminarBebida")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO eliminarBebida(@QueryParam("idBebida") String idBebida) {
		return consultaEJB.eliminarBebida(idBebida);
	}
	
	@POST
	@Path("/crearBebida")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearBebida(BebidaDTO bebidaDTO) {
		return consultaEJB.crearBebida(bebidaDTO);
	}

	@POST
	@Path("/editarBebida")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO editarBebida(BebidaDTO bebidaDTO) {
		return consultaEJB.editarBebida(bebidaDTO);
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
	
	@GET
	@Path("/eliminarPlato")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO eliminarPlato(@QueryParam("idPlato") String idPlato) {
		return consultaEJB.eliminarPlato(idPlato);
	}
	
	@POST
	@Path("/crearPlato")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearPlato(PlatoDTO platoDTO) {
		return consultaEJB.crearPlato(platoDTO);
	}

	@POST
	@Path("/editarPlato")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO editarPlato(PlatoDTO platoDTO) {
		return consultaEJB.editarPlato(platoDTO);
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
	
	@GET
	@Path("/eliminarCliente")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO eliminarCliente(@QueryParam("idCliente") String idCliente) {
		return consultaEJB.eliminarCliente(idCliente);
	}
	
	@POST
	@Path("/crearCliente")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearCliente(ClienteDTO clienteDTO) {
		return consultaEJB.crearCliente(clienteDTO);
	}
	
	@POST
	@Path("/editarCliente")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO editarCliente(ClienteDTO clienteDTO) {
		return consultaEJB.editarCliente(clienteDTO);
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
	
	@GET
	@Path("/eliminarFactura")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO eliminarFactura(@QueryParam("idFactura") String idFactura) {
		return consultaEJB.eliminarFactura(idFactura);
	}
	
	@POST
	@Path("/crearFactura")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearFactura(FacturaDTO facturaDTO) {
		return consultaEJB.crearFactura(facturaDTO);
	}
	
	@POST
	@Path("/editarFactura")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO editarFactura(FacturaDTO facturaDTO) {
		return consultaEJB.editarFactura(facturaDTO);
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
	
	@GET
	@Path("/eliminarFacturaDetalles")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO eliminarFacturaDetalles(@QueryParam("idFacturaDetalles") String idFacturaDetalles) {
		return consultaEJB.eliminarFacturaDetalles(idFacturaDetalles);
	}
	
	@POST
	@Path("/editarFacturaDetalles")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO editarFacturaDetalles(FacturaDetalleDTO facturaDetalleDTO) {
		return consultaEJB.editarFacturaDetalles(facturaDetalleDTO);
	}
	
	
}
