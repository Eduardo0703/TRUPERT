package com.truper.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.truper.test.dto.DatosMostrados;
import com.truper.test.entity.Productos;
import com.truper.test.entity.Sucursales;
import com.truper.test.service.OrdenCompraService;

@RestController
public class OrdenCompraController {
	
	@Autowired
	private OrdenCompraService ordenCompraService;
	
	@GetMapping(name="/")
	public List<Sucursales> getOrdenCompra(){
		
		System.out.println("It's working");
		
		return ordenCompraService.getSucusales();
	}
	
	@PostMapping(name="/saveOrdenCompra")
	public void saveOrdenCompra(@RequestBody DatosMostrados datosMostrados) {
		
		ordenCompraService.saveOrdenCompra(productos);
	}
	
	@PutMapping
	public void updateOrdenCompra() {
		
		ordenCompraService.updateOrdenCompra();
	}
	
}
