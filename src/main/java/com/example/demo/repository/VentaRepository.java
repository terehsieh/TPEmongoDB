package com.example.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Venta;

public interface VentaRepository extends MongoRepository<Venta, String> {
	
  

}
