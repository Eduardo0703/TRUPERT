package com.truper.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.test.dto.DatosMostrados;
import com.truper.test.entity.Productos;
import com.truper.test.entity.Sucursales;
import com.truper.test.repository.OrdenRepository;
import com.truper.test.repository.ProductoRepository;
import com.truper.test.repository.SucursalRepository;

@Service
public class OrdenCompraService {
	
	@Autowired
	private OrdenRepository ordenRepository ;
	@Autowired
	private SucursalRepository sucursalRepository;
	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Sucursales> getSucusales(){
		
		return sucursalRepository.findAll();
	}
	
	public void saveOrdenCompra(DatosMostrados datosMostrados) {
		
		long sucursal_id = sucursalRepository.findByNombre(datosMostrados.getNombreSucursal()).get(0).getSucursal_id();
		
		
		
	}
	
	public void updateOrdenCompra() {
		
	}
}
