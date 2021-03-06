package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de una compra de una factura
 * @author Duvis Alejandro Gómez Neira
 *
 */
@Entity
@Table(name="FACTURA")
public class Factura {
	
	@Id
	@Column(name="FACTURA_ID")
	private String facturaId;
	
	@ManyToOne()
	@JoinColumn(name="CLIENTE_ID")
	private Cliente cliente;
	
	@Column(name="IVA")
	private Long iva;
	
	@Column(name="TOTAL")
	private Long total;

	/**
	 *  Método que obtiene el valor de la propiedad facturaId
	 * @return facturaId
	 */
	public String getFacturaId() {
		return facturaId;
	}

	/**
	 * Método que asigna el valor de la propiedad facturaId
	 * @param facturaId the facturaId to set
	 */
	public void setFacturaId(String facturaId) {
		this.facturaId = facturaId;
	}

	/**
	 *  Método que obtiene el valor de la propiedad cliente
	 * @return cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Método que asigna el valor de la propiedad cliente
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 *  Método que obtiene el valor de la propiedad iva
	 * @return iva
	 */
	public Long getIva() {
		return iva;
	}

	/**
	 * Método que asigna el valor de la propiedad iva
	 * @param iva the iva to set
	 */
	public void setIva(Long iva) {
		this.iva = iva;
	}

	/**
	 *  Método que obtiene el valor de la propiedad total
	 * @return total
	 */
	public Long getTotal() {
		return total;
	}

	/**
	 * Método que asigna el valor de la propiedad total
	 * @param total the total to set
	 */
	public void setTotal(Long total) {
		this.total = total;
	}
	
	
}
