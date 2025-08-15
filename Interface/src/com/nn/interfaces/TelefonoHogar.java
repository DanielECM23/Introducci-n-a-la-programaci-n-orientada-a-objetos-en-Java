package com.nn.interfaces;

public class TelefonoHogar extends Telefono implements IDevolucion{

	
	public TelefonoHogar(int id, double precio, String modelo, String marca, boolean alambrico) {
		super(id, precio, modelo, marca);
		
		
		this.alambrico = alambrico;
	}

	private boolean alambrico;

	public boolean isAlambrico() {
		return alambrico;
	}

	public void setAlambrico(boolean alambrico) {
		this.alambrico = alambrico;
	}

	@Override
	public void hacerDevolucion() {
		
		System.out.println("Devolucion de Telefono Hogar");
	}
	
}
