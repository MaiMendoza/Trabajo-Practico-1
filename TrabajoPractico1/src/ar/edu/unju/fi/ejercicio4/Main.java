package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.print("Ingrese un numero  [0,10]: ");
		int num=obj.nextInt();
		
		long factorial=1;
		int k=1;
		while (num<=10 && num>0 && k <= num) {
            factorial *= k; 
            k++; 
        }
		System.out.println("El factorial de " + num + " es: " + factorial);
	
	}

}
