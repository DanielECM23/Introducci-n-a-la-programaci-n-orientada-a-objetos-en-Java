package com.nn.interfaces;


public class Calcetin extends Ropa implements IDevolucion{

	public Calcetin(int id, double precio, String talla, String color) {
		super(id, precio, talla, color);
		
	}

	@Override
	public void hacerDevolucion() {
		
		System.out.println("Devolucion de Calcetin");
	}
	
}
