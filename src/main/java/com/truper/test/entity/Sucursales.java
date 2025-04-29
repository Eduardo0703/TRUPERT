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
	long sucursalId;
	@Column(nullable = false)
	private String nombre;
	
	@OneToMany(mappedBy = "ordenId")
	private List<Ordenes> orden;
	
	public List<Ordenes> getOrden() {
		return orden;
	}
	public void setOrden(List<Ordenes> orden) {
		this.orden = orden;
	}
	public long getSucursalId() {
		return sucursalId;
	}
	public void setSucursalId(long sucursalId) {
		this.sucursalId = sucursalId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
