package com.hbt.semillero.dto;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Plato
 * @author Duvis Alejandro Gómez Neira
 *
 */
public class PlatoDTO {
	
	private String idPlato;
	
	private String platoNombre;
	
	private Long precio;
	
	private String platoDescripcion;

	/**
	 *  Método que obtiene el valor de la propiedad idPlato
	 * @return idPlato
	 */
	public String getIdPlato() {
		return idPlato;
	}

	/**
	 * Método que asigna el valor de la propiedad idPlato
	 * @param idPlato the idPlato to set
	 */
	public void setIdPlato(String idPlato) {
		this.idPlato = idPlato;
	}

	/**
	 *  Método que obtiene el valor de la propiedad platoNombre
	 * @return platoNombre
	 */
	public String getPlatoNombre() {
		return platoNombre;
	}

	/**
	 * Método que asigna el valor de la propiedad platoNombre
	 * @param platoNombre the platoNombre to set
	 */
	public void setPlatoNombre(String platoNombre) {
		this.platoNombre = platoNombre;
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

	/**
	 *  Método que obtiene el valor de la propiedad platoDescripcion
	 * @return platoDescripcion
	 */
	public String getPlatoDescripcion() {
		return platoDescripcion;
	}

	/**
	 * Método que asigna el valor de la propiedad platoDescripcion
	 * @param platoDescripcion the platoDescripcion to set
	 */
	public void setPlatoDescripcion(String platoDescripcion) {
		this.platoDescripcion = platoDescripcion;
	}

	
}
