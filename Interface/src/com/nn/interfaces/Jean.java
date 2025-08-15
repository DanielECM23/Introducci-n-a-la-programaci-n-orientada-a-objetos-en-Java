package com.nn.interfaces;

public class Jean extends Ropa implements IDevolucion{

	public Jean(int id, double precio, String talla, String color, String corte, char genero) {
		super(id, precio, talla, color);
		
		this.corte = corte;
		this.genero = genero;
	}
	private String corte;
	private char genero;
	
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	@Override
	public void mostrarDatos(String nombreClase) {
		
		super.mostrarDatos(nombreClase);
		System.out.println("Corte: " + corte);
		System.out.println("Genero: " + genero);
	}
	@Override
	public void hacerDevolucion() {
		
		System.out.println("Devolucion de Jeans");
	}
}
