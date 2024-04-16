package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.print("Ingrese un numero entre [1,9]: ");
		int num=obj.nextInt();
		
		if(num>1&& num<9) {
			for(int i=1; i<=9;i++) {
				int tab= num*i;
				System.out.println( num + " * "+ i +"= "+ tab);
				
			}
		}else {
			
			System.out.println( "ERROR!! Numero fuera de rango");
			
		}
		
		
	}

}
