package com.hbt.semillero.servicios.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.dto.ResultadoDTO;

/**
 * Expone los métodos del EJB ConsultasEJB
 * @author Duvis Alejandro Gómez Neira
 *
 */
@Local
public interface IConsultasEjbLocal {
	
	public List<BebidaDTO> consultarBebidas();
	public ResultadoDTO eliminarBebida(String idBebida);
	public ResultadoDTO crearBebida(BebidaDTO bebidaDTO);
	public ResultadoDTO editarBebida(BebidaDTO bebidaDTO);
	

	public List<PlatoDTO> consultarPlatos();
	public ResultadoDTO eliminarPlato(String idPlato);
	public ResultadoDTO crearPlato(PlatoDTO platoDTO);
	public ResultadoDTO editarPlato(PlatoDTO platoDTO);

	public List<ClienteDTO> consultarClientes();
	public ResultadoDTO eliminarCliente(String idCliente);
	public ResultadoDTO crearCliente(ClienteDTO clienteDTO);
	public ResultadoDTO editarCliente(ClienteDTO clienteDTO);

	public List<FacturaDTO> consultarFacturas();
	public ResultadoDTO eliminarFactura(String idFactura);
	public ResultadoDTO crearFactura(FacturaDTO facturaDTO);
	public ResultadoDTO editarFactura(FacturaDTO facturaDTO);

	public List<FacturaDetalleDTO> consultarFacturaDetalles();
	public ResultadoDTO eliminarFacturaDetalles(String idFacturaDetalles);
	public ResultadoDTO crearFacturaDetalles(FacturaDetalleDTO facturaDetalleDTO);
	public ResultadoDTO editarFacturaDetalles(FacturaDetalleDTO facturaDetalleDTO);






	
	

}
