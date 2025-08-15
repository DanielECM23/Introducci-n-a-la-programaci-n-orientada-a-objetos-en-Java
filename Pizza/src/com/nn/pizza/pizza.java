package com.nn.pizza;

public class pizza {
	private String nombre;
	private double costoP;
	private int cantP;
	private double precioV;
	
	
	public class cocinero{
		private pizza pizza1;
		private pizza pizza2;
		private String nombre;
		
		public int darUniPro() {
			return pizza1.darCantP() + pizza2.darCantP();
		}
		
		public cocinero() {
			pizza1 = new pizza ("Carnes", 12000.0, 25000);
		}
	}
	
	public int daCant( ) {
		return daCant();
	}
	
	public void modPre (double nuevoPre) {
		precioV = nuevoPre;
	}
	
	public double darGanU () {
		double resta = precioV - costoP;
		return resta;
	}
	
	public double darGanT () {
		double resta = darGanU();
		return resta * cantP;
	}
	
	public int darCantP() {
		return  cantP;
	}
	
	//constructor
	public pizza (String nNombre, double nCosto, double nPrecio) {
		nombre = nNombre;
		costoP = nCosto;
		precioV = nPrecio;
	}
	
	
	
}
