package com.truper.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "PRODUCTOS")
public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long producto_id;
	@Column(nullable = false)
	private String codigo;
	@Column(nullable = false)
	private String descripcion;
	@Column(nullable = false)
	private int precio;
	
	@ManyToOne
	@JoinColumn(name = "orden_id")
	private Ordenes orden_id;
	
	
	
	
	public long getProducto_id() {
		return producto_id;
	}
	public void setProducto_id(long producto_id) {
		this.producto_id = producto_id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
