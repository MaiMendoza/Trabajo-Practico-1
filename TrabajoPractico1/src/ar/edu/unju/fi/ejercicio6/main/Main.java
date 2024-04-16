package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona= new Persona();
		 Scanner scanner = new Scanner(System.in);
		
		 
	     System.out.println("Ingrese DNI: ");
	     Integer dni = scanner.nextInt();
	     System.out.println("Ingrese Nombre: ");
	     String nombre = scanner.next();
	     System.out.println("Ingrese su fecha de nacimiento (dd-MM-yyyy):");
	     LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());

	     persona.setDni(dni);     
	     persona.setNombre(nombre);
	    
	     
	     System.out.println(persona.toString());
	    
	     
	     
	}

}
