package com.hbt.semillero.servicios.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.FacturaDetalle;
import com.hbt.semillero.entidades.Plato;
import com.hbt.semillero.servicios.interfaces.IConsultasEjbLocal;

/**
 * @author Duvis Alejandro Gómez Neira EJB de consultas
 */
@Stateless
public class ConsultasEJB implements IConsultasEjbLocal {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Método que permite consultar las bebidas almacenadas en la base de datos
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<BebidaDTO> consultarBebidas() {
		List<Bebida> bebidas = em.createQuery("Select be from Bebida be").getResultList();
		List<BebidaDTO> bebidasReturn = new ArrayList<BebidaDTO>();

		for (Bebida bebida : bebidas) {
			bebidasReturn.add(construirBebidaDTO(bebida));
		}
		return bebidasReturn;
	}

	/**
	 * Construye un DTO de Bebida
	 * 
	 * @param bebida
	 * @return
	 */
	private BebidaDTO construirBebidaDTO(Bebida bebida) {
		BebidaDTO bebidaDTO = new BebidaDTO();
		bebidaDTO.setBebidaId(bebida.getBebidaId());
		bebidaDTO.setBebidaNombre(bebida.getBebidaNombre());
		bebidaDTO.setPrecio(bebida.getPrecio());
		return bebidaDTO;
	}

	/**
	 * Método que permite consultar los platos almacenadas en la base de datos
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<PlatoDTO> consultarPlatos() {
		List<Plato> platos = em.createQuery("select pl from Plato pl").getResultList();
		List<PlatoDTO> platosReturn = new ArrayList<PlatoDTO>();
		for (Plato plato : platos) {
			platosReturn.add(construirPlatoDTO(plato));
		}
		return platosReturn;

	}

	/**
	 * Construye un DTO de Plato
	 * 
	 * @param plato
	 * @return
	 */
	private PlatoDTO construirPlatoDTO(Plato plato) {
		PlatoDTO platoDTO = new PlatoDTO();
		platoDTO.setIdPlato(plato.getIdPlato());
		platoDTO.setPlatoDescripcion(plato.getPlatoDescripcion());
		platoDTO.setPlatoNombre(plato.getPlatoNombre());
		platoDTO.setPrecio(plato.getPrecio());
		return platoDTO;
	}

	/**
	 * Método que permite consultar los clientes almacenados en la base de datos
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ClienteDTO> consultarClientes() {
		List<Cliente> clientes = em.createQuery("select cl from Cliente cl").getResultList();
		List<ClienteDTO> clientesReturn = new ArrayList<ClienteDTO>();
		for (Cliente cliente : clientes) {
			clientesReturn.add(construirClienteDTO(cliente));
		}
		return clientesReturn;
	}

	/**
	 * Construye un DTO de Cliente
	 * 
	 * @param cliente
	 * @return
	 */
	private ClienteDTO construirClienteDTO(Cliente cliente) {
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setClienteId(cliente.getClienteId());
		clienteDTO.setClienteNombre(cliente.getClienteNombre());
		return clienteDTO;
	}

	/**
	 * Método que permite consultar las facturas almacenadas en la base de datos
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<FacturaDTO> consultarFacturas() {
		List<Factura> facturas = em.createQuery("select fa from Factura fa").getResultList();
		List<FacturaDTO> facturasReturn = new ArrayList<FacturaDTO>();
		for (Factura factura : facturas) {
			facturasReturn.add(construirFacturaDTO(factura));
		}
		return facturasReturn;
	}

	/**
	 * Construye un DTO de Factura
	 * 
	 * @param factura
	 * @return
	 */
	private FacturaDTO construirFacturaDTO(Factura factura) {
		FacturaDTO facturaDTO = new FacturaDTO();
		facturaDTO.setCliente(construirClienteDTO(factura.getCliente()));
		facturaDTO.setFacturaId(factura.getFacturaId());
		facturaDTO.setIva(factura.getIva());
		facturaDTO.setTotal(factura.getTotal());
		return facturaDTO;
	}

	/**
	 * Método que permite consultar los detalles de una factura almacenados en la
	 * base de datos
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<FacturaDetalleDTO> consultarFacturaDetalles() {
		List<FacturaDetalle> facturaDetalles = em.createQuery("select fad from FacturaDetalle fad").getResultList();
		List<FacturaDetalleDTO> facturaDetallesReturn = new ArrayList<FacturaDetalleDTO>();
		for (FacturaDetalle facturaDetalle : facturaDetalles) {
			facturaDetallesReturn.add(construirFacturaDetalleDTO(facturaDetalle));
		}
		return facturaDetallesReturn;
	}

	/**
	 * Construye un DTO de FacturaDetalle
	 * 
	 * @param facturaDetalle
	 * @return
	 */
	private FacturaDetalleDTO construirFacturaDetalleDTO(FacturaDetalle facturaDetalle) {
		FacturaDetalleDTO facturaDetalleDTO = new FacturaDetalleDTO();
		facturaDetalleDTO.setBebida(construirBebidaDTO(facturaDetalle.getBebida()));
		facturaDetalleDTO.setDetalleId(facturaDetalle.getDetalleId());
		facturaDetalleDTO.setFactura(construirFacturaDTO(facturaDetalle.getFactura()));
		facturaDetalleDTO.setPlato(construirPlatoDTO(facturaDetalle.getPlato()));
		facturaDetalleDTO.setPrecioUnitario(facturaDetalleDTO.getPrecioUnitario());
		facturaDetalleDTO.setConsumoLocal(facturaDetalle.isConsumoLocal());
		return facturaDetalleDTO;
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ResultadoDTO crearFacturaDetalles(FacturaDetalleDTO facturaDetalleDTO) {
		try {
			FacturaDetalle facturaDetalle = construirFacturaDetalle(facturaDetalleDTO);
			em.persist(facturaDetalle);
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Creado de forma exitosa");
	}

	/**
	 * Método que permite persistir una factura detalle de un objeto
	 * facturaDetalleDTO.
	 * 
	 * @param facturaDetalleDTO
	 * @return
	 */
	private FacturaDetalle construirFacturaDetalle(FacturaDetalleDTO facturaDetalleDTO) {
		FacturaDetalle facturaDetalle = new FacturaDetalle();
		facturaDetalle.setBebida(findBebida(facturaDetalleDTO.getBebida().getBebidaId()));
		facturaDetalle.setConsumoLocal(facturaDetalleDTO.isConsumoLocal());
		facturaDetalle.setDetalleId(facturaDetalleDTO.getDetalleId());
		facturaDetalle.setFactura(findFactura(facturaDetalleDTO.getFactura().getFacturaId()));
		facturaDetalle.setPlato(findPlato(facturaDetalleDTO.getPlato().getIdPlato()));
		facturaDetalle.setPrecioUnitario(facturaDetalleDTO.getPrecioUnitario());
		return facturaDetalle;
	}

	private Bebida construirBebida(BebidaDTO bebidaDTO) {
		Bebida bebida = new Bebida();
		bebida.setBebidaId(bebidaDTO.getBebidaId());
		bebida.setBebidaNombre(bebidaDTO.getBebidaNombre());
		bebida.setPrecio(bebidaDTO.getPrecio());
		return bebida;
	}

	private Plato construirPlato(PlatoDTO platoDTO) {
		Plato plato = new Plato();
		plato.setIdPlato(platoDTO.getIdPlato());
		plato.setPlatoDescripcion(platoDTO.getPlatoDescripcion());
		plato.setPlatoNombre(platoDTO.getPlatoNombre());
		plato.setPrecio(platoDTO.getPrecio());
		return plato;
	}

	private Cliente construirCliente(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		cliente.setClienteId(clienteDTO.getClienteId());
		cliente.setClienteNombre(clienteDTO.getClienteNombre());
		return cliente;
	}

	private Factura construirFactura(FacturaDTO facturaDTO) {
		Factura factura = new Factura();
		factura.setCliente(findCliente(facturaDTO.getCliente().getClienteId()));
		factura.setFacturaId(facturaDTO.getFacturaId());
		factura.setIva(facturaDTO.getIva());
		factura.setTotal(facturaDTO.getTotal());
		return factura;
	}

	/**
	 * Método que permite buscar una bebida dentro de la base de datos
	 * 
	 * @param idBebida Identificador de la bebida que se desea buscar
	 * @return
	 */
	private Bebida findBebida(String idBebida) {
		try {
			return em.find(Bebida.class, idBebida);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Método que permite buscar una factura dentro de la base de datos
	 * 
	 * @param idFactura Identificador de la factura que se desea buscar
	 * @return
	 */
	private Factura findFactura(String idFactura) {
		try {
			return em.find(Factura.class, idFactura);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Método que permite buscar un Plato dentro de la base de datos
	 * 
	 * @param idPlato Identificador de la factura que se desea buscar
	 * @return
	 */
	private Plato findPlato(String idPlato) {
		try {
			return em.find(Plato.class, idPlato);
		} catch (Exception e) {
			return null;
		}
	}

	private Cliente findCliente(String idCliente) {
		try {
			return em.find(Cliente.class, idCliente);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public ResultadoDTO eliminarBebida(String idBebida) {
		try {
			em.remove(em.find(Bebida.class, idBebida));
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Bebida eliminada de froma exitosa");
	}

	@Override
	public ResultadoDTO eliminarPlato(String idPlato) {
		try {
			em.remove(em.find(Plato.class, idPlato));
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Plato eliminado de froma exitosa");
	}

	@Override
	public ResultadoDTO eliminarCliente(String idCliente) {
		try {
			em.remove(em.find(Cliente.class, idCliente));
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Cliente eliminado de froma exitosa");
	}

	@Override
	public ResultadoDTO eliminarFactura(String idFactura) {
		try {
			em.remove(em.find(Factura.class, idFactura));
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Factura eliminada de froma exitosa");
	}

	@Override
	public ResultadoDTO eliminarFacturaDetalles(String idFacturaDetalles) {
		try {
			em.remove(em.find(FacturaDetalle.class, idFacturaDetalles));
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "FacturaDetalle eliminada de froma exitosa");

	}

	@Override
	public ResultadoDTO crearBebida(BebidaDTO bebidaDTO) {
		try {
			Bebida bebida = construirBebida(bebidaDTO);
			em.persist(bebida);
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Bebida Creada de forma exitosa");
	}

	@Override
	public ResultadoDTO crearPlato(PlatoDTO platoDTO) {
		try {
			Plato plato = construirPlato(platoDTO);
			em.persist(plato);
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Plato Creado de forma exitosa");
	}

	@Override
	public ResultadoDTO crearCliente(ClienteDTO clienteDTO) {
		try {
			Cliente cliente = construirCliente(clienteDTO);
			em.persist(cliente);
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Cliente Creado de forma exitosa");
	}

	@Override
	public ResultadoDTO crearFactura(FacturaDTO facturaDTO) {
		try {
			Factura factura = construirFactura(facturaDTO);
			em.persist(factura);
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Factura Creada de forma exitosa");
	}

	@Override
	public ResultadoDTO editarBebida(BebidaDTO bebidaDTO) {
		try {
			Bebida bebida = em.find(Bebida.class, bebidaDTO.getBebidaId());
			bebida.setBebidaNombre(bebidaDTO.getBebidaNombre());
			bebida.setPrecio(bebidaDTO.getPrecio());
			em.merge(bebida);
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Bebida Editada de forma exitosa");
	}

	@Override
	public ResultadoDTO editarPlato(PlatoDTO platoDTO) {
		try {
			Plato plato = em.find(Plato.class, platoDTO.getIdPlato());
			plato.setPlatoDescripcion(platoDTO.getPlatoDescripcion());
			plato.setPlatoNombre(platoDTO.getPlatoNombre());
			plato.setPrecio(platoDTO.getPrecio());
			em.merge(plato);
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Plato Editado de forma exitosa");
	}

	@Override
	public ResultadoDTO editarCliente(ClienteDTO clienteDTO) {
		try {
			Cliente cliente = em.find(Cliente.class, clienteDTO.getClienteId());
			cliente.setClienteNombre(clienteDTO.getClienteNombre());
			em.merge(cliente);
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Cliente Editado de forma exitosa");
	}

	@Override
	public ResultadoDTO editarFactura(FacturaDTO facturaDTO) {
		try {
			Factura factura = em.find(Factura.class, facturaDTO.getFacturaId());
			factura.setCliente(findCliente(facturaDTO.getCliente().getClienteId()));
			factura.setIva(facturaDTO.getIva());
			factura.setTotal(facturaDTO.getTotal());
			em.merge(factura);
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Factura Editada de forma exitosa");
	}

	@Override
	public ResultadoDTO editarFacturaDetalles(FacturaDetalleDTO facturaDetalleDTO) {
		try {
			FacturaDetalle facturaDetalle = em.find(FacturaDetalle.class, facturaDetalleDTO.getDetalleId());
			facturaDetalle.setBebida(findBebida(facturaDetalleDTO.getBebida().getBebidaId()));
			facturaDetalle.setConsumoLocal(facturaDetalleDTO.isConsumoLocal());
			facturaDetalle.setFactura(findFactura(facturaDetalleDTO.getFactura().getFacturaId()));
			facturaDetalle.setPlato(findPlato(facturaDetalleDTO.getPlato().getIdPlato()));
			facturaDetalle.setPrecioUnitario(facturaDetalleDTO.getPrecioUnitario());
			em.merge(facturaDetalle);
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "FacturaDetalle Editada de forma exitosa");
	}

}
