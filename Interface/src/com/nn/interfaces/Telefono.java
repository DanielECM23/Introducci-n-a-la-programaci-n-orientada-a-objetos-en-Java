package com.nn.interfaces;

public class Telefono {

	private int id;
	private double precio;
	private String modelo;
	private String marca;
	
	
	public Telefono(int id, double precio, String modelo, String marca) {
		this.id = id;
		this.precio = precio;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void hacerDevolucion() {
		
		
	}
	
	
	
}
