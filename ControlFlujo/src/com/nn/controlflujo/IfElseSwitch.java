package com.nn.controlflujo;

public class IfElseSwitch {

	public static void main(String[] args) {
		
		//if, Else
		// Obtener el numero mayor
		int a = 5; 
		int b = 5; 
		
		if (a > b) {
			//true
			System.out.println("a es MAYOR");
		}else if (b > a){
			//false
			System.out.println("b es MAYOR");
		}else if (a == b) {
			System.out.println("a y b son IGUALES");
		}
		
		//SWITCH
		
		int c = 1010;
		
		switch (c) {
		case 1005:
			System.out.println("c es 1005");
			break;
		case 1006:
			System.out.println("c es 1006");
			break;
		case 1007:
			System.out.println("c es 1007");
			break;
		case 1008:
			System.out.println("c es 1008");
			break;
		case 1009:
			System.out.println("c es 1009");
			break;
		default:
			System.out.println("no se encuentra " + c);
		}
		
		
	}

}
