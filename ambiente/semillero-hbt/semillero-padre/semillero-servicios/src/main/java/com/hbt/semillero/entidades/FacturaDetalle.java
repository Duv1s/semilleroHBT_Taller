package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de una compra de una facturaDetalle
 * @author Duvis Alejandro Gómez Neira
 *
 */
@Entity
@Table(name="FACTURA_DETALLE")
public class FacturaDetalle {
	
	@Id
	@Column(name="DETALLE_ID")
	private String detalleId;
	
	@ManyToOne()
	@JoinColumn(name="FACTURA_ID")
	private Factura factura;
	
	@ManyToOne()
	@JoinColumn(name="PLATO_ID")
	private Plato plato;
	
	@ManyToOne()
	@JoinColumn(name="BEBIDA_ID")
	private Bebida bebida;
	
	@Column(name="PRECIO_UNITARIO")
	private Long precioUnitario;
	
	@Column(name= "CONSUMO_LOCAL")
	private boolean consumoLocal;

	/**
	 *  Método que obtiene el valor de la propiedad detalleId
	 * @return detalleId
	 */
	public String getDetalleId() {
		return detalleId;
	}

	/**
	 * Método que asigna el valor de la propiedad detalleId
	 * @param detalleId the detalleId to set
	 */
	public void setDetalleId(String detalleId) {
		this.detalleId = detalleId;
	}

	/**
	 *  Método que obtiene el valor de la propiedad factura
	 * @return factura
	 */
	public Factura getFactura() {
		return factura;
	}

	/**
	 * Método que asigna el valor de la propiedad factura
	 * @param factura the factura to set
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	/**
	 *  Método que obtiene el valor de la propiedad plato
	 * @return plato
	 */
	public Plato getPlato() {
		return plato;
	}

	/**
	 * Método que asigna el valor de la propiedad plato
	 * @param plato the plato to set
	 */
	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	/**
	 *  Método que obtiene el valor de la propiedad bebida
	 * @return bebida
	 */
	public Bebida getBebida() {
		return bebida;
	}

	/**
	 * Método que asigna el valor de la propiedad bebida
	 * @param bebida the bebida to set
	 */
	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	/**
	 *  Método que obtiene el valor de la propiedad precioUnitario
	 * @return precioUnitario
	 */
	public Long getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * Método que asigna el valor de la propiedad precioUnitario
	 * @param precioUnitario the precioUnitario to set
	 */
	public void setPrecioUnitario(Long precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	/**
	 *  Método que obtiene el valor de la propiedad consumoLocal
	 * @return consumoLocal
	 */
	public boolean isConsumoLocal() {
		return consumoLocal;
	}

	/**
	 * Método que asigna el valor de la propiedad consumoLocal
	 * @param consumoLocal the consumoLocal to set
	 */
	public void setConsumoLocal(boolean consumoLocal) {
		this.consumoLocal = consumoLocal;
	}
	
	
}