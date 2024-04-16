package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Ingrese nombre del empleado:");
	        String nombre = scanner.nextLine();
	        System.out.println("Ingrese legajo:");
	        int legajo = Integer.parseInt(scanner.nextLine());
	        System.out.println("Ingrese salario:");
	        double salario = Double.parseDouble(scanner.nextLine());
	        
	        Empleado empleado = new Empleado(nombre, legajo, salario);
	        
	        System.out.println("\nDatos del empleado:");
	        empleado.mostrar();

	        empleado.darAumento();

	        System.out.println("\nDatos del empleado después del aumento:");
	        empleado.mostrar();
	}

}
