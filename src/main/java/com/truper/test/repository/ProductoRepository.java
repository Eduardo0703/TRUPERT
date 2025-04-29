package com.truper.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.test.entity.Productos;

public interface ProductoRepository extends JpaRepository<Productos, Long>{

	List<Productos> findByOrdenOrdenId(Long sucursalId);
	List<Productos> findByCodigo(String codigo);
}
