package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de un Plato
 * @author Duvis Alejandro Gómez Neira
 *
 */
@Entity
@Table(name = "PLATO")
public class Plato {
	
	@Id
	@Column(name="PLATO_ID")
	private String idPlato;
	
	@Column(name="PLATO_NOMBRE")
	private String platoNombre;
	
	@Column(name = "PRECIO")
	private Long precio;
	
	@Column(name = "PLATO_DESCRIPCION")
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
