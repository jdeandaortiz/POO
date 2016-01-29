/**
 * 
 */
package mx.edu.utng.herencias;

import java.util.Date;

/**
 * @author Jesús Deanda Ortiz
 * @description Clase para establecer una Persona
 */
public class Persona {
	private Date  fechaNacimiento;
	private String nombre;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
