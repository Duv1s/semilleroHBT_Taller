package com.hbt.semillero.dto;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Factura
 * @author Duvis Alejandro Gómez Neira
 *
 */
public class FacturaDTO {

	private String facturaId;

	private ClienteDTO cliente;

	private Long iva;

	private Long total;

	/**
	 * Método que obtiene el valor de la propiedad facturaId
	 * 
	 * @return facturaId
	 */
	public String getFacturaId() {
		return facturaId;
	}

	/**
	 * Método que asigna el valor de la propiedad facturaId
	 * 
	 * @param facturaId the facturaId to set
	 */
	public void setFacturaId(String facturaId) {
		this.facturaId = facturaId;
	}

	/**
	 * Método que obtiene el valor de la propiedad cliente
	 * 
	 * @return cliente
	 */
	public ClienteDTO getCliente() {
		return cliente;
	}

	/**
	 * Método que asigna el valor de la propiedad cliente
	 * 
	 * @param cliente the cliente to set
	 */
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	/**
	 * Método que obtiene el valor de la propiedad iva
	 * 
	 * @return iva
	 */
	public Long getIva() {
		return iva;
	}

	/**
	 * Método que asigna el valor de la propiedad iva
	 * 
	 * @param iva the iva to set
	 */
	public void setIva(Long iva) {
		this.iva = iva;
	}

	/**
	 * Método que obtiene el valor de la propiedad total
	 * 
	 * @return total
	 */
	public Long getTotal() {
		return total;
	}

	/**
	 * Método que asigna el valor de la propiedad total
	 * 
	 * @param total the total to set
	 */
	public void setTotal(Long total) {
		this.total = total;
	}

}
