package com.nn.interfaces;

public class Playera extends Ropa implements IDevolucion{

	public Playera(int id, double precio, String talla, String color, String corte) {
		super(id, precio, talla, color);
		
		this.corte = corte;
	}
	private String corte;
	
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	
	@Override
	public void mostrarDatos(String nombreClase) {
		
		super.mostrarDatos(nombreClase);
		System.out.println("Corte: " + corte);
	}
	@Override
	public void hacerDevolucion() {
		
		System.out.println("Devolucion de una Playera");
	}
}
