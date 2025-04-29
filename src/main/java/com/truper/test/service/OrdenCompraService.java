package com.truper.test.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.test.dto.DatosMostrados;
import com.truper.test.dto.OrdenCompraDto;
import com.truper.test.dto.ProductosDto;
import com.truper.test.entity.Ordenes;
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
	
	
	/**
	 * Metodo en el que hacemos la consulta para obtener la orden de la compra, 
	 * consultamos y seteamos en un objeto Dto
	 * 
	 * @param sucursal
	 * @return
	 */
	public OrdenCompraDto getSucusales(String sucursal){
		
		OrdenCompraDto ordenCompra = new OrdenCompraDto();
		List<Productos> producto = null;
		List<ProductosDto> productosDto = new ArrayList<ProductosDto>();
		
		long sucursalId =  sucursalRepository.findByNombre(sucursal).get(0).getSucursalId();
		
		Optional<Ordenes> orden = ordenRepository.findById(sucursalId);
		
		
		producto = productoRepository.findByOrdenOrdenId(orden.get().getOrdenId());
		
		
		for (Productos prod : producto) {
			ProductosDto prodDto = new ProductosDto();
			prodDto.setCodigo(prod.getCodigo());
			prodDto.setDescripcion(prod.getDescripcion());
			prodDto.setPrecio(prod.getPrecio());
			productosDto.add(prodDto);
		}
		ordenCompra.setFechaOrden(orden.get().getFecha());
		ordenCompra.setIdOrden(orden.get().getOrdenId());
		ordenCompra.setSucursal(sucursal);
		ordenCompra.setProductos(productosDto);
		 
		 return ordenCompra;
	}
	
	/**
	 * Metodo  en el que guardamos los datos en la base de datos, obteniendolos de un Dto y pasandolo a una entidad
	 * @param datosMostrados
	 */
	public void saveOrdenCompra(DatosMostrados datosMostrados) {
		
		List<Sucursales> sucursales = sucursalRepository.findByNombre(datosMostrados.getNombreSucursal());
		
		Ordenes orden = new Ordenes(); 
		Date date = new Date();
		orden.setFecha(date);
		orden.setSucursal(sucursales.get(0));
		ordenRepository.save(orden);
		
		List<Ordenes> ordenes = ordenRepository.findAll();
		
		for (Productos producto : datosMostrados.getProductos()) {
			
			Productos productos = new Productos();
			productos.setCodigo(producto.getCodigo());
			productos.setDescripcion(producto.getDescripcion());
			productos.setPrecio(producto.getPrecio());
			productos.setOrden(ordenes.get(ordenes.size()-1));
			
			productoRepository.save(productos);
			
		}
	}
	
	/**
	 * Es el metodo con el que vamos a editar el precio del producto
	 * 
	 * @param codigoProducto
	 * @param nuevoPrecio
	 */
	public void updateOrdenCompra(String codigoProducto, int nuevoPrecio) {
		Productos producto = new Productos();
		
		List<Productos> prod = productoRepository.findByCodigo(codigoProducto);
		
		producto.setProductoId(prod.get(0).getProductoId());
		producto.setDescripcion(prod.get(0).getDescripcion());
		producto.setOrden(prod.get(0).getOrden());
		producto.setPrecio(nuevoPrecio);
		producto.setCodigo(prod.get(0).getCodigo());
		
		productoRepository.save(producto);
		
	}
}
