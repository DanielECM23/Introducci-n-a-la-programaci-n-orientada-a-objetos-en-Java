package com.nn.controlflujo;

public class WhileForForeach {

	public static void main(String[] args) {
		
		//while
		int a = 1;
		while (a <= 5) {
			System.out.println("a: " + a);
			a++; 
		}
		
		//for
		for(int i = 1; i <= 5; i++) {
			System.out.println("i: " + i);
		}
		
		//Array
		int[] miArreglo = new int[5];
		/*miArreglo[0] = 6;
		miArreglo[1] = 6;
		miArreglo[2] = 6;
		miArreglo[3] = 6;
		miArreglo[4] = 6;*/
		
		for(int j=0; j < miArreglo.length; j++) {
			miArreglo[j] = j * 6;
			System.out.println("miArreglo["+j+"] " + miArreglo[j]);
		}
		
		
		//foreach por cada
		for(int i : miArreglo) {
			
			System.out.println(i);
		}
	}

}
