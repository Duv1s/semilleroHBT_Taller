package com.hbt.semillero.dto;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Cliente
 * @author Duvis Alejandro Gómez Neira
 *
 */
public class ClienteDTO {
	
	private String clienteId;
	
	private String clienteNombre;

	/**
	 *  Método que obtiene el valor de la propiedad clienteId
	 * @return clienteId
	 */
	public String getClienteId() {
		return clienteId;
	}

	/**
	 * Método que asigna el valor de la propiedad clienteId
	 * @param clienteId the clienteId to set
	 */
	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}

	/**
	 *  Método que obtiene el valor de la propiedad clienteNombre
	 * @return clienteNombre
	 */
	public String getClienteNombre() {
		return clienteNombre;
	}

	/**
	 * Método que asigna el valor de la propiedad clienteNombre
	 * @param clienteNombre the clienteNombre to set
	 */
	public void setClienteNombre(String clienteNombre) {
		this.clienteNombre = clienteNombre;
	}
	
	
}
