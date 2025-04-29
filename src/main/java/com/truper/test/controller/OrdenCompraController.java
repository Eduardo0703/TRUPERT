package com.truper.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.truper.test.dto.DatosMostrados;
import com.truper.test.dto.OrdenCompraDto;
import com.truper.test.service.OrdenCompraService;

@RestController
public class OrdenCompraController {
	
	@Autowired
	private OrdenCompraService ordenCompraService;
	
	@GetMapping("/{sucursal}")
	public OrdenCompraDto getOrdenCompra(@PathVariable(name="sucursal") String sucursal){
		
		System.out.println("It's working");
		
		return ordenCompraService.getSucusales(sucursal);
	}
	
	@PostMapping("/saveOrdenCompra")
	public void saveOrdenCompra(@RequestBody DatosMostrados datosMostrados) {
		
		ordenCompraService.saveOrdenCompra(datosMostrados);
	}
	
	@PutMapping("/update/{codigoProducto}/{nuevoPrecio}")
	public void updateOrdenCompra(@PathVariable(name= "codigoProducto" )String codigoProducto, 
								  @PathVariable(name= "nuevoPrecio" )int nuevoPrecio) {
		
		ordenCompraService.updateOrdenCompra(codigoProducto, nuevoPrecio);
	}
	
}
