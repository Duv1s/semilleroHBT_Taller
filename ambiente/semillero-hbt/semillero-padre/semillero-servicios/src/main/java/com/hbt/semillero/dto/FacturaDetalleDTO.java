package com.hbt.semillero.dto;

/**
 * Objeto de transferencia que mapea los atributos de la entidad FacturaDetalle
 * @author Duvis Alejandro Gómez Neira
 *
 */
public class FacturaDetalleDTO {

	private String detalleId;

	private FacturaDTO factura;

	private PlatoDTO plato;

	private BebidaDTO bebida;

	private Long precioUnitario;

	/**
	 * Atributo que toma el valor de verdadero si el pedidos es para consumir en el
	 * local y false si es para llevar
	 */
	private boolean consumoLocal;

	/**
	 * Método que obtiene el valor de la propiedad detalleId
	 * 
	 * @return detalleId
	 */
	public String getDetalleId() {
		return detalleId;
	}

	/**
	 * Método que asigna el valor de la propiedad detalleId
	 * 
	 * @param detalleId the detalleId to set
	 */
	public void setDetalleId(String detalleId) {
		this.detalleId = detalleId;
	}

	/**
	 * Método que obtiene el valor de la propiedad factura
	 * 
	 * @return factura
	 */
	public FacturaDTO getFactura() {
		return factura;
	}

	/**
	 * Método que asigna el valor de la propiedad factura
	 * 
	 * @param factura the factura to set
	 */
	public void setFactura(FacturaDTO factura) {
		this.factura = factura;
	}

	/**
	 * Método que obtiene el valor de la propiedad plato
	 * 
	 * @return plato
	 */
	public PlatoDTO getPlato() {
		return plato;
	}

	/**
	 * Método que asigna el valor de la propiedad plato
	 * 
	 * @param plato the plato to set
	 */
	public void setPlato(PlatoDTO plato) {
		this.plato = plato;
	}

	/**
	 * Método que obtiene el valor de la propiedad bebida
	 * 
	 * @return bebida
	 */
	public BebidaDTO getBebida() {
		return bebida;
	}

	/**
	 * Método que asigna el valor de la propiedad bebida
	 * 
	 * @param bebida the bebida to set
	 */
	public void setBebida(BebidaDTO bebida) {
		this.bebida = bebida;
	}

	/**
	 * Método que obtiene el valor de la propiedad precioUnitario
	 * 
	 * @return precioUnitario
	 */
	public Long getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * Método que asigna el valor de la propiedad precioUnitario
	 * 
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