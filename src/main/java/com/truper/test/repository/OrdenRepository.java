package com.truper.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.test.entity.Ordenes;

public interface OrdenRepository extends JpaRepository<Ordenes, Long> {
	List<Ordenes> findBySucursalSucursalId(Long sucursalId);

}
