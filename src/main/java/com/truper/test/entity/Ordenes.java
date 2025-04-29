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
	private long ordenId;
	@Column(nullable = false)
	private Date fecha;
	@Column(nullable = false)
	private int total;
	
	@OneToMany(mappedBy = "productoId")
	private List<Productos> productos; 
	
	@ManyToOne
	@JoinColumn(name = "sucursalId")
	private Sucursales sucursal;
	
	
	
	public long getOrdenId() {
		return ordenId;
	}
	public void setOrdenId(long ordenId) {
		this.ordenId = ordenId;
	}
	
	public Sucursales getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursales sucursal) {
		this.sucursal = sucursal;
	}
	public List<Productos> getProductos() {
		return productos;
	}
	public void setProductos(List<Productos> productos) {
		this.productos = productos;
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
