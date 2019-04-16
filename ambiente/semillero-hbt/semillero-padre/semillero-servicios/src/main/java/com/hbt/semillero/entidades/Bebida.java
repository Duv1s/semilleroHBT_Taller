package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de una bebida
 * @author Duvis Alejandro Gómez Neira
 *
 */
@Entity
@Table(name="BEBIDA")
public class Bebida {
	@Id
	@Column(name="BEBIDA_ID")
	private String bebidaId;
	
	@Column(name="BEBIDA_NOMBRE")
	private String bebidaNombre;
	
	@Column(name="PRECIO")
	private Long precio;

	/**
	 *  Método que obtiene el valor de la propiedad bebidaId
	 * @return bebidaId
	 */
	public String getBebidaId() {
		return bebidaId;
	}

	/**
	 * Método que asigna el valor de la propiedad bebidaId
	 * @param bebidaId the bebidaId to set
	 */
	public void setBebidaId(String bebidaId) {
		this.bebidaId = bebidaId;
	}

	/**
	 *  Método que obtiene el valor de la propiedad bebidaNombre
	 * @return bebidaNombre
	 */
	public String getBebidaNombre() {
		return bebidaNombre;
	}

	/**
	 * Método que asigna el valor de la propiedad bebidaNombre
	 * @param bebidaNombre the bebidaNombre to set
	 */
	public void setBebidaNombre(String bebidaNombre) {
		this.bebidaNombre = bebidaNombre;
	}

	/**
	 *  Método que obtiene el valor de la propiedad precio
	 * @return precio
	 */
	public Long getPrecio() {
		return precio;
	}

	/**
	 * Método que asigna el valor de la propiedad precio
	 * @param precio the precio to set
	 */
	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	
}
