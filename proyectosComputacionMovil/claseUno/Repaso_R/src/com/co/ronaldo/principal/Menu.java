package com.co.ronaldo.principal;

import java.util.Scanner;

import com.co.ronaldo.principal.implementaciones.Dividir;
import com.co.ronaldo.principal.implementaciones.Multiplicar;
import com.co.ronaldo.principal.implementaciones.Restar;
import com.co.ronaldo.principal.implementaciones.Sumar;

public class Menu {

	Scanner sc = new Scanner(System.in);
	
	public void mostrarMenu() {
		
		System.out.println("Digite el primer numero");
		double numUno =sc.nextDouble();
		
		System.out.println("Digite el segundo numero");
		double numDos =sc.nextDouble();
		
		System.out.println("Que operacion desea realizar");
		int selection = sc.nextInt();
		
		switch (selection) {
		
		case 1: {
			
			Sumar sm = new Sumar();
			sm.sumar(numDos, numDos);	
			break;
		}
		case 2: {
			Restar rs = new Restar();
			rs.restar(numDos, numDos);	
			break;
		}
		case 3: {
			Multiplicar mt = new Multiplicar();
			mt.multiplicar(numDos, numDos);	
			break;
		}
		case 4: {
			Dividir div = new Dividir();
			div.dividir(numDos, numDos);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selection);
		}
	}
	
}
