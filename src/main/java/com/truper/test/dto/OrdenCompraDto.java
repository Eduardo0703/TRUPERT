package com.truper.test.dto;

import java.util.Date;
import java.util.List;

public class OrdenCompraDto {
	
	private long idOrden;
	private String sucursal;
	private Date fechaOrden;
	private List<ProductosDto> productos;
	
	
	
	public long getIdOrden() {
		return idOrden;
	}
	public void setIdOrden(long idOrden) {
		this.idOrden = idOrden;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	
	public Date getFechaOrden() {
		return fechaOrden;
	}
	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}
	public List<ProductosDto> getProductos() {
		return productos;
	}
	public void setProductos(List<ProductosDto> productos) {
		this.productos = productos;
	}
	
	

}
