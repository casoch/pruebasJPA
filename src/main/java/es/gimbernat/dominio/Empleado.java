package es.gimbernat.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empleado {
	
	@Id
	private String dni;
	private String nombre;
	private double sueldo;
	
	public Empleado() {
		
	}
	
	public Empleado(String dni, String nombre, double sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
