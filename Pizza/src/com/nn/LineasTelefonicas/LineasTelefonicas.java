package com.nn.LineasTelefonicas;

public class LineasTelefonicas {
	private int numLlamadas;
	private int numMinutos;
	private double cosLLamadas;
	
	public class Empresa{
		
		//Atributos
		private LineasTelefonicas linea1;
		private LineasTelefonicas linea2;
		private LineasTelefonicas linea3;
		
		public LineasTelefonicas darLinea1(){
			return linea1; 
		}
		public double darTotalCos() {
			return linea1.daCosLLammadas() + linea2.daCosLLammadas() + linea3.daCosLLammadas();
			
		}

	}
	
	
	
	public void inicializar() {
		numLlamadas = 0;
		numMinutos = 0;
		cosLLamadas = 0.0;
	}
	public double daCosLLammadas () {
		return cosLLamadas;
	}
	public void agreLLamadaLarga() {
		numLlamadas++;
		int minutos = 0;
		numMinutos = numMinutos + minutos;
		cosLLamadas = cosLLamadas + (minutos * 380);
	}
}
