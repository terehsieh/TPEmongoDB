package com.example.demo.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
@Document(collection = "venta")
public class Venta {
	private  String id;
	    private List<Producto> productos;
	    private String direccion;


	  
}
