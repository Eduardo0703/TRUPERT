package com.truper.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.test.entity.Productos;

public interface ProductoRepository extends JpaRepository<Productos, Long>{

}
