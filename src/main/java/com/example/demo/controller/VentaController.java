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

import com.example.demo.model.Venta;
import com.example.demo.repository.VentaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("producto")
public class VentaController {
	@Autowired
	private final VentaRepository ventaRepository;

	//Create
	@PostMapping
    public Venta saveVenta(@RequestBody Venta venta) {
        return this.ventaRepository.save(venta);
    }
	
	// Read
	@GetMapping
	public List<Venta> getVentas() {
		return this.ventaRepository.findAll();
	}
	
	// Update
	  @PutMapping("/{id}")
	    public Venta updateVenta(@RequestParam("id") String id, @RequestBody Venta venta) {
	        if(this.ventaRepository.existsById(id)) {
	            return this.ventaRepository.save(venta);
	        } else throw new IllegalArgumentException();
	    }
	  
	// Delete
	   @DeleteMapping("/{id}")
	    public void deleteVenta(@RequestParam("id") String id) {
	        this.ventaRepository.deleteById(id);
	    }
}
