package com.example.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
@Document(collection = "producto")
public class Producto {
	@Id
	private  String id;
	private  String nombre;
	private  String descripcion;
	private String stock;
	private float precio;
	
	
	

	
}