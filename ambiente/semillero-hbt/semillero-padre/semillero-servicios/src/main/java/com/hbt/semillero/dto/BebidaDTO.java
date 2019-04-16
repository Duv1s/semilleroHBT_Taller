package com.hbt.semillero.dto;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Bebida
 * @author Duvis Alejandro Gómez Neira
 *
 */
public class BebidaDTO {
	
	private String bebidaId;
	
	private String bebidaNombre;
	
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
	 * @return the bebidaNombre
	 */
	public String getBebidaNombre() {
		return bebidaNombre;
	}

	/**
	 * @param bebidaNombre the bebidaNombre to set
	 */
	public void setBebidaNombre(String bebidaNombre) {
		this.bebidaNombre = bebidaNombre;
	}

	/**
	 * @return the precio
	 */
	public Long getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	
	
	
}
