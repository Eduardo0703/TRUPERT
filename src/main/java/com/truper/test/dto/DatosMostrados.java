package com.truper.test.dto;

import java.util.List;

import com.truper.test.entity.Productos;



public class DatosMostrados {
	private List<Productos> productos;
	private String nombreSucursal;
	
	
	public List<Productos> getProductos() {
		return productos;
	}
	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}
	public String getNombreSucursal() {
		return nombreSucursal;
	}
	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	} 
	
	

}
