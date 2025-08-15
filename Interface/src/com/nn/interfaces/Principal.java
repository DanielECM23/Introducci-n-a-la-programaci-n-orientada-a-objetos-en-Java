package com.nn.interfaces;

public class Principal {

	public static void main(String[] args) {
		Playera playera = new Playera (1, 299.5, "CH", "Gris", "Polo");
		PlayeraPersonalizada  PlayeraPersonalizada= new PlayeraPersonalizada (4, 499.5, "M", "Negro", "@anncode");
		Jean jeans = new Jean (2, 987.5, "32", "Azul", "Skinny", 'F');
		Calcetin calcetin = new Calcetin (3, 29, "M", "Rojo");
		
		playera.mostrarDatos("Playera Gris");
		PlayeraPersonalizada.mostrarDatos("Playera @anncodde");
		jeans.mostrarDatos("Jeans Mujer");
		calcetin.mostrarDatos("Calcetines");

		playera.hacerDevolucion();
		jeans.hacerDevolucion();
		
		SmartPhone smartPhone = new SmartPhone(5, 7999, "Motorola", "Moto G", "Telefonica");
		smartPhone.hacerDevolucion();
		
	}

}
