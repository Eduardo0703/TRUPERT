package com.truper.test.controller;

import java.math.BigDecimal;

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
		
		return ordenCompraService.getOrdenCompra(sucursal);
	}
	
	@PostMapping("/saveOrdenCompra")
	public String saveOrdenCompra(@RequestBody DatosMostrados datosMostrados) {
		
		ordenCompraService.saveOrdenCompra(datosMostrados);
		return "Registro guardado correctamente";
	}
	
	@PutMapping("/update/{codigoProducto}/{nuevoPrecio}")
	public String updateOrdenCompra(@PathVariable(name= "codigoProducto" )String codigoProducto, 
								  @PathVariable(name= "nuevoPrecio" )BigDecimal nuevoPrecio) {
		
		
		
		return ordenCompraService.updateOrdenCompra(codigoProducto, nuevoPrecio);
	}
	
}
