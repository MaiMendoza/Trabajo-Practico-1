package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.print("\nIngrese un numero: ");
		int num=obj.nextInt();
		
		if (num/2==0) {
			int t=num*3;
			System.out.print("El triple de "+num+" es: "+t);	
		}else {
			int d= num*2;
			System.out.print("El doble de "+num+" es: "+d);
		}
	}

}
