package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
   private String nombre;
   private Integer legajo;
   private Double salario;
   private static final double salarioMIN = 210000.00;
   private static final double aumento= 20000.00;
   
   public Empleado(String nombre, int legajo, double salario) {
       this.nombre = nombre;
       this.legajo = legajo;
       if (salario >= salarioMIN) {
           this.salario = salario;
       } else {
           this.salario = salarioMIN;
       }
   }
   public void darAumento() {
       this.salario += aumento;
   }
   public void mostrar() {
       
       System.out.println("Nombre del empleado: " + nombre);
       System.out.println("Legajo: " + legajo);
       System.out.println("Salario $: " + salario);
   }
  
   
}
