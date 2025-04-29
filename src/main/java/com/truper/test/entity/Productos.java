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
	private long productoId;
	@Column(nullable = false)
	private String codigo;
	@Column(nullable = false)
	private String descripcion;
	@Column(nullable = false)
	private int precio;
	
	@ManyToOne
	@JoinColumn(name = "ordenId")
	private Ordenes orden;

	public Ordenes getOrden() {
		return orden;
	}
	public void setOrden(Ordenes orden) {
		this.orden = orden;
	}
	public long getProductoId() {
		return productoId;
	}
	public void setProductoId(long productoId) {
		this.productoId = productoId;
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
