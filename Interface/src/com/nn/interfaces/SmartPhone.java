package com.nn.interfaces;

public class SmartPhone extends Telefono implements IDevolucion{

	public SmartPhone(int id, double precio, String modelo, String marca, String SIM) {
		super(id, precio, modelo, marca);
		
		this.SIM = SIM;
	}
	
	private String SIM;

	public String getSIM() {
		return SIM;
	}

	public void setSIM(String sIM) {
		SIM = sIM;
	}

	@Override
	public void hacerDevolucion() {
		
		System.out.println("Devolucion de Celular");
	}
	
	
}
