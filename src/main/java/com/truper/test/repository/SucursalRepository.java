package com.truper.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.test.entity.Sucursales;

public interface SucursalRepository extends JpaRepository<Sucursales, Long>{
	
	List<Sucursales> findByNombre(String name);

}
