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

	public List<PlatoDTO> consultarPlatos();

	public List<ClienteDTO> consultarClientes();

	public List<FacturaDTO> consultarFacturas();

	public List<FacturaDetalleDTO> consultarFacturaDetalles();

	public ResultadoDTO crearFacturaDetalles(FacturaDetalleDTO facturaDetalleDTO);
	
	

}
