package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de un Cliente
 * @author Duvis Alejandro Gómez Neira
 *
 */
@Entity
@Table(name="CLIENTE")
public class Cliente {
	
	@Id
	@Column(name="CLIENTE_ID")
	private String clienteId;
	
	@Column(name="CLIENTE_NOMBRE")
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
