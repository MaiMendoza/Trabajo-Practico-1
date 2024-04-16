package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private Integer dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia= "JUJUY";
	
    public Persona() {
		
	}
	
	public Persona(Integer dni, String nombre, LocalDate fecha, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fecha;
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", provincia="
				+ provincia + "Edad: " + calcularEdad()+
				"]";
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	
	public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, fechaActual);
        return periodo.getYears();
        
    }
	
	public Boolean esMayor() {
		
		return calcularEdad()>18;
	}
	
	
	
	
	

}
