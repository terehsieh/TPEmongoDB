package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("producto")
public class ProductoController {
@Autowired
	private final ProductoRepository productoRepository;

	//Create
	@PostMapping
    public Producto saveProducto(@RequestBody Producto producto) {
        return this.productoRepository.save(producto);
    }
	
	// Read
	@GetMapping
	public List<Producto> getProductos() {
		return this.productoRepository.findAll();
	}
	
	// Update
	  @PutMapping("/{id}")
	    public Producto updateProducto(@RequestParam("id") String id, @RequestBody Producto producto) {
	        if(this.productoRepository.existsById(id)) {
	            return this.productoRepository.save(producto);
	        } else throw new IllegalArgumentException();
	    }
	  
	// Delete
	   @DeleteMapping("/{id}")
	    public void deleteProducto(@RequestParam("id") String id) {
	        this.productoRepository.deleteById(id);
	    }
}
