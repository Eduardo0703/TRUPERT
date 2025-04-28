package com.truper.test.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="SUCURSALES")
public class Sucursales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	long sucursal_id;
	@Column(nullable = false)
	private String nombre;
	
	@OneToMany(mappedBy = "orden_id")
	private List<Ordenes> ordenes;
	
	public List<Ordenes> getOrdenes() {
		return ordenes;
	}
	public void setOrdenes(List<Ordenes> ordenes) {
		this.ordenes = ordenes;
	}
	public long getSucursal_id() {
		return sucursal_id;
	}
	public void setSucursal_id(long sucursal_id) {
		this.sucursal_id = sucursal_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
