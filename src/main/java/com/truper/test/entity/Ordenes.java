package com.truper.test.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "ORDENES")
public class Ordenes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long orden_id;
	@Column(nullable = false)
	private Date fecha;
	@Column(nullable = false)
	private int total;
	
	@OneToMany(mappedBy = "producto_id")
	private List<Productos> productos; 
	
	@ManyToOne
	@JoinColumn(name = "sucursal_id")
	private Sucursales sucursales;
	
	public Sucursales getSucursales() {
		return sucursales;
	}
	public void setSucursales(Sucursales sucursales) {
		this.sucursales = sucursales;
	}
	public List<Productos> getProductos() {
		return productos;
	}
	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}
	public long getOrden_id() {
		return orden_id;
	}
	public void setOrden_id(long orden_id) {
		this.orden_id = orden_id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	

}
